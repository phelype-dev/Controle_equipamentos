package Connect_MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connect_MySql {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://192.168.1.63:3306/Controle_Manutencao";
    private static final String USER = "fr";
    private static final String PASS = "X01nn@h77M";
    public ResultSet rs;
    public PreparedStatement stmt;
    public Connection conn;
    public Statement stm;

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar EXECUTASQL" + ex.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao conectar: " + ex);
        }
    }

    public static void CloseConection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO " + ex.getMessage());
        }
    }

    public static void CloseConection(Connection con, PreparedStatement stmt) {
        CloseConection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO " + ex.getMessage());
        }
    }

    public static void CloseConection(Connection con, PreparedStatement stmt, ResultSet rs) {
        CloseConection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO " + ex.getMessage());
        }
    }
}
