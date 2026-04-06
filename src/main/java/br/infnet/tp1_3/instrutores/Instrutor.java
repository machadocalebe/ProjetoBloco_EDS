package br.infnet.tp1_3.instrutores;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    // Adicionamos o registro da CNH de volta!
    @Column(unique = true)
    private String registroCnh;

    private BigDecimal precoPorAula;

    public Instrutor() {}


    public Instrutor(String nome, String cpf, String registroCnh, BigDecimal precoPorAula) {
        this.nome = nome;
        this.cpf = cpf;
        this.registroCnh = registroCnh;
        this.precoPorAula = precoPorAula;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRegistroCnh() { return registroCnh; }
    public void setRegistroCnh(String registroCnh) { this.registroCnh = registroCnh; }

    public BigDecimal getPrecoPorAula() { return precoPorAula; }
    public void setPrecoPorAula(BigDecimal precoPorAula) { this.precoPorAula = precoPorAula; }
}