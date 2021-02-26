package Persistencia;

import Controle.ClsGastos;
import Controle.ClsConexao;
import java.sql.Connection;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerGastos {

    public static boolean InserirGastos(ClsGastos gastos) {
        String SQL = "insert into tbGastos(Nome,Preco, Data) values (?,?, CONVERT(datetime, ?, 103))";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();
            pst.setString(1, gastos.getNome());
            pst.setDouble(2, gastos.getPreco());
            pst.setString(3, gastos.getDia());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir:" + e.getMessage());
            return false;
        }
        JOptionPane.showMessageDialog(null, "Incluido com sucesso! :)");
        return true;
    }

    public static ArrayList<ClsGastos> TodosGastos(String data) {
        String sql = "select tbGastos.CodGastos, tbGastos.Nome, tbGastos.Preco from tbGastos where Data=?";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, data);
            resultSet = prepared.executeQuery();
            ArrayList<ClsGastos> lista = new ArrayList<ClsGastos>();

            while (resultSet.next()) {

                ClsGastos gastos = new ClsGastos();
                gastos.setCod(resultSet.getInt(1));
                gastos.setNome(resultSet.getString(2));
                gastos.setPreco(resultSet.getDouble(3));
                lista.add(gastos);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    public void AlterarGastos(ClsGastos gastos) {

        String sql = "update tbGastos set Nome=?, Preco=? where CodGastos=?";
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, gastos.getNome());
            prepared.setDouble(2, gastos.getPreco());
            prepared.setInt(3, gastos.getCod());
            prepared.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
    }

    public boolean DeletarGastos(int Cod) {
        String sql = "delete from tbGastos where CodGastos=" + Cod;
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(sql);
            pst.clearParameters();
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static double GastosData(String data) {
        String sql = "select SUM(Preco) as total from tbGastos where Data='" + data + "'";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            //prepared.setString(1, data);
            resultSet = prepared.executeQuery();

            double total = 0;

            while ((resultSet.next())) {
                total = resultSet.getDouble(1);
            }

            conn.close();
            return total;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return 0;
        }
    }

}
