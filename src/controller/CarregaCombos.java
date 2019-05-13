package controller;

import  Connect_MySql.Connect_MySql;
import model.EmpresaBeans;
import model.MarcaImpBeans;
import model.ModeloBeans;
import model.StatusHistorioBeans;
import model.TransportadoraBeans;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PecasManut;

/**
 *
 * @author phelype
 */
public class CarregaCombos {
    
    public List<EmpresaBeans> ListarEmpresas(){
        Connection conn = Connect_MySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<EmpresaBeans> listEmp = new ArrayList<>();
        
        try {
            sql = "select * from tbl_Empresas";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                EmpresaBeans emp = new EmpresaBeans();
                emp.setId_emp(rs.getInt("id_emp"));
                emp.setEmpresa(rs.getString("empresa"));
                emp.setEndereco(rs.getString("cidade"));
                emp.setEndereco(rs.getString("uf"));
                listEmp.add(emp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1");
        }catch(AbstractMethodError erro){
            
        }catch(ExceptionInInitializerError err){
            
        }
        return listEmp;
    }
    
        public List<MarcaImpBeans> MarcaImp(){
        Connection conn = Connect_MySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<MarcaImpBeans> ListMarca = new ArrayList<>();
        
        try {
            sql = "select * from tbl_MarcaImpressora";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                MarcaImpBeans marca = new MarcaImpBeans();
                marca.setId_mdi(rs.getInt("id_mdi"));
                marca.setMarcaImp(rs.getString("MarcaImp"));
                
               ListMarca.add(marca);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1");
        }catch(AbstractMethodError erro){
            
        }catch(ExceptionInInitializerError err){
            
        }
        return ListMarca;
    }
        
    public List<ModeloBeans> ModeloImp(){
        Connection conn = Connect_MySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<ModeloBeans> ListModelo = new ArrayList<>();
        
        try {
            sql = "select * from tbl_ModeloImpressora";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                ModeloBeans modelo = new ModeloBeans();
                modelo.setId_mdm(rs.getInt("id_mdm"));
                modelo.setModeloImp(rs.getString("ModeloImp"));
                
               ListModelo.add(modelo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1");
        }catch(AbstractMethodError erro){
            
        }catch(ExceptionInInitializerError err){
            
        }
        return ListModelo;
    }
    
    public List<StatusHistorioBeans> StatusHist(){
        Connection conn = Connect_MySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<StatusHistorioBeans> ListStatus = new ArrayList<>();
        
        try {
            sql = "select * from tbl_StatusHist";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                StatusHistorioBeans sts = new StatusHistorioBeans();
                sts.setId_status(rs.getInt("id_status"));
                sts.setStatus(rs.getString("status"));
                sts.setCor(rs.getString("cor"));
                
               ListStatus.add(sts);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1");
        }catch(AbstractMethodError erro){
            
        }catch(ExceptionInInitializerError err){
            
        }
        return ListStatus;
    }
    
    public List<TransportadoraBeans> Transportadora(){
        Connection conn = Connect_MySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<TransportadoraBeans> ListTransporte = new ArrayList<>();
        
        try {
            sql = "select * from tbl_Transportadora";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                TransportadoraBeans transp = new TransportadoraBeans();
                transp.setId_trans(rs.getInt("id_trans"));
                transp.setTransportadora(rs.getString("transportadora"));
                
               ListTransporte.add(transp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1");
        }catch(AbstractMethodError erro){
            
        }catch(ExceptionInInitializerError err){
        }
        return ListTransporte;
    }
    public List<PecasManut> Pecas(){
        Connection conn = Connect_MySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<PecasManut> Listpecas = new ArrayList<>();
        
        try {
            sql = "select * from tbl_PecasManut";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                PecasManut pecas = new PecasManut();
                pecas.setId_pecas(rs.getInt("id_pecas"));
                pecas.setPeca(rs.getString("nome_peca"));
                pecas.setValor(rs.getFloat("valor"));
                pecas.setImagem(rs.getString("imagem"));
                
               Listpecas.add(pecas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1");
        }catch(AbstractMethodError erro){
            
        }catch(ExceptionInInitializerError err){
        }
        return Pecas();
    }
}