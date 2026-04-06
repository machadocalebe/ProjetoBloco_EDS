package br.infnet.tp1_3.alunos;

import br.infnet.tp1_3.instrutores.Instrutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    void deveTestarGettersESettersEConstrutores() {
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("Calebe");
        aluno.setCpf("12345678900");
        aluno.setCategoriaDesejada("B");

        Instrutor instrutor = new Instrutor();
        aluno.setInstrutor(instrutor);

        Assertions.assertEquals(1L, aluno.getId());
        Assertions.assertEquals("Calebe", aluno.getNome());
        Assertions.assertEquals("12345678900", aluno.getCpf());
        Assertions.assertEquals("B", aluno.getCategoriaDesejada());
        Assertions.assertEquals(instrutor, aluno.getInstrutor());

        Aluno alunoComConstrutor = new Aluno("João", "111", "A");
        Assertions.assertEquals("João", alunoComConstrutor.getNome());
    }
}