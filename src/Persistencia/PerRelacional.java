package Persistencia;

import Controle.ClsConexao;
import Controle.ClsPedido;
import Controle.ClsRelacional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerRelacional {

    //PTP -> Pedido_tem_Produto
    public static void InserirPTP(int codPedido, int codProduto) {
        String SQL = "insert into tbPedido_tem_Produtos(PedidoCodPedido, ProdutoCodProduto) values (" + codPedido + ", " + codProduto + ")";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();;
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir: PTP " + e.getMessage());
        }

    }

    //PTPTC -> Pedido_tem_Produto_tem_Complemento
    public static void InserirPTPTC(int codPedido, int codProduto, int codComplemento) {
        String SQL = "insert into tbPedido_tem_Produtos_tem_Complementos(Pedido_tem_Produtos_Pedido_CodPedido, Pedido_tem_Produtos_Produto_CodProduto, Complemento_CodComplemento) values (" + codPedido + ", " + codProduto + ", " + codComplemento + ")";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ClsConexao.getConexao();
            pst = conn.prepareStatement(SQL);
            pst.clearParameters();;
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao inserir: PTPTC " + e.getMessage());
        }

    }

    //Informações para a tabela Pedidos em Andamento
    public static ArrayList<ClsRelacional> ConsultarPedidosAndamento(String data) {
        String sql = "select p.CodPedido, p.NomeCliente, pr.IdProduto, pr.TamanhoAcai, pr.TipoVitamina, pr.NomeVitamina, p.StatusPedido from  tbPedido as p inner join tbPedido_tem_Produtos as ptp on p.CodPedido = ptp.PedidoCodPedido inner join tbProduto as pr on ptp.ProdutoCodProduto = pr.CodProduto  where p.DataPedido='" + data + "'";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsRelacional> lista = new ArrayList<ClsRelacional>();

            while (resultSet.next()) {

                ClsRelacional relacional = new ClsRelacional();
                relacional.setCodPedido(resultSet.getInt(1));
                relacional.setNomeCliente(resultSet.getString(2));
                relacional.setIdProduto(resultSet.getInt(3));
                relacional.setTamanhoAcai(resultSet.getString(4));
                relacional.setTipoVitamina(resultSet.getString(5));
                relacional.setNomeVitamina(resultSet.getString(6));
                relacional.setStatusPedido(resultSet.getString(7));
                lista.add(relacional);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

    //Alterar estado do pedido na tela Pedido em Andamento
    public static void AlterarEstado(String estado, int cod) {

        String sql = "update tbPedido set StatusPedido='" + estado + "' where CodPedido=" + cod;
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = ClsConexao.getConexao();
            prepared = conn.prepareStatement(sql);
            prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso! :)");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
        }

    }

    //Informações para a tabela Pedidos no Relatório
    public static ArrayList<ClsRelacional> PedidoRelatorio(String data) {
        String sql = "select pr.IdProduto, pr.TamanhoAcai, pr.TipoVitamina, p.PrecoPedido from tbPedido as p inner join tbProduto as pr on 1=1 where p.DataPedido='" + data + "'";
        try {
            Connection conn = ClsConexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultSet;
            prepared = conn.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            ArrayList<ClsRelacional> lista = new ArrayList<ClsRelacional>();

            while (resultSet.next()) {

                ClsRelacional relacional = new ClsRelacional();
                relacional.setIdProduto(resultSet.getInt(1));
                relacional.setTamanhoAcai(resultSet.getString(2));
                relacional.setTipoVitamina(resultSet.getString(3));
                relacional.setValorPedido(resultSet.getString(4));
                lista.add(relacional);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }

}
