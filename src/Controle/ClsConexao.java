package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClsConexao {

    private static Connection con;

    public static Connection getConexao() {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=bdSkina;user=sa;password=projeto");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.getMessage(), "ERRO", 3);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a conexão: " + e.getMessage(), "ERRO", 1);
        }

        return con;

    }
}
