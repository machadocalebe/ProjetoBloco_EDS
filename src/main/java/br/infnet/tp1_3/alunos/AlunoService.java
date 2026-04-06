package br.infnet.tp1_3.alunos;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;


    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }


    public void cadastrarAluno(Aluno aluno) {
        repository.save(aluno);
    }


    public List<Aluno> listarTodos() {
        return repository.findAll();
    }


    public void removerPorCpf(String cpf) {
        repository.deleteByCpf(cpf);
    }
}