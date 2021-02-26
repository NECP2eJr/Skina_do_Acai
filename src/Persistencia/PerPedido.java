package Persistencia;

import Controle.ClsConexao;
import Controle.ClsPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerPedido {

    public static boolean InserirPedido(ClsPedido pedido) {
        String SQL = "insert into tbPedido(NomeCliente, DataPedido, StatusPedido, PrecoPedido) values (?, CONVERT(datetime, ?, 103), 'Em espera', ?)";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();
            pst.setString(1, pedido.getNome());
            pst.setString(2, pedido.getData());
            pst.setDouble(3, pedido.getValor());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir:" + e.getMessage());
            return false;
        }
        return true;
    }

    public static int CodPedido() {
        String sql = "select IDENT_CURRENT('tbPedido')";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();

            int total = 0;

            while ((resultSet.next())) {
                total = resultSet.getInt(1);
            }

            conn.close();
            return total;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return 0;
        }
    }

}
