package Persistencia;

import Controle.ClsAcai;
import Controle.ClsConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerAcai {

    public static boolean InserirAcai(ClsAcai acai) {
        String SQL = "insert into tbProduto(IdProduto, TamanhoAcai, Preco) values (?,?,?)";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();
            pst.setInt(1, 1);
            pst.setString(2, acai.getTamanho());
            pst.setDouble(3, acai.getPreco());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir:" + e.getMessage());
            return false;
        }
        JOptionPane.showMessageDialog(null, "Incluido com sucesso! :)");
        return true;
    }

    public static ArrayList<ClsAcai> TodosAcai() {
        String sql = "select * from tbProduto where IdProduto=1";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsAcai> lista = new ArrayList<ClsAcai>();

            while (resultSet.next()) {

                ClsAcai acai = new ClsAcai();
                acai.setCod(resultSet.getInt(1)); //1
                acai.setTamanho(resultSet.getString(3)); //4
                acai.setPreco(resultSet.getDouble(6)); //6
                lista.add(acai);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    public void AlterarAcai(ClsAcai acai) {

        String sql = "update tbProduto set TamanhoAcai=?, Preco=? where CodProduto=?";
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, acai.getTamanho());
            prepared.setDouble(2, acai.getPreco());
            prepared.setInt(3, acai.getCod());
            prepared.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
    }

    public boolean DeletarAcai(int Cod) {
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
        String sql = "select COUNT(p.PrecoPedido) from tbPedido as p inner join tbProduto as pr on pr.IdProduto=1 where p.DataPedido='" + data + "'";
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
        String sql = "select SUM(p.PrecoPedido) from tbPedido as p inner join tbProduto as pr on pr.IdProduto=1 where p.DataPedido='" + data + "'";
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
