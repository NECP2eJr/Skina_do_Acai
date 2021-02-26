package Persistencia;

import Controle.ClsConexao;
import Controle.ClsSenha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerSenha {

    public static ArrayList<ClsSenha> Senhas() {
        String sql = "select Senha from tbLogin where CodLogin=1";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsSenha> lista = new ArrayList<ClsSenha>();

            while (resultSet.next()) {

                ClsSenha senhas = new ClsSenha();
                senhas.setSenha(resultSet.getString(1));
                lista.add(senhas);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    public void AlterarSenha(ClsSenha senha) {

        String sql = "update tbLogin set Senha=? where CodLogin=1";
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.setString(1, senha.getSenha());
            prepared.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
    }

}
