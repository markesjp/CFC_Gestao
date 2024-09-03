/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author jhon_
 */
public class Veiculo {

    private int id;
    private String placa;
    private String renavam;
    private String cor;
    private String modelo;
    private String chassi;
    private int validade;
    private int ano;
    private boolean docPago;
    private String tipo;

    public Veiculo(int id, String placa, String renavam, String cor, String modelo, String chassi, int validade, int ano, boolean docPago, String tipo) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = modelo;
        this.chassi = chassi;
        this.validade = validade;
        this.ano = ano;
        this.docPago = docPago;
        this.tipo = tipo;
    }

    public Veiculo() {
        this.docPago = true;
        this.setValidade();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade() {
        this.validade = this.ano + 8;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDocPago() {
        return docPago;
    }

    public void setDocPago(boolean docPago) {
        this.docPago = docPago;
    }

    @Override
    public String toString() {
        return this.getPlaca();
    }

}
