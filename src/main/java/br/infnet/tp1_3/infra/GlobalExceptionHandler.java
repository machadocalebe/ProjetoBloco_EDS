package br.infnet.tp1_3.infra;

import br.infnet.tp1_3.instrutores.InstrutorInvalidoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InstrutorInvalidoException.class)
    public ResponseEntity<Map<String, String>> lidarComInstrutorInvalido(InstrutorInvalidoException ex) {
        Map<String, String> erro = new HashMap<>();
        erro.put("erro", "Validação Falhou");
        erro.put("mensagem", ex.getMessage());


        return ResponseEntity.badRequest().body(erro);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> lidarComArgumentoInvalido(IllegalArgumentException ex) {
        Map<String, String> erro = new HashMap<>();
        erro.put("erro", "Requisição Inválida");
        erro.put("mensagem", ex.getMessage());

        return ResponseEntity.badRequest().body(erro);
    }
}