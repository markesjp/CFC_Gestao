/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author jhon_
 */
public class ClienteCnh extends Pessoa {

    private Date dataCadastro;
    private double orcamento;
    private double valorPago;
    private String formaPagamento;
    private String catPretendida;
    private int qntAulasPossuidas;
    private int qntAulasFeitas;
    private boolean concluido;

    public ClienteCnh() {
        this.setDataCadastro();
        this.valorPago = 0;
        this.qntAulasFeitas = 0;
        this.setConcluido(false);
    }

    public String getCatPretendida() {
        return catPretendida;
    }

    public void setCatPretendida(String catPretendida) {
        this.catPretendida = catPretendida;
    }

    public int getQntAulasPossuidas() {
        return qntAulasPossuidas;
    }

    public void setQntAulasPossuidas(int qntAulasPossuidas) {
        this.qntAulasPossuidas = qntAulasPossuidas;
    }

    public int getQntAulasFeitas() {
        return qntAulasFeitas;
    }

    public void setQntAulasFeitas(int qntAulasFeitas) {
        this.qntAulasFeitas = qntAulasFeitas;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    private void setDataCadastro() {
        this.dataCadastro = new Date();
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public int fazerAula() {
        if (this.qntAulasPossuidas > 0) {
            this.qntAulasPossuidas--;
            this.qntAulasFeitas++;
            return 1;
        } else {
            return 0;
        }
    }
    
    public int pagar(double valor){
        if(this.valorPago + valor <= this.orcamento){
            this.valorPago += valor;
            return 1;
        }
        return 0;
    }
    
    public void comprarAula(int qnt) {        
        if (this.catPretendida.equals("ÔNIBUS")) {
            this.orcamento += (qnt * 50);
        } else {
            this.orcamento += (qnt * 65);
        }
        this.qntAulasPossuidas+=qnt;
    }
    
    public void adicionarAluguel(){
        if(this.catPretendida.equals("ÔNIBUS")){
            this.orcamento += (220);
        } else 
            this.orcamento += (150);
    }

    public void concluir() {
        this.concluido = true;
    }

}
