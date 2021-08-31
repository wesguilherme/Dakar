package com.company.model;

public abstract class Veiculo {

    private Integer velocidade;
    private Double aceleracao;
    private Integer anguloDeVirada;
    private String patente;
    private Double peso;
    private Integer rodas;
    private String placa;

    public Veiculo(Integer velocidade, Double aceleracao, Integer anguloDeVirada, String patente, Double peso, Integer rodas, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.patente = patente;
        this.peso = peso;
        this.rodas = rodas;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAceleração() {
        return aceleracao;
    }

    public void setAceleração(Double aceleração) {
        this.aceleracao = aceleração;
    }

    public Integer getAnguloDeVirada() {
        return anguloDeVirada;
    }

    public void setAnguloDeVirada(Integer anguloDeVirada) {
        this.anguloDeVirada = anguloDeVirada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}