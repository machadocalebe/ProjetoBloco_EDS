package br.infnet.tp1_3.alunos;
import br.infnet.tp1_3.instrutores.Instrutor;
import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    private String categoriaDesejada;


    public Aluno() {}

    public Aluno(String nome, String cpf, String categoriaDesejada) {
        this.nome = nome;
        this.cpf = cpf;
        this.categoriaDesejada = categoriaDesejada;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoriaDesejada() { return categoriaDesejada; }
    public void setCategoriaDesejada(String categoriaDesejada) { this.categoriaDesejada = categoriaDesejada; }


    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Instrutor instrutor;


    public Instrutor getInstrutor() { return instrutor; }
    public void setInstrutor(Instrutor instrutor) { this.instrutor = instrutor; }
}