package Persistencia;

import Controle.ClsComplemento;
import Controle.ClsConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerComplemento {

    public static boolean InserirComplemento(ClsComplemento complemento) {
        String SQL = "insert into tbComplemento(Nome,Preco) values (?,?)";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();
            pst.setString(1, complemento.getNome());
            pst.setDouble(2, complemento.getPreco());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir:" + e.getMessage());
            return false;
        }
        JOptionPane.showMessageDialog(null, "Incluido com sucesso! :)");
        return true;
    }

    public static ArrayList<ClsComplemento> TodosComplemento() {
        String sql = "select * from tbComplemento";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsComplemento> lista = new ArrayList<ClsComplemento>();

            while (resultSet.next()) {

                ClsComplemento complemento = new ClsComplemento();
                complemento.setCod(resultSet.getInt(1));
                complemento.setNome(resultSet.getString(2));
                complemento.setPreco(resultSet.getDouble(3));
                lista.add(complemento);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    public void AlterarComplemento(ClsComplemento comp) {

        String sql = "update tbComplemento set Nome=?, Preco=? where CodComplemento=?";
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, comp.getNome());
            prepared.setDouble(2, comp.getPreco());
            prepared.setInt(3, comp.getCod());
            prepared.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
    }

    public boolean DeletarComplemento(int Cod) {
        String sql = "delete from tbComplemento where CodComplemento=" + Cod;
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
