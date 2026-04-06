package br.infnet.tp1_3.instrutores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class InstrutorServiceTest {

    @Mock
    private InstrutorRepository repository;

    @InjectMocks
    private InstrutorService service;

    @Test
    void deveCadastrarInstrutorComSucesso() {

        Instrutor novoInstrutor = new Instrutor("Giovani", "12345678900", "CNH98765", new BigDecimal("100.00"));

        service.cadastrarInstrutor(novoInstrutor);

        Mockito.verify(repository, Mockito.times(1)).save(novoInstrutor);
    }

    @Test
    void deveListarTodosOsInstrutores() {
        Instrutor i1 = new Instrutor("Patrick", "11111111111", "CNH111", new BigDecimal("80.0"));
        Mockito.when(repository.findAll()).thenReturn(Arrays.asList(i1));

        List<Instrutor> lista = service.listarTodos();

        Assertions.assertEquals(1, lista.size());
        Assertions.assertEquals("Patrick", lista.get(0).getNome());
    }

    @Test
    void deveRemoverInstrutorPorCpf() {
        service.removerPorCpf("11111111111");
        Mockito.verify(repository, Mockito.times(1)).deleteByCpf("11111111111");
    }
}