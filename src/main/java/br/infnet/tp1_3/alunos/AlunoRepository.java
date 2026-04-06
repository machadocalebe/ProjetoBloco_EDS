package br.infnet.tp1_3.alunos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    Optional<Aluno> findByCpf(String cpf);


    @Transactional
    void deleteByCpf(String cpf);
}