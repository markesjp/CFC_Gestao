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
public class Aula {

    private int id;
    private Date data;
    private String horario;
    private Veiculo veiculo;
    private Instrutor instrutor;
    private ClienteCnh cliente;
    private boolean concretizada;
    private boolean motoPista;

    public Aula(int id, Date data, String horario, Veiculo veiculo, Instrutor instrutor, ClienteCnh cliente, boolean concretizada) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.veiculo = veiculo;
        this.instrutor = instrutor;
        this.cliente = cliente;
        this.concretizada = concretizada;
    }

    public Aula() {
        this.concretizada = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;

    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        if (veiculo.getTipo().equals("MOTO")) {
            this.motoPista = true;
        }
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ClienteCnh getCliente() {
        return cliente;
    }

    public void setCliente(ClienteCnh cliente) {
        this.cliente = cliente;
    }

    public void setConcretizada(boolean concretizada) {
        this.concretizada = concretizada;
    }

    public boolean getConcretizada() {
        return concretizada;
    }

    public boolean isMotoPista() {
        return motoPista;
    }

    public void setMotoPista(boolean motoPista) {
        this.motoPista = motoPista;
    }
    
    @Override
    public String toString() {
        String str;
        if (this.motoPista) {
            str = "Moto-Pista";
        } else {
            if (this.cliente == null) {
                str = "";
            } else {
                if (concretizada == false) {
                    str = "N ";
                } else {
                    str = "OK ";
                }
                str = str + this.cliente.getNome();
            }
        }
        return str;
    }

}
