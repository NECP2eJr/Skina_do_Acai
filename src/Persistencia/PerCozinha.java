package Persistencia;

import Controle.ClsAcai;
import Controle.ClsConexao;
import Controle.ClsPedido;
import Controle.ClsRelacional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PerCozinha {

    //este select do método ImpressaoCozinha() está trazendo apenas os pedidos que contém complemento, não está trazendo os pedidos que NÃO contém complemento
    /*
    //Informações para a tabela Pedidos em Andamento
    public static ArrayList<ClsRelacional> ImpressaoCozinha(String data) {
        String sql = "select p.CodPedido, p.NomeCliente, pr.IdProduto, pr.TamanhoAcai, pr.TipoVitamina, pr.NomeVitamina, comp.CodComplemento,comp.Nome from tbPedido as p inner join tbPedido_tem_Produtos_tem_Complementos as ptptc on p.CodPedido = ptptc.Pedido_tem_Produtos_Pedido_CodPedido inner join tbProduto as pr on ptptc.Pedido_tem_Produtos_Produto_CodProduto = pr.CodProduto inner join tbComplemento as comp on ptptc.Complemento_CodComplemento = comp.CodComplemento where p.DataPedido='"+ data +"' AND p.StatusPedido='Em espera'";
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
                relacional.setCodComplemento(resultSet.getInt(7));
                relacional.setNomeComplemento(resultSet.getString(8));
                lista.add(relacional);

            }
            conn.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro persistência: " + e.toString());
            return null;
        }
    }
     */
}
