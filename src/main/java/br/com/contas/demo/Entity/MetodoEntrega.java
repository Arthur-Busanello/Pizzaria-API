package br.com.contas.demo.Entity;

public enum MetodoEntrega {
    DELIVERY(0),
    BALCAO(1);

    private final int value;

    MetodoEntrega(int value) {
        this.value = value;
    }
}
