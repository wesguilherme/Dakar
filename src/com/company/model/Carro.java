package com.company.model;

public class Carro extends Veiculo {
    private static final double PESO_CARRO = 1000d;
    private static final int RODAS = 4;

    public Carro(Integer velocidade, Double aceleração, Integer anguloDeVirada, String patente, String placa) {
        super(velocidade, aceleração, anguloDeVirada, patente, PESO_CARRO, RODAS, placa);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}