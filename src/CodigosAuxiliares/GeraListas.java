/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigosAuxiliares;

import Objetos.Aula;
import Objetos.ClienteCnh;
import Objetos.Instrutor;
import Objetos.Time;
import Objetos.Veiculo;
import Persistencia.ConsultaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pedrinho
 */
public class GeraListas {

    public static ArrayList<Aula> listAula = new ArrayList();
    public static ArrayList<Instrutor> listInst = new ArrayList();
    public static ArrayList<Veiculo> listVei = new ArrayList();
    public static ArrayList<ClienteCnh> listCli = new ArrayList();
    public static ArrayList<Time> listHorario = new ArrayList();

    public static void geraListaAula() throws SQLException {
        listAula.clear();
        ResultSet rs = ConsultaDAO.carregaAula();
        while (rs.next()) {
            Aula obj = new Aula();
            obj.setId(rs.getInt("id"));
            obj.setData(rs.getDate("data"));
            obj.setHorario(rs.getString("horario").trim());
            Veiculo objVei = null;
            int idVeiculo = rs.getInt("id_veiculo");
            for (Veiculo aux : listVei) {
                if (idVeiculo == aux.getId()) {
                    objVei = aux;
                }
            }
            Instrutor objInst = null;
            int idInstrutor = rs.getInt("id_instrutor");
            for (Instrutor aux : listInst) {
                if (idInstrutor == aux.getId()) {
                    objInst = aux;
                }
            }
            ClienteCnh objCli = null;
            int idCliente = rs.getInt("id_Cliente");
            for (ClienteCnh aux : listCli) {
                if (idCliente == aux.getId()) {
                    objCli = aux;
                }
            }
            obj.setVeiculo(objVei);
            obj.setInstrutor(objInst);
            obj.setCliente(objCli);
            if (rs.getBoolean("concretizada")) {
                obj.setConcretizada(true);
            } else {
                obj.setConcretizada(false);
            }
            listAula.add(obj);
        }
    }

    public static void geraListaInst() throws SQLException {
        listInst.clear();
        ResultSet rs = ConsultaDAO.carregaInstrutor();
        while (rs.next()) {
            Instrutor obj = new Instrutor();
            obj.setId(rs.getInt("id"));
            obj.setDataNasc(rs.getDate("datanasc"));
            obj.setCelular(rs.getString("celular"));
            obj.setCredencial(rs.getString("credencial"));
            obj.setDataPCnh(rs.getDate("datapcnh"));
            obj.setDataAdmissao(rs.getDate("dataadmissao"));
            obj.setCtps(rs.getString("ctps"));
            obj.setRg(rs.getString("rg"));
            obj.setSexo(rs.getString("sexo"));
            obj.setEnd(rs.getString("endereco"));
            obj.setCpf(rs.getString("cpf").trim());
            obj.setNome(rs.getString("nome").trim());
            obj.setAulasDadas(rs.getInt("aulasdadas"));
            obj.setDiretor(rs.getString("diretor"));
            listInst.add(obj);
        }
    }

    static public void geraListaCli() throws SQLException {
        listCli.clear();
        ResultSet rs = ConsultaDAO.carregaCliente();
        while (rs.next()) {
            ClienteCnh obj = new ClienteCnh();
            obj.setId(rs.getInt("id"));
            obj.setDataNasc(rs.getDate("datanasc"));
            obj.setCelular(rs.getString("celular"));
            obj.setRg(rs.getString("rg"));
            obj.setSexo(rs.getString("sexo"));
            obj.setEnd(rs.getString("endereco"));
            obj.setCpf(rs.getString("cpf").trim());
            obj.setNome(rs.getString("nome").trim());
            obj.setCatPretendida(rs.getString("catPretendida"));
            obj.setValorPago(rs.getDouble("vaLORPAGO"));
            obj.setOrcamento(rs.getDouble("orcamento"));
            obj.setDataCadastro(rs.getDate("datacadastro"));
            obj.setConcluido(rs.getBoolean("concluido"));
            obj.setQntAulasPossuidas(rs.getInt("qntaulaspossuidas"));
            obj.setQntAulasFeitas(rs.getInt("qntaulasfeitas"));
            obj.setFormaPagamento(rs.getString("formapagamento"));
            listCli.add(obj);
        }
    }

    public static void geraListaVei() throws SQLException {
        listVei.clear();
        ResultSet rs = ConsultaDAO.carregaVeiculo();
        while (rs.next()) {
            Veiculo obj = new Veiculo();
            obj.setId(rs.getInt("id"));
            obj.setAno(rs.getInt("ano"));
            obj.setValidade(rs.getInt("validade"));
            obj.setPlaca(rs.getString("placa").trim());
            obj.setRenavam(rs.getString("renavam").trim());
            obj.setChassi(rs.getString("chassi"));
            obj.setCor(rs.getString("cor"));
            obj.setModelo(rs.getString("modelo"));
            obj.setDocPago(rs.getBoolean("docpago"));
            obj.setTipo(rs.getString("tipo"));
            listVei.add(obj);
        }
    }

    public static void geraListaHorario() {
        int i = 0;
        int k = 0;
        while (true) {
            Time hora = new Time(07, 00);
            hora.addMinutes(50 * i);
            if (hora.getHours() >= 12) {
                hora.setHours(14);
                hora.setMinutes(0);
                hora.addMinutes(50 * k);
                k++;
            }
            if (hora.getHours() > 18 && hora.getMinutes() > 00) {
                break;
            }
            listHorario.add(hora);
            i++;
        }
    }

}
