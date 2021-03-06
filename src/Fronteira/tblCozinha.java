package Fronteira;

import Controle.ClsRelacional;
import Persistencia.PerCozinha;
import Persistencia.PerRelacional;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.ListModel;

public class tblCozinha extends javax.swing.JFrame {

    String id;

    Date hoje = new Date();
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public tblCozinha() {
        initComponents();

        df.setTimeZone(TimeZone.getTimeZone("GMT-3"));

        //PreencherLista();
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
                ImageIcon im = new ImageIcon ("src\\Imagens\\back1.jpg");
                Image i = im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        painel1 = new javax.swing.JPanel();
        btnPronto1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        onoff1 = new javax.swing.JToggleButton();
        painel3 = new javax.swing.JPanel();
        btnPronto3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista3 = new javax.swing.JList<>();
        onoff3 = new javax.swing.JToggleButton();
        painel2 = new javax.swing.JPanel();
        btnPronto2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        onoff2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cozinha");

        painel1.setBackground(new java.awt.Color(204, 204, 204));
        painel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnPronto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPronto1.setText("Pronto!!!");
        btnPronto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronto1ActionPerformed(evt);
            }
        });

        lista1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista1.setToolTipText("");
        jScrollPane1.setViewportView(lista1);

        onoff1.setText("Andamento");
        onoff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoff1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPronto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onoff1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(onoff1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPronto1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        painel3.setBackground(new java.awt.Color(204, 204, 204));
        painel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnPronto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPronto3.setText("Pronto!!!");
        btnPronto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronto3ActionPerformed(evt);
            }
        });

        lista3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(lista3);

        onoff3.setText("Andamento");
        onoff3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoff3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPronto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onoff3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(onoff3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPronto3))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        painel2.setBackground(new java.awt.Color(204, 204, 204));
        painel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnPronto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPronto2.setText("Pronto!!!");
        btnPronto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronto2ActionPerformed(evt);
            }
        });

        lista2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(lista2);

        onoff2.setText("Andamento");
        onoff2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoff2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPronto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onoff2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(onoff2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPronto2))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(994, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPronto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronto1ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja concluir esse pedido?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            DefaultListModel model = new DefaultListModel();
            model.clear();
            //PEGAR OS ELEMENTOS DO PEDIDO NO BD
            model.addElement("Açaí - 300ml - Banana");

            //lista1.setModel(model);
            disableAndamento(onoff1, lista1);
        }
    }//GEN-LAST:event_btnPronto1ActionPerformed

    private void btnPronto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronto2ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja concluir esse pedido?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            DefaultListModel model = new DefaultListModel();
            model.clear();
            //PEGAR OS ELEMENTOS DO PEDIDO NO BD
            model.addElement("Vitamina 7 - Dadinho");

            //lista2.setModel(model);
            disableAndamento(onoff2, lista2);
        }
    }//GEN-LAST:event_btnPronto2ActionPerformed

    private void btnPronto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronto3ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja concluir esse pedido?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            DefaultListModel model = new DefaultListModel();
            model.clear();

            //PEGAR OS ELEMENTOS DO PEDIDO NO BD
            model.addElement("Açaí - 500ml - Paçoca");
            model.addElement("Vitamina 7 - Banana");
            model.addElement("Vitamina 3 - Abacaxi");

            //lista3.setModel(model);
            disableAndamento(onoff3, lista3);
        }
    }//GEN-LAST:event_btnPronto3ActionPerformed

    private void onoff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoff1ActionPerformed
        if (onoff1.isSelected()) {
            paintList(lista1, true);
        } else {
            paintList(lista1, false);
        }
    }//GEN-LAST:event_onoff1ActionPerformed

    private void onoff2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoff2ActionPerformed
        if (onoff2.isSelected()) {
            paintList(lista2, true);
        } else {
            paintList(lista2, false);
        }
    }//GEN-LAST:event_onoff2ActionPerformed

    private void onoff3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoff3ActionPerformed
        if (onoff3.isSelected()) {
            paintList(lista3, true);
        } else {
            paintList(lista3, false);
        }
    }//GEN-LAST:event_onoff3ActionPerformed

    public void paintList(JList list, boolean paint) {
        //paint true -> pintar de cinza,     paint false -> deixar branco
        if (paint) {
            list.setBackground(new Color(204, 204, 225));
        } else {
            list.setBackground(new Color(255, 255, 255));
        }

    }

    public void disableAndamento(JToggleButton button, JList list) {
        button.setSelected(false);
        paintList(list, false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tblCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tblCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tblCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tblCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tblCozinha().setVisible(true);
            }
        });
    }

    private void PreencherLista() {

        /*
        DefaultListModel model2 = new DefaultListModel();
        boolean verificarPedido = true;
        boolean verificarProduto = true;
        boolean verificarComplemento = true;

        model2.clear();
        //JOptionPane.showMessageDialog(null, df.format(new Date()));
        int i = 0;

        String teste = "30/12/2020";
        //ArrayList<ClsRelacional> relacional = PerCozinha.ImpressaoCozinha(teste);
        ArrayList<ClsRelacional> relacional = PerCozinha.ImpressaoCozinha(df.format(new Date()));

        int CodPedido = 0, CodProduto = 0, CodComp = 0;

        for (ClsRelacional p : relacional) {
        
            //JOptionPane.showMessageDialog usados para testes
            JOptionPane.showMessageDialog(null, p.getPedido_CodPedido());
            JOptionPane.showMessageDialog(null, p.getProduto_CodProduto());
            JOptionPane.showMessageDialog(null, p.getCodComplemento());

            while (verificarPedido == true) {
                while (verificarProduto == true) {

                    if (p.getIdProduto() == 1) { //acai

                        if (p.getCodProduto() >= CodPedido) {
                            //cout << "Acai " + p.getTamanhoAcai << endl << "Complementos:" << endl;
                            model2.addElement("Açai " + p.getTamanhoAcai() + " \nComplemento(s):");
                            lista1.setModel(model2);

                            //model2.clear();
                            //idComp = p.getCodComplemento;
                            while (verificarComplemento == true) {

                                if (p.getCodComplemento() >= CodComp) {
                                    //cout << p.NomeComplemento;
                                    model2.addElement(p.getNomeComplemento() + " - ");
                                    lista1.setModel(model2);
                                    model2.clear();

                                    CodComp = p.getCodComplemento();
                                } else {
                                    verificarComplemento = false;
                                }

                            }

                            CodProduto = p.getCodProduto();

                        } else {
                            verificarProduto = false;
                        }

                    } else { //vitamina	

                        model2.addElement("Vitamina " + p.getTipoVitamina() + ": " + p.getNomeVitamina() + " \nComplemento(s):");
                        lista1.setModel(model2);

                        JOptionPane.showMessageDialog(null, model2);
                        //model2.clear();

                        //idComp = p.getCodComplemento;
                        while (verificarComplemento == true) {
                            //model2.addElement(p.getNomeComplemento() + " - ");
                            //lista1.setModel(model2);
                            //model2.clear();

                            if (p.getCodComplemento() != (p.getCodComplemento() + 1)) {
                                verificarComplemento = false;
                            }
                        }
                        if (p.getCodProduto() != (p.getCodProduto() + 1)) {
                            verificarProduto = false;
                        }

                    }
                }
                if (p.getCodPedido() != (p.getCodPedido() + 1)) {
                    verificarPedido = false;
                }
            }
            
            if (i == 3) {
                return; // stop; // break;
            } else {
                i++;
            }
             
         */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPronto1;
    private javax.swing.JButton btnPronto2;
    private javax.swing.JButton btnPronto3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JList<String> lista3;
    private javax.swing.JToggleButton onoff1;
    private javax.swing.JToggleButton onoff2;
    private javax.swing.JToggleButton onoff3;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel pnlBack;
    // End of variables declaration//GEN-END:variables

}
