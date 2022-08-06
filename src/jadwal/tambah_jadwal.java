/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadwal;

import guru.guru;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arif Rachmat Darmawa
 */
public final class tambah_jadwal extends javax.swing.JFrame {
    static Statement stmt;
    static Connection conn;
    static ResultSet resultSet;
    /**
     * Creates new form tambah_jadwal
     */
    public tambah_jadwal() {
        initComponents();
        viewNamaGuru();
        viewMapel();
    }
    
    public void viewNamaGuru(){
        try{
            Config con = new Config();
            con.dbConnect();
            
            String query = "SELECT * FROM guru";
            stmt = Config.conn.createStatement();
            resultSet = stmt.executeQuery(query);
            
            while(resultSet.next()){
                namaGuru.addItem(resultSet.getString("kd_guru"));
            }
            
        }catch(SQLException e){
            System.out.println(""+e);
        }
    }
    
    public void viewMapel(){
        try{
            Config con = new Config();
            con.dbConnect();
            
            String query = "SELECT * FROM mapel";
            stmt = Config.conn.createStatement();
            resultSet = stmt.executeQuery(query);
            
            while(resultSet.next()){
                kodeMapel.addItem(resultSet.getString("kd_mapel"));
            }
            
        }catch(SQLException e){
            System.out.println(""+e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_tambahJadwal = new javax.swing.JPanel();
        lbl_tambahJadwal = new javax.swing.JLabel();
        sp_pembatas = new javax.swing.JSeparator();
        lbl_kodeMapel = new javax.swing.JLabel();
        lbl_namaGuru = new javax.swing.JLabel();
        lbl_namaMapel = new javax.swing.JLabel();
        namaMapel = new javax.swing.JTextField();
        lbl_hari = new javax.swing.JLabel();
        hari = new javax.swing.JTextField();
        lbl_jam = new javax.swing.JLabel();
        jam = new javax.swing.JTextField();
        tambahData = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        namaGuru = new javax.swing.JComboBox<>();
        kodeMapel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_tambahJadwal.setBackground(new java.awt.Color(255, 255, 255));

        lbl_tambahJadwal.setBackground(new java.awt.Color(0, 0, 0));
        lbl_tambahJadwal.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_tambahJadwal.setText("Tambah Jadwal");

        lbl_kodeMapel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_kodeMapel.setText("Kode Mata Pelajaran ( Contoh Penamaan : KDM_001 )");

        lbl_namaGuru.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_namaGuru.setText("Nama Guru");

        lbl_namaMapel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_namaMapel.setText("Nama Mata Pelajaran");

        namaMapel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_hari.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_hari.setText("Hari");

        hari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_jam.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_jam.setText("Jam");

        jam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tambahData.setBackground(new java.awt.Color(0, 140, 186));
        tambahData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tambahData.setText("Tambah Data");
        tambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahDataActionPerformed(evt);
            }
        });

        btn_kembali.setBackground(new java.awt.Color(244, 67, 54));
        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        namaGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaGuruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_tambahJadwalLayout = new javax.swing.GroupLayout(pnl_tambahJadwal);
        pnl_tambahJadwal.setLayout(pnl_tambahJadwalLayout);
        pnl_tambahJadwalLayout.setHorizontalGroup(
            pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp_pembatas, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                        .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_tambahJadwal)
                            .addComponent(lbl_kodeMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kodeMapel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                                .addComponent(lbl_namaGuru)
                                .addGap(397, 397, 397))
                            .addComponent(namaGuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                        .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambahData, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_namaMapel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hari)
                            .addComponent(lbl_hari)
                            .addComponent(btn_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)))
                    .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                        .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_jam)
                            .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_tambahJadwalLayout.setVerticalGroup(
            pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tambahJadwal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp_pembatas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_kodeMapel)
                    .addComponent(lbl_namaGuru))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaGuru, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(kodeMapel))
                .addGap(2, 2, 2)
                .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                        .addComponent(lbl_hari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_tambahJadwalLayout.createSequentialGroup()
                        .addComponent(lbl_namaMapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl_jam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(pnl_tambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_tambahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_tambahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        jadwal jdw = new jadwal();
        jdw.show();
        dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void tambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahDataActionPerformed
        // TODO add your handling code here:
        //System.out.println(namaGuru.getSelectedItem());
        Config con = new Config();
        con.dbConnect();
        
        String sqlInsert = "INSERT INTO jadwal (kd_mapel, kd_guru, nama_mapel, hari, jam) VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement ps;
            ps = Config.conn.prepareStatement(sqlInsert);
            ps.setString(1, (String) kodeMapel.getSelectedItem());
            ps.setString(2, (String) namaGuru.getSelectedItem());
            ps.setString(3, namaMapel.getText());
            ps.setString(4, hari.getText());
            ps.setString(5, jam.getText());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Sukses Insert Data Jadwal");
            jadwal gr = new jadwal();
            gr.show();
            dispose();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Insert Data Jadwal "+e.getMessage());
            jadwal gr = new jadwal();
            gr.show();
            dispose();
        }
        
    }//GEN-LAST:event_tambahDataActionPerformed

    private void namaGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaGuruActionPerformed
    
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
            java.util.logging.Logger.getLogger(tambah_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kembali;
    private javax.swing.JTextField hari;
    private javax.swing.JTextField jam;
    private javax.swing.JComboBox<String> kodeMapel;
    private javax.swing.JLabel lbl_hari;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_kodeMapel;
    private javax.swing.JLabel lbl_namaGuru;
    private javax.swing.JLabel lbl_namaMapel;
    private javax.swing.JLabel lbl_tambahJadwal;
    private javax.swing.JComboBox<String> namaGuru;
    private javax.swing.JTextField namaMapel;
    private javax.swing.JPanel pnl_tambahJadwal;
    private javax.swing.JSeparator sp_pembatas;
    private javax.swing.JButton tambahData;
    // End of variables declaration//GEN-END:variables
}
