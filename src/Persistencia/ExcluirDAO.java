/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedrinho
 */
public class ExcluirDAO {

    public boolean ExcluirCliente(int cod) {
        try {
            Conexao conexao = new Conexao();
            int registros;
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("delete from cliente where id=?");
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
            return registros == 1;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de exclusão:" + ex);
        }
        return false;
    }

    public boolean ExcluirInstrutor(int cod) {
        try {
            Conexao conexao = new Conexao();
            int registros;
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("delete from instrutor where id=?");
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
            return registros == 1;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de exclusão:" + ex);
        }
        return false;
    }

    public boolean ExcluirSecretario(int cod) {
        try {
            Conexao conexao = new Conexao();
            int registros;
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("delete from secretario where id=?");
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
            return registros == 1;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de exclusão:" + ex);
        }
        return false;
    }

    public boolean ExcluirVeiculo(int cod) {
        try {
            Conexao conexao = new Conexao();
            int registros;
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("delete from veiculo where id=?");
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
            return registros == 1;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de exclusão:" + ex);
        }
        return false;
    }

    public boolean ExcluirAula(int cod) {
        try {
            Conexao conexao = new Conexao();
            int registros;
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("delete from aula where id=?");
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
            return registros == 1;
        } catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de exclusão:" + ex);
        }
        return false;
    }

}
