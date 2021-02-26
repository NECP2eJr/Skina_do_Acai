package Fronteira;

import Controle.ClsGastos;
import Persistencia.PerGastos;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TlGastos extends javax.swing.JPanel {

    DefaultTableModel vTabela = new DefaultTableModel();

    public TlGastos() {
        initComponents();
        vTabela.addColumn("Cod.");
        vTabela.addColumn("Nome");
        vTabela.addColumn("Preço");

        Date hoje = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("GMT-3"));

        txtDATE.setText(df.format(new Date()));

        PreencherTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im = new ImageIcon ("src\\Imagens\\back4.jpg");
                Image i = im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }

        };
        pnlBairroCRUD = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im = new ImageIcon ("src\\Imagens\\back6.jpg");
                Image i = im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        lblGasto = new javax.swing.JLabel();
        btnAdicionarGasto = new javax.swing.JButton();
        btnRemoverGasto = new javax.swing.JButton();
        lblGastos = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        txtGasto = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDATE = new javax.swing.JFormattedTextField();

        setMaximumSize(new java.awt.Dimension(800, 600));

        pnlBack.setBackground(new java.awt.Color(204, 204, 224));

        lblGasto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGasto.setText("Gasto:");

        btnAdicionarGasto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarGasto.setText("Adicionar");
        btnAdicionarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarGastoActionPerformed(evt);
            }
        });

        btnRemoverGasto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoverGasto.setText("Remover");
        btnRemoverGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverGastoActionPerformed(evt);
            }
        });

        lblGastos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGastos.setText("Gastos:");

        lbValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbValor.setText("Valor:");

        txtGasto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jTable1.setModel(vTabela);
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("Data ");

        txtDATE.setEditable(false);
        txtDATE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDATE.setEnabled(false);

        javax.swing.GroupLayout pnlBairroCRUDLayout = new javax.swing.GroupLayout(pnlBairroCRUD);
        pnlBairroCRUD.setLayout(pnlBairroCRUDLayout);
        pnlBairroCRUDLayout.setHorizontalGroup(
            pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBairroCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBairroCRUDLayout.createSequentialGroup()
                        .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBairroCRUDLayout.createSequentialGroup()
                                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlBairroCRUDLayout.createSequentialGroup()
                                        .addComponent(lblGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(396, 396, 396))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBairroCRUDLayout.createSequentialGroup()
                                        .addComponent(txtGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbValor)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2)
                            .addGroup(pnlBairroCRUDLayout.createSequentialGroup()
                                .addComponent(btnAdicionarGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(btnRemoverGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlBairroCRUDLayout.createSequentialGroup()
                        .addComponent(lblGastos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBairroCRUDLayout.setVerticalGroup(
            pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBairroCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGastos)
                    .addComponent(txtDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGasto)
                    .addComponent(lbValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBairroCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarGasto)
                    .addComponent(btnRemoverGasto)
                    .addComponent(btnAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBairroCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBairroCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarGastoActionPerformed

        if (txtGasto.getText().isEmpty() || txtValor.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Um dos campos está vazia, verifique novamente!");

        } else {
            ClsGastos addGastos = new ClsGastos();

            addGastos.setNome(txtGasto.getText());
            addGastos.setPreco(Double.parseDouble(txtValor.getText()));
            addGastos.setDia(txtDATE.getText());

            PerGastos.InserirGastos(addGastos);

            PreencherTabela();
            txtGasto.setText("");
            txtValor.setText("");
        }

    }//GEN-LAST:event_btnAdicionarGastoActionPerformed

    private void btnRemoverGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverGastoActionPerformed

        if (jTable1.getSelectedRow() >= 0) {
            int Cod = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");

            PerGastos pa = new PerGastos();
            pa.DeletarGastos(Cod);

            PreencherTabela();
            txtGasto.setText("");
            txtValor.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para remover!");
        }

    }//GEN-LAST:event_btnRemoverGastoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (jTable1.getSelectedRow() >= 0) {
            TlAlterarGastos alt = new TlAlterarGastos(this);

            alt.lbCod.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
            alt.txtNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
            alt.txtValor.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "");

            alt.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    public void PreencherTabela() {
        //vai limpar a tabela
        int t = vTabela.getRowCount();
        for (int i = 0; i < t; i++) {
            vTabela.removeRow(0);
        }

        String data = txtDATE.getText();

        PerGastos pergastos = new PerGastos();
        ArrayList<ClsGastos> gastos = PerGastos.TodosGastos(data);

        //vai preencher a tabela
        for (ClsGastos q : gastos) {
            String linha[] = new String[4];

            linha[0] = q.getCod() + "";
            linha[1] = q.getNome();
            linha[2] = q.getPreco() + "";
            vTabela.addRow(linha);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarGasto;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnRemoverGasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lblGasto;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBairroCRUD;
    private javax.swing.JFormattedTextField txtDATE;
    private javax.swing.JTextField txtGasto;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
