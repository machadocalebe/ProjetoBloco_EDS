package br.infnet.tp1_3.instrutores;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InstrutorService {

    private final InstrutorRepository repository;

    public InstrutorService(InstrutorRepository repository) {
        this.repository = repository;
    }

    public void cadastrarInstrutor(Instrutor instrutor) {
        repository.save(instrutor);
    }

    public List<Instrutor> listarTodos() {
        return repository.findAll();
    }

    public void removerPorCpf(String cpf) {
        repository.deleteByCpf(cpf);
    }
}