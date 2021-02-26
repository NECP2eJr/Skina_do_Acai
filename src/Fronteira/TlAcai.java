package Fronteira;

import Controle.ClsAcai;
import Persistencia.PerAcai;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TlAcai extends javax.swing.JPanel {

    DefaultTableModel vTabela = new DefaultTableModel();

    public TlAcai() {
        initComponents();
        vTabela.addColumn("Cod.");
        vTabela.addColumn("Tamanhos");
        vTabela.addColumn("Preço");
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

        jPanel1 = new javax.swing.JPanel();
        pnlTamanhos = new javax.swing.JPanel();
        lblTamanho = new javax.swing.JLabel();
        lblTamTamanho = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        lblTamValor = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnTamRemover = new javax.swing.JButton();
        btnTamAdicionar = new javax.swing.JButton();
        btnTamAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 224));

        lblTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTamanho.setText("Tamanho dos Açaís");

        lblTamTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTamTamanho.setText("Tamanho:");

        txtTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTamValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTamValor.setText("Valor:");

        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTamRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTamRemover.setText("Remover");
        btnTamRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamRemoverActionPerformed(evt);
            }
        });

        btnTamAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTamAdicionar.setText("Adicionar");
        btnTamAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamAdicionarActionPerformed(evt);
            }
        });

        btnTamAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTamAlterar.setText("Alterar");
        btnTamAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamAlterarActionPerformed(evt);
            }
        });

        jTable1.setModel(vTabela);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout pnlTamanhosLayout = new javax.swing.GroupLayout(pnlTamanhos);
        pnlTamanhos.setLayout(pnlTamanhosLayout);
        pnlTamanhosLayout.setHorizontalGroup(
            pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamanhosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTamanhosLayout.createSequentialGroup()
                        .addComponent(btnTamAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(btnTamRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btnTamAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlTamanhosLayout.createSequentialGroup()
                            .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTamanho)
                                .addComponent(lblTamTamanho))
                            .addGap(18, 18, 18)
                            .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTamValor)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTamanhosLayout.setVerticalGroup(
            pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamanhosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTamanhosLayout.createSequentialGroup()
                        .addComponent(lblTamanho)
                        .addGap(216, 216, 216))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamTamanho)
                    .addComponent(lblTamValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTamAdicionar)
                    .addComponent(btnTamRemover)
                    .addComponent(btnTamAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTamanhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTamRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamRemoverActionPerformed

        if (jTable1.getSelectedRow() >= 0) {
            int Cod = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");

            PerAcai pa = new PerAcai();
            pa.DeletarAcai(Cod);

            PreencherTabela();
            txtTamanho.setText("");
            txtPreco.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para remover!");
        }

    }//GEN-LAST:event_btnTamRemoverActionPerformed

    private void btnTamAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamAdicionarActionPerformed

        if (txtTamanho.getText().isEmpty() || txtPreco.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Um dos campos está vazia, verifique novamente!");

        } else {
            ClsAcai addAcai = new ClsAcai();

            addAcai.setTamanho(txtTamanho.getText());
            addAcai.setPreco(Double.parseDouble(txtPreco.getText()));

            PerAcai.InserirAcai(addAcai);

            PreencherTabela();
            txtTamanho.setText("");
            txtPreco.setText("");
        }
    }//GEN-LAST:event_btnTamAdicionarActionPerformed

    private void btnTamAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamAlterarActionPerformed

        if (jTable1.getSelectedRow() >= 0) {
            TlAlterarAcai alt = new TlAlterarAcai(this);

            alt.lbCod.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
            alt.txtTamanho.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
            alt.txtValor.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "");

            alt.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela");
        }

    }//GEN-LAST:event_btnTamAlterarActionPerformed

    public void PreencherTabela() {
        //vai limpar a tabela
        int t = vTabela.getRowCount();
        for (int i = 0; i < t; i++) {
            vTabela.removeRow(0);
        }

        PerAcai peracai = new PerAcai();
        ArrayList<ClsAcai> acai = PerAcai.TodosAcai();

        //vai preencher a tabela
        for (ClsAcai q : acai) {
            String linha[] = new String[4];

            linha[0] = q.getCod() + "";
            linha[1] = q.getTamanho();
            linha[2] = q.getPreco() + "";
            vTabela.addRow(linha);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTamAdicionar;
    private javax.swing.JButton btnTamAlterar;
    private javax.swing.JButton btnTamRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTamTamanho;
    private javax.swing.JLabel lblTamValor;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JPanel pnlTamanhos;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables
}
