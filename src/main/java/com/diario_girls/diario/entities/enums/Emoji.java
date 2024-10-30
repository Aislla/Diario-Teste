package com.diario_girls.diario.entities.enums;

public enum Emoji {
    
    SORRISO(":)"),
    TRISTE(":("),
    PISCANDO(";)"),
    CHORANDO(":'("),
    APAIXONADO("<3");

    private String simbolo;

    // Construtor para associar um símbolo ao emoji
    Emoji(String simbolo) {
        this.simbolo = simbolo;
    }

    // Getter para o símbolo
    public String getSimbolo() {
        return simbolo;
    }
}

