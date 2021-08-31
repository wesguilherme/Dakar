package com.company.model;

public class Moto extends Veiculo {
    private static final double PESO_CARRO = 300d;
    private static final int RODAS = 2;

    public Moto(Integer velocidade, Double aceleração, Integer anguloDeVirada, String patente, String placa) {
        super(velocidade, aceleração, anguloDeVirada, patente, PESO_CARRO, RODAS, placa);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}