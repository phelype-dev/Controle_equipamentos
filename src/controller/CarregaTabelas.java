/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.EmpresaBeans;
import model.EnviaManutencaoBeans;
import model.MarcaImpBeans;
import model.ModeloBeans;
import model.TransportadoraBeans;
import Connect_MySql.Connect_MySql;
import javax.swing.JOptionPane;

/**
 *
 * @author Phelype
 */
public class CarregaTabelas {
    public String mensagem;
    public List<EnviaManutencaoBeans> List(){
        Connection con = Connect_MySql.getConnection();
        ResultSet rs;
        PreparedStatement pst = null;
        String sql;
        List<EnviaManutencaoBeans> funcL = new ArrayList<>();
        
        try {
            sql = "select id, cod_remesa, marcaImp, modeloImp, patrimonio, sut, defeito, obs, data_envio, transportadora, empresa "
                + "from tbl_EnviaManutencao "
                + "inner join tbl_MarcaImpressora on id_mdi = mdi_id "
                + "inner join tbl_ModeloImpressora on id_mdm = mdm_id "
                + "inner join tbl_Transportadora on id_trans = transporte "
                + "inner join tbl_Empresas on id_emp = destinatario "
                + "order by data_envio";
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                EnviaManutencaoBeans manut = new EnviaManutencaoBeans();
                manut.setId(rs.getInt("id"));
                manut.setCod_remesa(rs.getInt("cod_remesa"));
                MarcaImpBeans marca = new MarcaImpBeans();
                marca.setMarcaImp(rs.getString("marcaImp"));
                manut.setMdi_imp(marca);
                ModeloBeans modelo = new ModeloBeans();
                modelo.setModeloImp(rs.getString("modeloImp"));
                manut.setMdm_id(modelo);
                manut.setPatrimonio(rs.getInt("patrimonio"));
                manut.setSut(rs.getInt("sut"));
                manut.setDefeito(rs.getString("defeito"));
                manut.setObs(rs.getString("obs"));
                manut.setData_envio(rs.getString("data_envio"));
                TransportadoraBeans transp = new TransportadoraBeans();
                transp.setTransportadora(rs.getString("transportadora"));
                manut.setTransporte(transp);
                EmpresaBeans emp = new EmpresaBeans();
                emp.setEmpresa(rs.getString("empresa"));
                manut.setDestinatario(emp);
                
                funcL.add(manut);
            }
        } catch (SQLException ex) {
            funcL.isEmpty();
            JOptionPane.showMessageDialog(null, "Ainda não existem dados na tabela.");
        }
        return funcL;
    }

    public List<EnviaManutencaoBeans> BuscaTabela(String valor){
        Connection con = Connect_MySql.getConnection();
        ResultSet rs;
        PreparedStatement pst = null;
        String sql;
        List<EnviaManutencaoBeans> funcL = new ArrayList<>();
        
        try {
            sql = "select id, cod_remesa, marcaImp, modeloImp, patrimonio, sut, defeito, obs, data_envio, transportadora, empresa "
                + "from tbl_EnviaManutencao "
                + "inner join tbl_MarcaImpressora on id_mdi = mdi_id "
                + "inner join tbl_ModeloImpressora on id_mdm = mdm_id "
                + "inner join tbl_Transportadora on id_trans = transporte "
                + "inner join tbl_Empresas on id_emp = destinatario "
                + "where cod_remesa like ?"
                    + "or patrimonio like ?"
                    + "or sut like ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, "%"+valor+"%");
            pst.setString(2, "%"+valor+"%");
            pst.setString(3, "%"+valor+"%");
            rs = pst.executeQuery();
            
            while(rs.next()){
                if(!rs.next()){
                    mensagem = "Ainda não existe dados cadastrados !";
                    JOptionPane.showMessageDialog(null, mensagem);
                }else{
                   EnviaManutencaoBeans manut = new EnviaManutencaoBeans();
                manut.setId(rs.getInt("id"));
                manut.setCod_remesa(rs.getInt("cod_remesa"));
                MarcaImpBeans marca = new MarcaImpBeans();
                marca.setMarcaImp(rs.getString("marcaImp"));
                manut.setMdi_imp(marca);
                ModeloBeans modelo = new ModeloBeans();
                modelo.setModeloImp(rs.getString("modeloImp"));
                manut.setMdm_id(modelo);
                manut.setPatrimonio(rs.getInt("patrimonio"));
                manut.setSut(rs.getInt("sut"));
                manut.setDefeito(rs.getString("defeito"));
                manut.setObs(rs.getString("obs"));
                manut.setData_envio(rs.getString("data_envio"));
                TransportadoraBeans transp = new TransportadoraBeans();
                transp.setTransportadora(rs.getString("transportadora"));
                manut.setTransporte(transp);
                EmpresaBeans emp = new EmpresaBeans();
                emp.setEmpresa(rs.getString("empresa"));
                manut.setDestinatario(emp);
                
                funcL.add(manut); 
                }
            }
        } catch (SQLException ex) {
            funcL.isEmpty();
            JOptionPane.showMessageDialog(null, "Ainda não existem dados na tabela."+ex.getMessage());
        }
        return funcL;
    }
}