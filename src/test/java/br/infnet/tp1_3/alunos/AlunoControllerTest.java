package br.infnet.tp1_3.alunos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AlunoControllerTest {

    @Mock
    private AlunoService service;

    @InjectMocks
    private AlunoController controller;

    @Test
    void deveTestarTodosOsEndpointsDoController() {
        Aluno aluno = new Aluno("Teste", "123", "B");

        // Testa o POST (Cadastrar)
        ResponseEntity<String> resPost = controller.cadastrar(aluno);
        Assertions.assertEquals(HttpStatus.CREATED, resPost.getStatusCode());

        // Testa o GET (Listar)
        Mockito.when(service.listarTodos()).thenReturn(Arrays.asList(aluno));
        ResponseEntity<List<Aluno>> resGet = controller.listar();
        Assertions.assertEquals(HttpStatus.OK, resGet.getStatusCode());
        Assertions.assertEquals(1, resGet.getBody().size());

        // Testa o DELETE (Remover)
        ResponseEntity<Void> resDel = controller.remover("123");
        Assertions.assertEquals(HttpStatus.NO_CONTENT, resDel.getStatusCode());
    }
}