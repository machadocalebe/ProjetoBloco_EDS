package br.infnet.tp1_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void deveRodarMainSemErros() {
        Assertions.assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}