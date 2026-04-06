package br.infnet.tp1_3.instrutores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class InstrutorTest {

    @Test
    void deveTestarGettersESettersEConstrutores() {
        Instrutor instrutor = new Instrutor();
        instrutor.setId(1L);
        instrutor.setNome("Giovani");
        instrutor.setCpf("12345678900");
        instrutor.setRegistroCnh("CNH123");
        instrutor.setPrecoPorAula(new BigDecimal("100.00"));

        Assertions.assertEquals(1L, instrutor.getId());
        Assertions.assertEquals("Giovani", instrutor.getNome());
        Assertions.assertEquals("12345678900", instrutor.getCpf());
        Assertions.assertEquals("CNH123", instrutor.getRegistroCnh());
        Assertions.assertEquals(new BigDecimal("100.00"), instrutor.getPrecoPorAula());

        Instrutor instrutorComConstrutor = new Instrutor("Patrick", "222", "CNH2", new BigDecimal("80"));
        Assertions.assertEquals("Patrick", instrutorComConstrutor.getNome());
    }
}