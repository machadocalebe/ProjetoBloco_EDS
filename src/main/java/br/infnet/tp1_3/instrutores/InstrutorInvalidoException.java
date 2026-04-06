package br.infnet.tp1_3.instrutores;

public class InstrutorInvalidoException extends RuntimeException {
    public InstrutorInvalidoException(String mensagem) {
        super(mensagem);
    }
}