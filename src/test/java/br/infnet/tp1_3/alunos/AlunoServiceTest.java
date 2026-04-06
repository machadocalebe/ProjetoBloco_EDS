package br.infnet.tp1_3.alunos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AlunoServiceTest {

    @Mock
    private AlunoRepository repository;

    @InjectMocks
    private AlunoService service;

    @Test
    void deveCadastrarAlunoComSucesso() {

        Aluno novoAluno = new Aluno("Calebe Machado", "12345678900", "B");


        service.cadastrarAluno(novoAluno);


        Mockito.verify(repository, Mockito.times(1)).save(novoAluno);
    }

    @Test
    void deveListarTodosOsAlunos() {

        Aluno a1 = new Aluno("João", "11111111111", "A");
        Aluno a2 = new Aluno("Maria", "22222222222", "B");
        Mockito.when(repository.findAll()).thenReturn(Arrays.asList(a1, a2));


        List<Aluno> lista = service.listarTodos();


        Assertions.assertEquals(2, lista.size());
        Assertions.assertEquals("João", lista.get(0).getNome());
        Mockito.verify(repository, Mockito.times(1)).findAll();
    }

    @Test
    void deveRemoverAlunoPorCpf() {

        service.removerPorCpf("12345678900");


        Mockito.verify(repository, Mockito.times(1)).deleteByCpf("12345678900");
    }
}