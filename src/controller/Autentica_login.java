/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Connect_MySql.Connect_MySql;
import ViewsClass.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Autentica_login {
    
    public boolean ativo;
    private boolean validado;
    public Object mat, lo;

    public boolean Autentica(String usuario, String senha){
        Connection conn = Connect_MySql.getConnection();
        String sql = "select login, password, ativo from tbl_login where login=? and password=?";
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            ResultSet rs;
            rs = pst.executeQuery();
            if(rs.next()){
                mat = rs.getString("login");
                String pass = rs.getString("password");
                ativo = rs.getBoolean("ativo");
                validado = true;
                
                
            }else if(validado == false){
                  JOptionPane.showMessageDialog(null, "Acesso negado! \n Verifique usuário e senha e tente novamente.");
            }else{
                pst.close();
                return validado;
            }
            lo = String.valueOf(mat);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar, entre em contato com o suporte !" +ex.getMessage());
        }
        return validado;
    }
   
}
