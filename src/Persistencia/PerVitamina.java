package Persistencia;

import Controle.ClsVitamina;
import Controle.ClsConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerVitamina {

    public static boolean InserirVitamina(ClsVitamina vitamina) {
        String SQL = "insert into tbProduto(IdProduto, TipoVitamina, NomeVitamina, Preco) values (?,?,?,?)";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();
            pst.setInt(1, 2);
            pst.setString(2, vitamina.getTipo());
            pst.setString(3, vitamina.getNome());
            pst.setDouble(4, vitamina.getPreco());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir:" + e.getMessage());
            return false;
        }
        JOptionPane.showMessageDialog(null, "Incluido com sucesso! :)");
        return true;
    }

    public static ArrayList<ClsVitamina> TodasVitaminas() {
        String sql = "select * from tbProduto where IdProduto=2";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsVitamina> lista = new ArrayList<ClsVitamina>();

            while (resultSet.next()) {

                ClsVitamina vitamina = new ClsVitamina();
                vitamina.setCod(resultSet.getInt(1)); //1
                vitamina.setTipo(resultSet.getString(4)); //4
                vitamina.setNome(resultSet.getString(5)); //5
                vitamina.setPreco(resultSet.getDouble(6)); //6
                lista.add(vitamina);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    public void AlterarVitamina(ClsVitamina vitamina) {

        String sql = "update tbProduto set TipoVitamina=?, NomeVitamina=?, Preco=? where CodProduto=?";
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, vitamina.getTipo());
            prepared.setString(2, vitamina.getNome());
            prepared.setDouble(3, vitamina.getPreco());
            prepared.setInt(4, vitamina.getCod());
            prepared.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
    }

    public boolean DeletarVitamina(int Cod) {
        String sql = "delete from tbProduto where CodProduto=" + Cod;
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

    public static int QuantidadeTotal(String data) {
        String sql = "select COUNT(p.PrecoPedido) from tbPedido as p inner join tbProduto as pr on pr.IdProduto=2 where p.DataPedido='" + data + "'";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            //prepared.setString(1, data);
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

    public static double ValorTotal(String data) {
        String sql = "select SUM(p.PrecoPedido) from tbPedido as p inner join tbProduto as pr on pr.IdProduto=2 where p.DataPedido='" + data + "'";
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
