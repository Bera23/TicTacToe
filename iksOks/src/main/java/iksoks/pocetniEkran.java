/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iksoks;

import java.awt.Color;

/**
 *
 * @author urosb
 */
public class pocetniEkran extends javax.swing.JFrame {

   
    
    public pocetniEkran() {
        initComponents();
        getContentPane().setBackground(Color.white);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Izlaz = new javax.swing.JButton();
        PokretanjeIgre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LblMessage = new javax.swing.JLabel();
        PravilaIgre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(374, 490));

        Izlaz.setBackground(new java.awt.Color(0, 255, 153));
        Izlaz.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Izlaz.setText("Izadji iz igre!");
        Izlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzlazActionPerformed(evt);
            }
        });

        PokretanjeIgre.setBackground(new java.awt.Color(0, 255, 153));
        PokretanjeIgre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PokretanjeIgre.setText("Pocni igru!");
        PokretanjeIgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokretanjeIgreActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        LblMessage.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMessage.setText("IKS OKS");
        LblMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblMessage.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(LblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        PravilaIgre.setBackground(new java.awt.Color(0, 255, 153));
        PravilaIgre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PravilaIgre.setText("Pravila!");
        PravilaIgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PravilaIgreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Izlaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PravilaIgre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PokretanjeIgre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(PokretanjeIgre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PravilaIgre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Izlaz, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PokretanjeIgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokretanjeIgreActionPerformed
        setVisible(false);
        IksOks form = new IksOks();
        form.setVisible(true);
    }//GEN-LAST:event_PokretanjeIgreActionPerformed

    private void IzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzlazActionPerformed
       System.exit(0);
    }//GEN-LAST:event_IzlazActionPerformed

    private void PravilaIgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PravilaIgreActionPerformed
        setVisible(false);
        Informacije form = new Informacije();
        form.setVisible(true);
    }//GEN-LAST:event_PravilaIgreActionPerformed

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
            java.util.logging.Logger.getLogger(pocetniEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pocetniEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pocetniEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pocetniEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pocetniEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Izlaz;
    private javax.swing.JLabel LblMessage;
    private javax.swing.JButton PokretanjeIgre;
    private javax.swing.JButton PravilaIgre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
