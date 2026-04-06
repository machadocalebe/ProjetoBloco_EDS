package br.infnet.tp1_3.alunos;

public enum CategoriaCNH {
    A, B, AB;


    public String getDescricaoVeiculo() {
        return switch (this) {
            case A -> "Motocicleta";
            case B -> "Carro de Passeio";
            case AB -> "Motocicleta e Carro de Passeio";
        };
    }
}
