/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedrinho
 */
public class ConsultaDAO {

    public static ResultSet carregaCliente(String tipo, String arg)  {
        try {
            String argumento = tipo + " " + "like'" + arg + "%'";
            
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,dataNasc,cpf,rg, sexo, endereco,celular,orcamento,valorPago,dataCadastro, "
                            + "catPretendida, qntAulasPossuidas, qntAulasfeitas,formaPagamento,concluido "
                            + "FROM cliente where " + argumento + "");
            
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaCliente()  {
        try {
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,dataNasc,cpf,rg, sexo, endereco,celular,orcamento,"
                            + "valorPago,dataCadastro,catPretendida, qntAulasPossuidas, "
                            + "qntAulasfeitas,formaPagamento,concluido FROM Cliente ORDER BY id");
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaInstrutor(String tipo, String arg){
        try {
            String argumento = tipo + " " + "like'" + arg + "%'";
            
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,cpf,dataNasc,credencial, datapcnh,aulasDadas,celular,"
                            + "rg,ctps,salario, dataAdmissao, "
                            + "diretor,sexo,endereco FROM instrutor " + argumento + "");
            
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaInstrutor() {
        try {
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,cpf,dataNasc,credencial, datapcnh,aulasDadas,celular,"
                            + "rg,ctps,salario, dataAdmissao, "
                            + "diretor,sexo,endereco FROM instrutor ORDER BY id");
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaSecretario(String tipo, String arg){
        try {
            String argumento = tipo + " " + "like'" + arg + "%'";
            
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,cpf,dataNasc,celular,"
                            + "rg,ctps,salario, dataAdmissao, "
                            + "sexo,endereco FROM secretario where " + argumento + "");
            
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaSecretario() {
        try {
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,cpf,dataNasc,celular,"
                            + "rg,ctps,salario, dataAdmissao, "
                            + "sexo,endereco FROM secretario ORDER BY id");
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaVeiculo(String tipo, String arg){
        try {
            String argumento = tipo + " " + "like'" + arg + "%'";
            
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,placa,renavam,cor,modelo, chassi, validade,ano,docpago,tipo FROM veiculo where " + argumento + "");
            
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaVeiculo() {
        try {
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,placa,renavam,cor,modelo, chassi, validade,ano,docpago,tipo FROM veiculo ORDER BY id");
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaAula(String tipo, String arg) {
        try {
            String argumento = tipo + " " + "= '" + arg + "'";
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,data,horario,id_veiculo,id_instrutor, id_cliente, concretizada FROM aula where " + argumento + "");
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

    public static ResultSet carregaAula(){
        try {
            Conexao conexao = new Conexao();
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT id,data,horario,id_veiculo,id_instrutor, id_cliente, concretizada FROM aula ORDER BY id");
            ResultSet rs = pstmt.executeQuery();
            conexao.getConexaoClose();
            return rs;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro de consulta:"+ ex);
        }
        return null;
    }

}
