package com.company.model;

import java.util.HashMap;

public class Corrida {

    private Double distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeDeVeiculosPermitidos;
    private HashMap<String, Object> listaDeVeiculos = new HashMap<String, Object>();

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    public void adicionarCarro(Integer velocidade, Double aceleracao, Integer anguloDeVirada, String placa, String patente) {
        if (listaDeVeiculos.size() < quantidadeDeVeiculosPermitidos) {
            Carro car = new Carro(velocidade, aceleracao, anguloDeVirada, patente, placa);
            listaDeVeiculos.put(placa, car);
        } else {
            System.out.println("Limite de inscrições foi atingindo!");
        }
    }

    public void adicionarMoto(Integer velocidade, Double aceleracao, Integer anguloDeVirada, String placa, String patente) {
        if (listaDeVeiculos.size() < quantidadeDeVeiculosPermitidos) {
            Moto moto = new Moto(velocidade, aceleracao, anguloDeVirada, patente, placa);
            listaDeVeiculos.put(placa, moto);
        } else {
            System.out.println("Limite de inscrições foi atingindo!");
        }
    }

    public Veiculo gerarCorrida() {

        Double vencedor = -1d;
        Veiculo veiculo = null;

        for (Object item : listaDeVeiculos.values()) {
            Veiculo it = (Veiculo) item;

            double formula = it.getVelocidade() * 1 / 2 * it.getAceleração() / (it.getAnguloDeVirada() * (it.getPeso() - it.getRodas() * 100));

            if (vencedor == -1 || vencedor < formula) {
                vencedor = formula;
                veiculo = it;
            }
        }

        return veiculo;
    }

    public void mostrarVeiculos() {
        for (Object listaEntry : listaDeVeiculos.values()) {
            Veiculo item = (Veiculo) listaEntry;
            System.out.println("Veículo:" + item.getPatente() + " => " + item.getPlaca() + " => " + item.getPeso());
        }
    }

    public Object resgatarVeiculo(String placa) {
        return listaDeVeiculos.get(placa);
    }

    public HashMap<String, Object> removerVeiculo(String placa) {
        listaDeVeiculos.remove(placa);
        return listaDeVeiculos;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(Double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDeVeiculosPermitidos() {
        return quantidadeDeVeiculosPermitidos;
    }

    public void setQuantidadeDeVeiculosPermitidos(Integer quantidadeDeVeiculosPermitidos) {
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }
}