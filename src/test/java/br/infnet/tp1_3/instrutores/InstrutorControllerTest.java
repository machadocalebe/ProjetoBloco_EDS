package br.infnet.tp1_3.instrutores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.math.BigDecimal;

@ExtendWith(MockitoExtension.class)
public class InstrutorControllerTest {

    @Mock
    private InstrutorService service;

    @InjectMocks
    private InstrutorController controller;

    @Test
    void deveRetornarStatusCreatedAoCadastrar() {
        Instrutor instrutor = new Instrutor("Giovani", "12345678900", "CNH12345", new BigDecimal("100.00"));

        ResponseEntity<Void> response = controller.cadastrar(instrutor);

        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());

    }

    @Test
    void deveTestarListagemERemocao() {
        // Testando o GET
        Mockito.when(service.listarTodos()).thenReturn(java.util.Arrays.asList(new Instrutor()));
        ResponseEntity<java.util.List<Instrutor>> resGet = controller.listar();
        Assertions.assertEquals(HttpStatus.OK, resGet.getStatusCode());

        // Testando o DELETE
        ResponseEntity<Void> resDel = controller.remover("123");
        Assertions.assertEquals(HttpStatus.NO_CONTENT, resDel.getStatusCode());
    }
}