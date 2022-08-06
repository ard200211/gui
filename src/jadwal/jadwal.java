/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadwal;

import dashboard.dashboard;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arif Rachmat Darmawa
 */
public class jadwal extends javax.swing.JFrame {
    static Statement stmt;
    static Connection conn;
    static ResultSet resultSet;
    /**
     * Creates new form jadwal
     */
    public jadwal() {
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

        pnl_jadwal = new javax.swing.JPanel();
        lbl_jadwal = new javax.swing.JLabel();
        sp_pembatas = new javax.swing.JSeparator();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_jadwal = new javax.swing.JTable();
        btn_kembali = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_jadwal.setBackground(new java.awt.Color(255, 255, 255));
        pnl_jadwal.setPreferredSize(new java.awt.Dimension(1092, 605));

        lbl_jadwal.setBackground(new java.awt.Color(0, 0, 0));
        lbl_jadwal.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_jadwal.setText("Data Jadwal");

        btn_tambah.setBackground(new java.awt.Color(0, 140, 186));
        btn_tambah.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ic_tambah.png"))); // NOI18N
        btn_tambah.setText(" Tambah Data");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(76, 175, 80));
        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ic_edit.png"))); // NOI18N
        btn_edit.setText(" Edit Data");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(244, 67, 54));
        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ic_hapus.png"))); // NOI18N
        btn_hapus.setText(" Hapus Data");

        tbl_jadwal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tbl_jadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Mapel", "Nama Guru", "Nama Mata Pelajaran", "Hari", "Jam"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_jadwal);

        btn_kembali.setBackground(new java.awt.Color(244, 67, 54));
        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(76, 175, 80));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ic_edit.png"))); // NOI18N
        btnView.setText("Show Data");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_jadwalLayout = new javax.swing.GroupLayout(pnl_jadwal);
        pnl_jadwal.setLayout(pnl_jadwalLayout);
        pnl_jadwalLayout.setHorizontalGroup(
            pnl_jadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp_pembatas)
            .addGroup(pnl_jadwalLayout.createSequentialGroup()
                .addGroup(pnl_jadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_jadwalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_jadwal))
                    .addGroup(pnl_jadwalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnl_jadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_jadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnl_jadwalLayout.createSequentialGroup()
                                    .addComponent(btn_tambah)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_kembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnl_jadwalLayout.setVerticalGroup(
            pnl_jadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_jadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_jadwal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp_pembatas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_jadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_jadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_jadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        tambah_jadwal tj = new tambah_jadwal();
        tj.show();

        dispose();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        dashboard dabo = new dashboard();
        dabo.show();
        
        dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        edit_jadwal ej = new edit_jadwal();
        ej.show();

        dispose();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        table();
    }//GEN-LAST:event_btnViewActionPerformed
    public void table(){
        Config con = new Config();
        String queryJadwal = "SELECT * FROM jadwal";
        con.dbConnect();
        
        try {
            stmt = Config.conn.createStatement();
            resultSet = stmt.executeQuery(queryJadwal);
            int i = 1;
                while(resultSet.next()){
                    String kd_mapel = resultSet.getString("kd_mapel");
                    String kd_guru = resultSet.getString("kd_guru");
                    String nama_mapel = resultSet.getString("nama_mapel");
                    String hari = resultSet.getString("hari");
                    String jam = resultSet.getString("jam");
                    String columns[] = { String.valueOf(i++), kd_mapel, kd_guru, nama_mapel, hari, jam };

                    DefaultTableModel tblModel = (DefaultTableModel)tbl_jadwal.getModel();
                    tblModel.addRow(columns);     
                }            
        }catch(SQLException e){
            System.out.println("Masalah Terdapat pada QUERY / WEB SERVER");
        }
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
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_jadwal;
    private javax.swing.JPanel pnl_jadwal;
    private javax.swing.JSeparator sp_pembatas;
    private javax.swing.JTable tbl_jadwal;
    // End of variables declaration//GEN-END:variables
}
