/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import Objetos.ClienteCnh;
import Objetos.Instrutor;
import Objetos.Secretario;
import Objetos.Aula;
import Objetos.Parametros;
import Objetos.Veiculo;

/**
 *
 * @author Pedrinho
 */
public class IncluirEditarDAO {

    public int Incluir(ClienteCnh objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO cliente("
                + "nome,dataNasc,cpf,rg, sexo, endereco,celular,orcamento,valorPago,dataCadastro, "
                + "catPretendida, qntAulasPossuidas, qntAulasfeitas,formaPagamento,concluido)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")) {
            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setTimestamp(2, new java.sql.Timestamp(objpes.getDataNasc().getTime()));
            pstmt.setString(3, objpes.getCpf().toUpperCase().trim());
            pstmt.setString(4, objpes.getRg().toUpperCase().trim());
            pstmt.setString(5, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(6, objpes.getEnd().toUpperCase().trim());
            pstmt.setString(7, objpes.getCelular().toUpperCase().trim());
            pstmt.setDouble(8, objpes.getOrcamento());
            pstmt.setDouble(9, objpes.getValorPago());
            pstmt.setTimestamp(10, new java.sql.Timestamp(objpes.getDataCadastro().getTime()));
            pstmt.setString(11, objpes.getCatPretendida().toUpperCase().trim());
            pstmt.setInt(12, objpes.getQntAulasPossuidas());
            pstmt.setInt(13, objpes.getQntAulasFeitas());
            pstmt.setString(14, objpes.getFormaPagamento().toUpperCase().trim());
            pstmt.setBoolean(15, objpes.isConcluido());
            registros = pstmt.executeUpdate();

        }
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT MAX(id) from cliente");
        ResultSet rs = pstmtAux.executeQuery();
        conexao.getConexaoClose();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }

    public boolean Editar(ClienteCnh objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update cliente "
                + "set nome = ?,dataNasc = ?,cpf = ?,"
                + "rg = ?, sexo = ?, endereco = ?,celular = ?,orcamento = ?,valorPago = ?,dataCadastro = ?, "
                + "catPretendida = ?, qntAulasPossuidas = ?, qntAulasfeitas  = ?, formaPagamento = ?, concluido = ? where id=?")) {

            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setTimestamp(2, new java.sql.Timestamp(objpes.getDataNasc().getTime()));
            pstmt.setString(3, objpes.getCpf().toUpperCase().trim());
            pstmt.setString(4, objpes.getRg().toUpperCase().trim());
            pstmt.setString(5, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(6, objpes.getEnd().toUpperCase().trim());
            pstmt.setString(7, objpes.getCelular().toUpperCase().trim());
            pstmt.setDouble(8, objpes.getOrcamento());
            pstmt.setDouble(9, objpes.getValorPago());
            pstmt.setTimestamp(10, new java.sql.Timestamp(objpes.getDataCadastro().getTime()));
            pstmt.setString(11, objpes.getCatPretendida().toUpperCase().trim());
            pstmt.setInt(12, objpes.getQntAulasPossuidas());
            pstmt.setInt(13, objpes.getQntAulasFeitas());
            pstmt.setString(14, objpes.getFormaPagamento().toUpperCase().trim());
            pstmt.setBoolean(15, objpes.isConcluido());
            pstmt.setInt(16, objpes.getId());
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();

        }
        return registros == 1;
    }
    // 

    public int Incluir(Instrutor objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO instrutor("
                + "nome,dataNasc,cpf,rg, sexo, endereco,celular, salario, dataAdmissao, ctps, "
                + "credencial, datapCnh, aulasDadas,diretor)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)")) {
            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setTimestamp(2, new java.sql.Timestamp(objpes.getDataNasc().getTime()));
            pstmt.setString(3, objpes.getCpf().toUpperCase().trim());
            pstmt.setString(4, objpes.getRg().toUpperCase().trim());
            pstmt.setString(5, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(6, objpes.getEnd().toUpperCase().trim());
            pstmt.setString(7, objpes.getCelular().toUpperCase().trim());
            pstmt.setDouble(8, objpes.getSalario());
            pstmt.setTimestamp(9, new java.sql.Timestamp(objpes.getDataAdmissao().getTime()));
            pstmt.setString(10, objpes.getCtps().toUpperCase().trim());
            pstmt.setString(11, objpes.getCredencial().toUpperCase().trim());
            pstmt.setTimestamp(12, new java.sql.Timestamp(objpes.getDataPCnh().getTime()));
            pstmt.setInt(13, objpes.getAulasDadas());
            pstmt.setString(14, objpes.getDiretor().toUpperCase().trim());
            registros = pstmt.executeUpdate();

        }
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT MAX(id) from instrutor");
        ResultSet rs = pstmtAux.executeQuery();
        conexao.getConexaoClose();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }

    public boolean Editar(Instrutor objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update instrutor set nome = ?,dataNasc= ?,cpf= ?,"
                + "rg= ?, sexo= ?, endereco= ?,celular= ?, salario= ?, dataAdmissao= ?, ctps= ?, "
                + "credencial= ?, datapCnh= ?, aulasDadas= ?,diretor = ? where id=?")) {

            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setTimestamp(2, new java.sql.Timestamp(objpes.getDataNasc().getTime()));
            pstmt.setString(3, objpes.getCpf().toUpperCase().trim());
            pstmt.setString(4, objpes.getRg().toUpperCase().trim());
            pstmt.setString(5, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(6, objpes.getEnd().toUpperCase().trim());
            pstmt.setString(7, objpes.getCelular().toUpperCase().trim());
            pstmt.setDouble(8, objpes.getSalario());
            pstmt.setTimestamp(9, new java.sql.Timestamp(objpes.getDataAdmissao().getTime()));
            pstmt.setString(10, objpes.getCtps().toUpperCase().trim());
            pstmt.setString(11, objpes.getCredencial().toUpperCase().trim());
            pstmt.setTimestamp(12, new java.sql.Timestamp(objpes.getDataPCnh().getTime()));
            pstmt.setInt(13, objpes.getAulasDadas());
            pstmt.setString(14, objpes.getDiretor().toUpperCase().trim());
            pstmt.setInt(15, objpes.getId());
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
        }
        return registros == 1;
    }
    // 

    public int Incluir(Secretario objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO secretario("
                + "nome,dataNasc,cpf,rg, sexo,"
                + "endereco,celular, salario, dataAdmissao, ctps)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?)")) {
            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setTimestamp(2, new java.sql.Timestamp(objpes.getDataNasc().getTime()));
            pstmt.setString(3, objpes.getCpf().toUpperCase().trim());
            pstmt.setString(4, objpes.getRg().toUpperCase().trim());
            pstmt.setString(5, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(6, objpes.getEnd().toUpperCase().trim());
            pstmt.setString(7, objpes.getCelular().toUpperCase().trim());
            pstmt.setDouble(8, objpes.getSalario());
            pstmt.setTimestamp(9, new java.sql.Timestamp(objpes.getDataAdmissao().getTime()));
            pstmt.setString(10, objpes.getCtps().toUpperCase().trim());
            registros = pstmt.executeUpdate();

        }
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT MAX(id) from secretario");
        ResultSet rs = pstmtAux.executeQuery();
        conexao.getConexaoClose();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }

    public boolean Editar(Secretario objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update secretario set nome = ?, dataNasc = ?,"
                + "cpf = ?,rg = ?, sexo = ?, endereco = ?,"
                + "celular = ?, salario = ?, dataAdmissao = ?, "
                + "ctps  = ? where id=?")) {

            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setTimestamp(2, new java.sql.Timestamp(objpes.getDataNasc().getTime()));
            pstmt.setString(3, objpes.getCpf().toUpperCase().trim());
            pstmt.setString(4, objpes.getRg().toUpperCase().trim());
            pstmt.setString(5, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(6, objpes.getEnd().toUpperCase().trim());
            pstmt.setString(7, objpes.getCelular().toUpperCase().trim());
            pstmt.setDouble(8, objpes.getSalario());
            pstmt.setTimestamp(9, new java.sql.Timestamp(objpes.getDataAdmissao().getTime()));
            pstmt.setString(10, objpes.getCtps().toUpperCase().trim());
            pstmt.setInt(11, objpes.getId());
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
        }
        return registros == 1;
    }
    // 

    public int Incluir(Veiculo objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO veiculo(placa, cor, modelo, validade, ano, docpago, tipo, renavam, chassi) VALUES (?,?,?,?,?,?,?,?,?)")) {
            pstmt.setString(1, objpes.getPlaca().toUpperCase().trim());
            pstmt.setString(2, objpes.getCor().toUpperCase().trim());
            pstmt.setString(3, objpes.getModelo().toUpperCase().trim());
            pstmt.setInt(4, objpes.getValidade());
            pstmt.setInt(5, objpes.getAno());
            pstmt.setBoolean(6, objpes.isDocPago());
            pstmt.setString(7, objpes.getTipo().toUpperCase().trim());
            pstmt.setString(8, objpes.getRenavam().toUpperCase().trim());
            pstmt.setString(9, objpes.getChassi().toUpperCase().trim());
            registros = pstmt.executeUpdate();

        }
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT MAX(id) from veiculo");
        ResultSet rs = pstmtAux.executeQuery();
        conexao.getConexaoClose();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }

    public boolean Editar(Veiculo objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update veiculo set placa = ?, renavam = ?, cor = ?, "
                + "modelo = ?, chassi = ?, validade = ?, ano = ?, "
                + "docpago = ?, tipo  = ? where id=?")) {

            pstmt.setString(1, objpes.getPlaca().toUpperCase().trim());
            pstmt.setString(2, objpes.getRenavam().toUpperCase().trim());
            pstmt.setString(3, objpes.getCor().toUpperCase().trim());
            pstmt.setString(4, objpes.getModelo().toUpperCase().trim());
            pstmt.setString(5, objpes.getChassi().toUpperCase().trim());
            pstmt.setInt(6, objpes.getValidade());
            pstmt.setInt(7, objpes.getAno());
            pstmt.setBoolean(8, objpes.isDocPago());
            pstmt.setString(9, objpes.getTipo().toUpperCase().trim());
            pstmt.setInt(10, objpes.getId());
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
        }
        return registros == 1;
    }

    public boolean editarDoc(String simNao) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update veiculo set "
                + "docpago = ? where id>0")) {
            pstmt.setString(1, simNao);
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
        }
        return registros == 1;
    }

    public boolean Editar(Parametros obj) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update parametros set "
                + "aulaMinCarroInicial = ?,"
                + "aulaMinCarroAdicao = ?,"
                + "aulaMinMotoInicial = ?,"
                + "aulaMinMotoAdicao = ?,"
                + "aulaMinOnibus=?,"
                + "aulaCarro=?,"
                + "aulaMoto =?,"
                + "aulaOnibus =?,"
                + "aluguelMoto =?,"
                + "aluguelCarro =?, "
                + "aluguelOnibus =?, "
                + "salarioInstrutor = ?,"
                + "SalarioDiretorEnsino = ?,"
                + "SalarioDiretorGeral = ?,"
                + "valAulaDada= ?,"
                + "horaAbertura= ?,"
                + "horaFechamento= ?,"
                + "horaInicioAlmoco= ?,"
                + "horaFimAlmoco= ?,"
                + "where id = ?")){
            pstmt.setInt(1, obj.getAulaMinCarroInicial());
            pstmt.setInt(2, obj.getAulaMinCarroAdicao());
            pstmt.setInt(3, obj.getAulaMinMotoInicial());
            pstmt.setInt(4, obj.getAulaMinMotoAdicao());
            pstmt.setInt(5, obj.getAulaMinOnibus());
            pstmt.setDouble(6, obj.getAulaCarro());
            pstmt.setDouble(7, obj.getAulaMoto());
            pstmt.setDouble(8, obj.getAulaOnibus());
            pstmt.setDouble(9, obj.getAluguelCarro());
            pstmt.setDouble(10, obj.getAluguelMoto());
            pstmt.setDouble(11, obj.getAluguelOnibus());
            pstmt.setDouble(12, obj.getSalarioInstrutor());
            pstmt.setDouble(13, obj.getSalarioDiretorEnsino());
            pstmt.setDouble(14, obj.getSalarioDiretorGeral());
            pstmt.setDouble(15, obj.getValorAulaDada());
            pstmt.setString(16, obj.getHoraAbertura());
            pstmt.setString(17, obj.getHoraFechamento());
            pstmt.setString(18, obj.getHoraInicioAlmoco());
            pstmt.setString(19, obj.getHoraFimAlmoco());
            pstmt.setInt(20, obj.getId());
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
        }
        return registros == 1;
    }
    // 
    

    public int Incluir(Aula objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO aula(data, horario,"
                + " id_veiculo, id_instrutor, id_cliente, concretizada) VALUES (?,?,?,?,?,?)")) {
            pstmt.setTimestamp(1, new java.sql.Timestamp(objpes.getData().getTime()));
            pstmt.setString(2, objpes.getHorario().toUpperCase().trim());
            pstmt.setInt(3, objpes.getVeiculo().getId());
            pstmt.setInt(4, objpes.getInstrutor().getId());
            pstmt.setInt(5, objpes.getCliente().getId());
            pstmt.setBoolean(6, objpes.getConcretizada());
            registros = pstmt.executeUpdate();

        }
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT MAX(id) from aula");
        ResultSet rs = pstmtAux.executeQuery();
        conexao.getConexaoClose();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }

    public boolean Editar(Aula objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update aula set data = ?, horario= ?, "
                + "id_veiculo = ?, id_instrutor = ?, id_cliente = ?, concretizada = ? where id=?")) {

            pstmt.setTimestamp(1, new java.sql.Timestamp(objpes.getData().getTime()));
            pstmt.setString(2, objpes.getHorario().toUpperCase().trim());
            pstmt.setInt(3, objpes.getVeiculo().getId());
            pstmt.setInt(4, objpes.getInstrutor().getId());
            pstmt.setInt(5, objpes.getCliente().getId());
            pstmt.setBoolean(6, objpes.getConcretizada());
            pstmt.setInt(7, objpes.getId());
            registros = pstmt.executeUpdate();
            conexao.getConexaoClose();
        }
        return registros == 1;
    }
    // 
}
