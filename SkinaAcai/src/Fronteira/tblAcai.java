/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fronteira;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiago
 */
public class tblAcai extends javax.swing.JPanel {

    /**
     * Creates new form tblAcai
     */
    public tblAcai() {
        initComponents();
        
        //enableComponents();
        
        setTableComplemento();
        setTableTamanhos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        pnlComplemento = new javax.swing.JPanel();
        lblComplementos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComplementos = new javax.swing.JTable();
        btnCompAdicionar = new javax.swing.JButton();
        btnCompSelecionar = new javax.swing.JButton();
        btnCompRemover = new javax.swing.JButton();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblCompValor = new javax.swing.JLabel();
        txtCompValor = new javax.swing.JTextField();
        btnCompAlterar = new javax.swing.JButton();
        pnlTamanhos = new javax.swing.JPanel();
        lblTamanho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTamanhos = new javax.swing.JTable();
        lblTamTamanho = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        lblTamValor = new javax.swing.JLabel();
        txtTamValor = new javax.swing.JTextField();
        btnTamRemover = new javax.swing.JButton();
        btnTamSelecionar = new javax.swing.JButton();
        btnTamAdicionar = new javax.swing.JButton();
        btnTamAlterar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));

        pnlBack.setBackground(new java.awt.Color(204, 204, 224));

        lblComplementos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplementos.setText("Complementos:");

        tblComplementos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblComplementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Complemento", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComplementos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblComplementos);
        if (tblComplementos.getColumnModel().getColumnCount() > 0) {
            tblComplementos.getColumnModel().getColumn(0).setResizable(false);
            tblComplementos.getColumnModel().getColumn(0).setPreferredWidth(300);
            tblComplementos.getColumnModel().getColumn(1).setResizable(false);
        }

        btnCompAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompAdicionar.setText("Adicionar");
        btnCompAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompAdicionarActionPerformed(evt);
            }
        });

        btnCompSelecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompSelecionar.setText("Selecionar");
        btnCompSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompSelecionarActionPerformed(evt);
            }
        });

        btnCompRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompRemover.setText("Remover");
        btnCompRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompRemoverActionPerformed(evt);
            }
        });

        lblComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento:");

        txtComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCompValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCompValor.setText("Valor:");

        txtCompValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCompAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompAlterar.setText("Alterar");
        btnCompAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlComplementoLayout = new javax.swing.GroupLayout(pnlComplemento);
        pnlComplemento.setLayout(pnlComplementoLayout);
        pnlComplementoLayout.setHorizontalGroup(
            pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComplementoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComplementoLayout.createSequentialGroup()
                        .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplementos)
                            .addGroup(pnlComplementoLayout.createSequentialGroup()
                                .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlComplementoLayout.createSequentialGroup()
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCompValor))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCompSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCompAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCompAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlComplementoLayout.createSequentialGroup()
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCompValor)
                        .addGap(307, 307, 307))))
        );
        pnlComplementoLayout.setVerticalGroup(
            pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComplementoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComplementos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlComplementoLayout.createSequentialGroup()
                        .addComponent(btnCompAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompRemover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(lblCompValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompAlterar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTamanho.setText("Tamanhos:");

        tblTamanhos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTamanhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tamanhos", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTamanhos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblTamanhos);
        if (tblTamanhos.getColumnModel().getColumnCount() > 0) {
            tblTamanhos.getColumnModel().getColumn(0).setResizable(false);
            tblTamanhos.getColumnModel().getColumn(0).setPreferredWidth(300);
            tblTamanhos.getColumnModel().getColumn(1).setResizable(false);
        }

        lblTamTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTamTamanho.setText("Tamanho:");

        txtTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });

        lblTamValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTamValor.setText("Valor:");

        txtTamValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTamRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTamRemover.setText("Remover");
        btnTamRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamRemoverActionPerformed(evt);
            }
        });

        btnTamSelecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTamSelecionar.setText("Selecionar");
        btnTamSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamSelecionarActionPerformed(evt);
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

        javax.swing.GroupLayout pnlTamanhosLayout = new javax.swing.GroupLayout(pnlTamanhos);
        pnlTamanhos.setLayout(pnlTamanhosLayout);
        pnlTamanhosLayout.setHorizontalGroup(
            pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamanhosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTamanhosLayout.createSequentialGroup()
                        .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTamanho)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTamanhosLayout.createSequentialGroup()
                                .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTamValor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTamRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTamAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTamSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTamAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(pnlTamanhosLayout.createSequentialGroup()
                        .addComponent(lblTamTamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTamValor)
                        .addGap(309, 309, 309))))
        );
        pnlTamanhosLayout.setVerticalGroup(
            pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamanhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTamanhosLayout.createSequentialGroup()
                        .addComponent(btnTamAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTamSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTamRemover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamTamanho)
                    .addComponent(lblTamValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTamValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTamAlterar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTamanhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlTamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void btnCompSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompSelecionarActionPerformed
        // Alterar complemento da tabela
        DefaultTableModel model = (DefaultTableModel) tblComplementos.getModel();
        int row = tblComplementos.getSelectedRow();
        if(row != -1){
             //Variáveis para armazenar valores atuais das listas
            String complemento, valor;

            //pegando valores
            complemento = tblComplementos.getValueAt(tblComplementos.getSelectedRow(),0).toString();
            valor = tblComplementos.getValueAt(tblComplementos.getSelectedRow(),1).toString();

            txtComplemento.setText(complemento);
            txtCompValor.setText(valor);
        }
    }//GEN-LAST:event_btnCompSelecionarActionPerformed

    private void btnCompRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompRemoverActionPerformed
        // Remover complemento da tabela
        DefaultTableModel model = (DefaultTableModel) tblComplementos.getModel();
        int row = tblComplementos.getSelectedRow();
        if(row != -1){
             //removendo
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnCompRemoverActionPerformed

    private void btnCompAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompAdicionarActionPerformed
        //Valores das caixas de texto
        String complemento, valor;
        
        //pegando valores
        complemento = txtComplemento.getText();
        valor = txtCompValor.getText();
        
        //jogando na tabela
        if(complemento.isEmpty()==false && valor.isEmpty()==false){
            DefaultTableModel model = (DefaultTableModel) tblComplementos.getModel();
            model.addRow(new Object[]{complemento, valor});
            txtComplemento.setText("");
            txtCompValor.setText("");
        }
    }//GEN-LAST:event_btnCompAdicionarActionPerformed

    private void btnCompAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompAlterarActionPerformed
        // CRUD
    }//GEN-LAST:event_btnCompAlterarActionPerformed

    private void btnTamAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamAdicionarActionPerformed
        //Valores das caixas de texto
        String tamanho, valor;
        
        //pegando valores
        tamanho = txtTamanho.getText();
        valor = txtTamValor.getText();
        
        //jogando na tabela
        if(tamanho.isEmpty()==false && valor.isEmpty()==false){
            DefaultTableModel model = (DefaultTableModel) tblTamanhos.getModel();
            model.addRow(new Object[]{tamanho, valor});
            txtTamanho.setText("");
            txtTamValor.setText("");
        }
    }//GEN-LAST:event_btnTamAdicionarActionPerformed

    private void btnTamRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamRemoverActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblTamanhos.getModel();
        int row = tblTamanhos.getSelectedRow();
        if(row != -1){
             //removendo
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnTamRemoverActionPerformed

    private void btnTamSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamSelecionarActionPerformed
        // Alterar complemento da tabela
        DefaultTableModel model = (DefaultTableModel) tblTamanhos.getModel();
        int row = tblTamanhos.getSelectedRow();
        if(row != -1){
             //Variáveis para armazenar valores atuais das listas
            String tamanho, valor;

            //pegando valores
            tamanho = tblTamanhos.getValueAt(tblTamanhos.getSelectedRow(),0).toString();
            valor = tblTamanhos.getValueAt(tblTamanhos.getSelectedRow(),1).toString();

            txtTamanho.setText(tamanho);
            txtTamValor.setText(valor);
        }
    }//GEN-LAST:event_btnTamSelecionarActionPerformed

    private void btnTamAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamAlterarActionPerformed
        // CRUD
    }//GEN-LAST:event_btnTamAlterarActionPerformed


    private void enableComponents(){
        //btnCompAlterar.setEnabled(false);
        //btnCompRemover.setEnabled(false);
        //btnTamAlterar.setEnabled(false);
        //btnTamRemover.setEnabled(false);
        
        txtComplemento.setEnabled(false);
        txtCompValor.setEnabled(false);
        txtTamValor.setEnabled(false);
        txtTamanho.setEnabled(false);
    }
    
    private void setTableComplemento(){
        //listar todos os produtos adicionado
        
        String complemento, valor;
        
        //Tabela vazia
        DefaultTableModel model = (DefaultTableModel) tblComplementos.getModel();
        
        //valores fictícios, os originais devem ser puxados do BD
        complemento = "Banana"; valor = "3.00";
        model.addRow(new Object[]{complemento, valor});
        
        complemento = "Amendoim"; valor = "2.50";
        model.addRow(new Object[]{complemento, valor});
        
    }
    
    private void setTableTamanhos(){
        String tamanho, valor;
        
        //Tabela vazia
        DefaultTableModel model = (DefaultTableModel) tblTamanhos.getModel();
        
        //valores fictícios, os originais devem ser puxados do BD
        tamanho = "200ml"; valor = "5.00";
        model.addRow(new Object[]{tamanho, valor});
        
        tamanho = "1 litro"; valor = "10.00";
        model.addRow(new Object[]{tamanho, valor});
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompAdicionar;
    private javax.swing.JButton btnCompAlterar;
    private javax.swing.JButton btnCompRemover;
    private javax.swing.JButton btnCompSelecionar;
    private javax.swing.JButton btnTamAdicionar;
    private javax.swing.JButton btnTamAlterar;
    private javax.swing.JButton btnTamRemover;
    private javax.swing.JButton btnTamSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCompValor;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblComplementos;
    private javax.swing.JLabel lblTamTamanho;
    private javax.swing.JLabel lblTamValor;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlComplemento;
    private javax.swing.JPanel pnlTamanhos;
    private javax.swing.JTable tblComplementos;
    private javax.swing.JTable tblTamanhos;
    private javax.swing.JTextField txtCompValor;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtTamValor;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables
}