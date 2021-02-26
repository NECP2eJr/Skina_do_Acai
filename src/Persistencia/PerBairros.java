package Persistencia;

import Controle.ClsBairros;
import Controle.ClsConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerBairros {

    public static boolean InserirBairros(ClsBairros bairros) {
        String SQL = "insert into tbBairros(Nome,Preco) values (?,?)";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();
            pst.setString(1, bairros.getNome());
            pst.setDouble(2, bairros.getPreco());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir:" + e.getMessage());
            return false;
        }
        JOptionPane.showMessageDialog(null, "Incluido com sucesso! :)");
        return true;
    }

    public static ArrayList<ClsBairros> TodosBairros() {
        String sql = "select * from tbBairros";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsBairros> lista = new ArrayList<ClsBairros>();

            while (resultSet.next()) {

                ClsBairros bairros = new ClsBairros();
                bairros.setCod(resultSet.getInt(1));
                bairros.setNome(resultSet.getString(2));
                bairros.setPreco(resultSet.getDouble(3));
                lista.add(bairros);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    public void AlterarBairros(ClsBairros bairros) {

        String sql = "update tbBairros set Nome=?, Preco=? where CodBairros=?";
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, bairros.getNome());
            prepared.setDouble(2, bairros.getPreco());
            prepared.setInt(3, bairros.getCod());
            prepared.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
    }

    public boolean DeletarBairros(int Cod) {
        String sql = "delete from tbBairros where CodBairros=" + Cod;
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

}
