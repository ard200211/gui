/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murid;


/**
 *
 * @author Arif Rachmat Darmawa
 */
public class tambah_murid extends javax.swing.JFrame {

    /**
     * Creates new form tambah_murid
     */
    public tambah_murid() {
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

        pnl_tambahMurid = new javax.swing.JPanel();
        lbl_tambahMurid = new javax.swing.JLabel();
        sp_pembatas = new javax.swing.JSeparator();
        lbl_nis = new javax.swing.JLabel();
        tf_nis = new javax.swing.JTextField();
        lbl_namaMurid = new javax.swing.JLabel();
        tf_namaMurid = new javax.swing.JTextField();
        lbl_tanggalLahir = new javax.swing.JLabel();
        tf_tanggalLahir = new javax.swing.JTextField();
        lbl_alamat = new javax.swing.JLabel();
        tf_alamat = new javax.swing.JTextField();
        btn_tambahData = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_tambahMurid.setBackground(new java.awt.Color(255, 255, 255));

        lbl_tambahMurid.setBackground(new java.awt.Color(0, 0, 0));
        lbl_tambahMurid.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_tambahMurid.setText("Tambah Murid");

        lbl_nis.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_nis.setText("NIS");

        tf_nis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_namaMurid.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_namaMurid.setText("Nama Murid");

        tf_namaMurid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_tanggalLahir.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_tanggalLahir.setText("Tanggal Lahir");

        tf_tanggalLahir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_alamat.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_alamat.setText("Alamat");

        tf_alamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_tambahData.setBackground(new java.awt.Color(0, 140, 186));
        btn_tambahData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_tambahData.setText("Tambah Data");

        btn_kembali.setBackground(new java.awt.Color(244, 67, 54));
        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_tambahMuridLayout = new javax.swing.GroupLayout(pnl_tambahMurid);
        pnl_tambahMurid.setLayout(pnl_tambahMuridLayout);
        pnl_tambahMuridLayout.setHorizontalGroup(
            pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp_pembatas, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                        .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nis, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_namaMurid, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_namaMurid)))
                    .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                        .addComponent(btn_tambahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93)
                        .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                        .addComponent(lbl_tambahMurid)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                        .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tanggalLahir)
                            .addComponent(tf_tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_alamat))))
                .addContainerGap())
        );
        pnl_tambahMuridLayout.setVerticalGroup(
            pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_tambahMurid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp_pembatas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nis)
                    .addComponent(lbl_namaMurid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_namaMurid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                        .addComponent(lbl_tanggalLahir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(pnl_tambahMuridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambahData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_tambahMuridLayout.createSequentialGroup()
                        .addComponent(lbl_alamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_tambahMurid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_tambahMurid, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        murid mrd = new murid();
        mrd.show();
        dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(tambah_murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_murid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_tambahData;
    private javax.swing.JLabel lbl_alamat;
    private javax.swing.JLabel lbl_namaMurid;
    private javax.swing.JLabel lbl_nis;
    private javax.swing.JLabel lbl_tambahMurid;
    private javax.swing.JLabel lbl_tanggalLahir;
    private javax.swing.JPanel pnl_tambahMurid;
    private javax.swing.JSeparator sp_pembatas;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_namaMurid;
    private javax.swing.JTextField tf_nis;
    private javax.swing.JTextField tf_tanggalLahir;
    // End of variables declaration//GEN-END:variables
}