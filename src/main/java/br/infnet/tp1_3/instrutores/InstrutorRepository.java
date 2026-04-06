package br.infnet.tp1_3.instrutores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import java.util.Optional;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    Optional<Instrutor> findByCpf(String cpf);

    @Transactional
    void deleteByCpf(String cpf);
}