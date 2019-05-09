
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.EnviaManutencaoBeans;

/**
 *
 * @author phelype
 */
public class cadastros {
    public String aprovado;
    
    public void CadastrarEnvio(EnviaManutencaoBeans envio){
        
        Connection conn = Connect_MySql.Connect_MySql.getConnection();
        PreparedStatement pst;
        String sql;
        
        
        try {
            sql = "INSERT INTO tbl_EnviaManutencao (cod_remesa, mdi_id, mdm_id, patrimonio, sut, defeito, obs, data_envio, transporte, destinatario)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, envio.getCod_remesa());
            pst.setInt(2, envio.getMdi_imp().getId_mdi());
            pst.setInt(3, envio.getMdm_id().getId_mdm());
            pst.setInt(4, envio.getPatrimonio());
            pst.setInt(5, envio.getSut());
            pst.setString(6, envio.getDefeito());
            pst.setString(7, envio.getObs());
            pst.setString(8, envio.getData_envio());
            pst.setInt(9, envio.getTransporte().getId_trans());
            pst.setInt(10, envio.getDestinatario().getId_emp());
            pst.execute();
            
            aprovado = "Cadastrado com sucesso!";
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
        }
    }
}