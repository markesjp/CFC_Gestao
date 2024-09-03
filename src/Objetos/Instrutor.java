package Objetos;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jhon_
 */
public class Instrutor extends Funcionario {

    private String credencial;
    private Date dataPCnh;
    private int aulasDadas;
    private String diretor;

    public Instrutor() {
        
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public Date getDataPCnh() {
        return dataPCnh;
    }

    public void setDataPCnh(Date dataPCnh) {
        this.dataPCnh = dataPCnh;
    }

    public int getAulasDadas() {
        return aulasDadas;
    }

    public void setAulasDadas(int aulasDadas) {
        this.aulasDadas = aulasDadas;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void setSalario(){
        super.salario = (1320 + (this.aulasDadas*10));
        if (this.diretor.equals("GERAL")) {
            super.salario += 400;
        } else if (this.diretor.equals("ENSINO")) {
            super.salario += 200;
        }
    }
    
    public void resetarAulas(){
        this.setAulasDadas(0);
    }
    
    public void darAula(){
        aulasDadas++;
    }


}
