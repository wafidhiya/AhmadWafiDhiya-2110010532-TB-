/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ppdb;

/**
 *
 * @author USER
 */
public class form_awal extends javax.swing.JFrame {

    /**
     * Creates new form form_awal
     */
    public form_awal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formsiswa = new javax.swing.JButton();
        formortu = new javax.swing.JButton();
        formtransaksi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        formadmin = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        formsiswa.setText("FORM SISWA");
        formsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formsiswaActionPerformed(evt);
            }
        });

        formortu.setText("FORM ORANG TUA");
        formortu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formortuActionPerformed(evt);
            }
        });

        formtransaksi.setText("FORM TRANSAKSI");
        formtransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formtransaksiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("APLIKASI PENDAFTARAN SISWA");

        formadmin.setText("ADMIN");
        formadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formadminActionPerformed(evt);
            }
        });

        buttonKeluar.setText("KELUAR");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(formsiswa)
                        .addGap(37, 37, 37)
                        .addComponent(formtransaksi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(formortu)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(buttonKeluar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formadmin)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formsiswa)
                    .addComponent(formtransaksi))
                .addGap(30, 30, 30)
                .addComponent(formortu)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(formadmin)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonKeluar)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formsiswaActionPerformed
         {
    // Membuat instance dari form_siswa
    form_siswa formSiswa = new form_siswa();
    
    // Menampilkan form_siswa
    formSiswa.setVisible(true);
    
    // Menyembunyikan form_awal jika diperlukan
    this.setVisible(false);
}        // TODO add your handling code here:
    }//GEN-LAST:event_formsiswaActionPerformed

    private void formadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formadminActionPerformed
          {
    // Membuat instance dari form_siswa
    login_admin buttonAdmin = new login_admin();
    
    // Menampilkan form_siswa
    buttonAdmin.setVisible(true);
    
    // Menyembunyikan form_awal jika diperlukan
    this.setVisible(false);
}           // TODO add your handling code here:
    }//GEN-LAST:event_formadminActionPerformed

    private void formtransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formtransaksiActionPerformed
       {
    // Membuat instance dari form_siswa
    form_transaksi formtransaksi = new form_transaksi();
    
    // Menampilkan form_siswa
    formtransaksi.setVisible(true);
    
    // Menyembunyikan form_awal jika diperlukan
    this.setVisible(false);
}            // TODO add your handling code here:
    }//GEN-LAST:event_formtransaksiActionPerformed

    private void formortuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formortuActionPerformed
        {
    // Membuat instance dari form_siswa
    form_ortu formortu = new form_ortu();
    
    // Menampilkan form_siswa
    formortu.setVisible(true);
    
    // Menyembunyikan form_awal jika diperlukan
    this.setVisible(false);
}          // TODO add your handling code here:
    }//GEN-LAST:event_formortuActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(form_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton formadmin;
    private javax.swing.JButton formortu;
    private javax.swing.JButton formsiswa;
    private javax.swing.JButton formtransaksi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
