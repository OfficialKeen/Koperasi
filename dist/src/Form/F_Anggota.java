package Form;

//import com.mysql.jdbc.Statement;
import Database.Koneksi;
import Database.Koneksi2;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;



public class F_Anggota extends javax.swing.JDialog {
    
    public TableCellRenderer kanan = new RenderingKanan();
    public TableCellRenderer tengah = new RenderingTengah();
    
    private DefaultTableModel model;
    String SIMPANEDIT;

    public F_Anggota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
//        tblAnggota.getColumnModel().getColumn(3).setCellRenderer( kanan );
//        tblAnggota.getColumnModel().getColumn(0).setCellRenderer( tengah );
        //tblAnggota.getColumnModel().getColumn(5).setCellRenderer( tengah );
        //tblAnggota.getColumnModel().getColumn(5).setPreferredWidth(300);
        
        tampil();
        bersih();
        tombol(true, false);
        AturText(false);        
        LoadPekerjaan();
        
        txID.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbPekerjaan = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txTglmasuk = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txTglL = new com.toedter.calendar.JDateChooser();
        txID = new javax.swing.JTextField();
        txNama = new javax.swing.JTextField();
        txTmpL = new javax.swing.JTextField();
        txsimpokok = new javax.swing.JTextField();
        txAdm = new javax.swing.JTextField();
        txTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAlamat = new javax.swing.JTextArea();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rdID = new javax.swing.JRadioButton();
        rdNama = new javax.swing.JRadioButton();
        txCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("<< Input Data >>"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("ID Anggota");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Tempat Lahir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Lahir");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setText("Simpanan Pokok");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setText("No. Telp");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        cmbPekerjaan.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(cmbPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 260, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setText("Pekerjaan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setText("Tanggal Masuk");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        txTglmasuk.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txTglmasuk.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txTglmasukPropertyChange(evt);
            }
        });
        jPanel1.add(txTglmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 260, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("Administrasi");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txTglL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txTglL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 260, -1));

        txID.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(txID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, -1));

        txNama.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(txNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, -1));

        txTmpL.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(txTmpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 260, -1));

        txsimpokok.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txsimpokok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txsimpokokKeyTyped(evt);
            }
        });
        jPanel1.add(txsimpokok, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 260, -1));

        txAdm.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txAdm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAdmKeyTyped(evt);
            }
        });
        jPanel1.add(txAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 260, -1));

        txTelp.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(txTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 260, -1));

        txAlamat.setColumns(20);
        txAlamat.setRows(5);
        jScrollPane1.setViewportView(txAlamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 260, 60));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 410, 370);

        bTambah.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });
        getContentPane().add(bTambah);
        bTambah.setBounds(20, 400, 80, 35);

        bEdit.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        bEdit.setText("EDIT");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        getContentPane().add(bEdit);
        bEdit.setBounds(110, 400, 80, 35);

        bHapus.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        getContentPane().add(bHapus);
        bHapus.setBounds(200, 400, 80, 35);

        bSimpan.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(bSimpan);
        bSimpan.setBounds(310, 400, 80, 35);

        bKeluar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        bKeluar.setText("KELUAR");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(bKeluar);
        bKeluar.setBounds(410, 400, 80, 35);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("<< View Data >>"));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAnggota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(430, 30, 890, 360);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Cari :");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonGroup1.add(rdID);
        rdID.setText("ID");
        rdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIDActionPerformed(evt);
            }
        });
        rdID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rdIDKeyReleased(evt);
            }
        });
        jPanel5.add(rdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        buttonGroup1.add(rdNama);
        rdNama.setText("Nama");
        jPanel5.add(rdNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txCari.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txCariKeyReleased(evt);
            }
        });
        jPanel5.add(txCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 190, -1));

        getContentPane().add(jPanel5);
        jPanel5.setBounds(520, 390, 300, 60);

        setSize(new java.awt.Dimension(1345, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        AksiTambah();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        AksiKeluar(evt);
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        AksiSimpanEdit(evt);
    }//GEN-LAST:event_bSimpanActionPerformed

    private void tblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseClicked
        MouseClik(evt);
    }//GEN-LAST:event_tblAnggotaMouseClicked

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        AksiEdit();
    }//GEN-LAST:event_bEditActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        AksiHapus(evt);
    }//GEN-LAST:event_bHapusActionPerformed

    private void txTglmasukPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txTglmasukPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txTglmasukPropertyChange

    private void rdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIDActionPerformed

    }//GEN-LAST:event_rdIDActionPerformed

    private void rdIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdIDKeyReleased

    }//GEN-LAST:event_rdIDKeyReleased

    private void txCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCariKeyReleased
        if (rdID.isSelected()){
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID");
            tbl.addColumn("Nama");
            tbl.addColumn("Alamat");
            tbl.addColumn("Tempat Lahir");
            tbl.addColumn("Tgl. Lahir");
            tbl.addColumn("Simpanan Pokok");
            tbl.addColumn("Administrasi");
            tbl.addColumn("No. Telp");
            tbl.addColumn("Pekerjaan"); 
            tbl.addColumn("Tgl. Masuk"); 
            tblAnggota.setModel(tbl);
            try {
                Statement statement=(Statement)Koneksi.GetConnection().createStatement();
                ResultSet res=statement.executeQuery("SELECT * FROM t_anggota WHERE No_anggota LIKE '"+txCari.getText()+"%'");
                while (res.next()) 
                {
                    tbl.addRow(new Object[]{
                        res.getString("No_anggota"),
                        res.getString("Nama"),
                        res.getString("Alamat"),
                        res.getString("Tmp_lahir"),
                        res.getDate("Tgl_lahir"),
                        res.getString("Sim_pokok"),
                        res.getString("Adm"),
                        res.getString("No_telp"),
                        res.getString("Pekerjaan"),
                        res.getDate("Tgl_masuk"),
                    });
                    tblAnggota.setModel(tbl);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Salah" +e);
            }
        }
        if (rdNama.isSelected()){
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID");
            tbl.addColumn("Nama");
            tbl.addColumn("Alamat");
            tbl.addColumn("Tempat Lahir");
            tbl.addColumn("Tgl. Lahir");
            tbl.addColumn("Simpanan Pokok");
            tbl.addColumn("Administrasi");
            tbl.addColumn("No. Telp");
            tbl.addColumn("Pekerjaan"); 
            tbl.addColumn("Tgl. Masuk"); 
            tblAnggota.setModel(tbl);
            try {
                Statement statement=(Statement)Koneksi.GetConnection().createStatement();
                ResultSet res=statement.executeQuery("SELECT * FROM t_anggota WHERE Nama LIKE '"+txCari.getText()+"%'");
                while (res.next()) 
                {
                    tbl.addRow(new Object[]{
                        res.getString("No_anggota"),
                        res.getString("Nama"),
                        res.getString("Alamat"),
                        res.getString("Tmp_lahir"),
                        res.getDate("Tgl_lahir"),
                        res.getString("Sim_pokok"),
                        res.getString("Adm"),
                        res.getString("No_telp"),
                        res.getString("Pekerjaan"),
                        res.getDate("Tgl_masuk"),
                    });
                    tblAnggota.setModel(tbl);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Salah" +e);
            }
        }
    }//GEN-LAST:event_txCariKeyReleased

    private void txsimpokokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txsimpokokKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_txsimpokokKeyTyped

    private void txAdmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAdmKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_txAdmKeyTyped

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
            java.util.logging.Logger.getLogger(F_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                F_Anggota dialog = new F_Anggota(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbPekerjaan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdID;
    private javax.swing.JRadioButton rdNama;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTextField txAdm;
    private javax.swing.JTextArea txAlamat;
    private javax.swing.JTextField txCari;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txTelp;
    private com.toedter.calendar.JDateChooser txTglL;
    private com.toedter.calendar.JDateChooser txTglmasuk;
    private javax.swing.JTextField txTmpL;
    private javax.swing.JTextField txsimpokok;
    // End of variables declaration//GEN-END:variables

    
    void bersih(){
        txNama.setText("");
        txAlamat.setText("");
        txTmpL.setText("");
        txTglL.setDate(null);
        txsimpokok.setText("");
        txAdm.setText("");
        txTelp.setText("");
        cmbPekerjaan.setSelectedItem("<==>");
        txTglmasuk.setDate(null);
    }
    
    void tombol(boolean a,boolean b){
        bTambah.setEnabled(a);
        bEdit.setEnabled(a);
        bHapus.setEnabled(a);
        bSimpan.setEnabled(b);
    }
    void AturText(boolean atur){
//        txID.setEnabled(atur);
        txNama.setEnabled(atur);
        txAlamat.setEnabled(atur);
        txTmpL.setEnabled(atur);
        txTglL.setEnabled(atur);
        txsimpokok.setEnabled(atur);
        txAdm.setEnabled(atur);
        txTelp.setEnabled(atur);
        cmbPekerjaan.setEnabled(atur);
        txTglmasuk.setEnabled(atur);
    }
    
    void Isi(){
        if(txID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Anggota tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            txID.requestFocus();
        }
        if(txNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            txNama.requestFocus();
        }
        if(txAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Alamat tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            txAlamat.requestFocus();
        }
        if(txTmpL.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Tempat Lahir tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            txTmpL.requestFocus();
        }
        /*if(tgl_lahir.setDate(null).isEmpty()){
            JOptionPane.showMessageDialog(this, "Tanggal Lahir tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            tx_no.requestFocus();
        }*/
        if(txsimpokok.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Fax tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            txsimpokok.requestFocus();
        }
        if(txTelp.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Telepon tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            txTelp.requestFocus();
        }
        /*if(cmbAgama.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Telepon tidak boleh KOSONG !","Pemberitahuan",JOptionPane.OK_CANCEL_OPTION);
            tx_telp.requestFocus();
        }*/
    }
       
    
    void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Alamat");
        tbl.addColumn("Tempat Lahir");
        tbl.addColumn("Tgl. Lahir");
        tbl.addColumn("Simpanan Pokok");
        tbl.addColumn("Administrasi");
        tbl.addColumn("No. Telp");
        tbl.addColumn("Pekerjaan"); 
        tbl.addColumn("Tgl. Masuk"); 
        tblAnggota.setModel(tbl);
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("Select * from t_anggota");
            while (res.next()) 
            {
                tbl.addRow(new Object[]{
                    res.getString("No_anggota"),
                    res.getString("Nama"),
                    res.getString("Alamat"),
                    res.getString("Tmp_lahir"),
                    res.getDate("Tgl_lahir"),
                    res.getString("Sim_pokok"),
                    res.getString("Adm"),
                    res.getString("No_telp"),
                    res.getString("Pekerjaan"),
                    res.getDate("Tgl_masuk"),
                });
                tblAnggota.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah" +e);
        }
            tblAnggota.getColumnModel().getColumn(0).setPreferredWidth(400);
            tblAnggota.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblAnggota.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblAnggota.getColumnModel().getColumn(3).setPreferredWidth(400);
            tblAnggota.getColumnModel().getColumn(4).setPreferredWidth(300);
            tblAnggota.getColumnModel().getColumn(5).setPreferredWidth(300);
            tblAnggota.getColumnModel().getColumn(5).setCellRenderer( kanan );
            tblAnggota.getColumnModel().getColumn(6).setPreferredWidth(300);
            tblAnggota.getColumnModel().getColumn(6).setCellRenderer( kanan );
            tblAnggota.getColumnModel().getColumn(7).setPreferredWidth(400);
            tblAnggota.getColumnModel().getColumn(8).setPreferredWidth(300);
            tblAnggota.getColumnModel().getColumn(9).setPreferredWidth(300);
    }
    
    void MouseClik(java.awt.event.MouseEvent evt){
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            int row = tblAnggota.rowAtPoint(evt.getPoint());

            String No_Anggota = tblAnggota.getValueAt(row, 0).toString();
            String Nama = tblAnggota.getValueAt(row, 1).toString();
            String Alamat = tblAnggota.getValueAt(row, 2).toString();
            String Tmp_lahir = tblAnggota.getValueAt(row, 3).toString();
            String Tgl_lahir = tblAnggota.getValueAt(row, 4).toString();
            String Sim_pokok = tblAnggota.getValueAt(row, 5).toString();
            String Adm = tblAnggota.getValueAt(row, 6).toString();
            String No_telp = tblAnggota.getValueAt(row, 7).toString();
            String Pekerjaan = tblAnggota.getValueAt(row, 8).toString();
            String Tgl_masuk = tblAnggota.getValueAt(row, 9).toString();
                        
            txID.setText(String.valueOf(No_Anggota));
            txNama.setText(String.valueOf(Nama));
            txAlamat.setText(String.valueOf(Alamat));
            txTmpL.setText(String.valueOf(Tmp_lahir));
            txTglL.setDate(java.sql.Date.valueOf(Tgl_lahir));
            txsimpokok.setText(String.valueOf(Sim_pokok));
            txAdm.setText(String.valueOf(Adm));
            txTelp.setText(String.valueOf(No_telp));
            cmbPekerjaan.setSelectedItem(String.valueOf(Pekerjaan));
            txTglmasuk.setDate(java.sql.Date.valueOf(Tgl_masuk));
            } catch (Exception e) {
        }        
    }

    void AksiSimpanEdit(java.awt.event.ActionEvent evt){
        tblAnggota.setVisible(true);
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(txTglL.getDate()));
        
        String tmpl ="yyyy-MM-dd";
        SimpleDateFormat fn = new SimpleDateFormat(tmpl);
        String tglmasuk = String.valueOf(fn.format(txTglmasuk.getDate()));
        
        if (SIMPANEDIT.equalsIgnoreCase("Add")){
            try {
                Statement statement=(Statement)Koneksi.GetConnection().createStatement();
                String sql = "INSERT INTO t_anggota(No_anggota,Nama,Alamat,Tmp_lahir,Tgl_lahir,Sim_pokok,Adm,No_telp,Pekerjaan,Tgl_masuk) "
                        + "VALUES ('"+txID.getText()+"','"+txNama.getText()+"','"+txAlamat.getText()+"',"
                        + "'"+txTmpL.getText()+"','"+tanggal+"','"+txsimpokok.getText()+"','"+txAdm.getText()+"',"
                        + "'"+txTelp.getText()+"','"+cmbPekerjaan.getSelectedItem()+"','"+tglmasuk+"')";
                statement.executeUpdate(sql);
                statement.close();
                tampil();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                txID.setText("");
                bersih();
                AturText(false);
                tombol(true, false);
                bKeluar.setText("KELUAR");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
            }
        }
        else{
            try {
                Statement statement=(Statement)Koneksi.GetConnection().createStatement();
                String sql = "UPDATE t_anggota SET Nama = '" +txNama.getText()+"',"
                        + "Alamat = '" + txAlamat.getText()+"',"
                        + "Tmp_lahir = '" + txTmpL.getText()+"',"
                        + "Tgl_lahir = '" + tanggal+"',"
                        + "Sim_pokok = '" + txsimpokok.getText()+"',"
                        + "Adm = '" + txAdm.getText()+"',"
                        + "No_telp = '" + txTelp.getText()+"',"
                        + "Pekerjaan = '" + cmbPekerjaan.getSelectedItem()+"',"
                        + "Tgl_masuk = '" + tglmasuk+"'"
                        + "WHERE No_anggota = '"+txID.getText()+"'";                    
                statement.executeUpdate(sql);
                statement.close();
                tampil();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Rubah");
                bersih();
                AturText(false);
                tombol(true, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Di Rubah" + e);
            }
        }
    }
    
    void AksiHapus(java.awt.event.ActionEvent evt){
        if(txID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih data yang akan di Hapus");
        }
        else{
            int selectedOption = JOptionPane.showConfirmDialog(null, "Yakin anda akan menghapus ?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                try {
                    Statement statement=(Statement)Koneksi.GetConnection().createStatement();

                    String sql = "DELETE FROM t_anggota WHERE No_anggota = '"+txID.getText()+"';";                    
                    statement.executeUpdate(sql);
                    statement.close();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
                    bersih();
                    tombol(true, false);
                } catch (Exception DBException) {
                    JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus " + DBException);
                    bersih();
                }
            }            
            tampil();
        }
    }
    
    void AksiKeluar(java.awt.event.ActionEvent evt){
        if(bKeluar.getText().equals("KELUAR")){
            dispose();
        }
        else{
            txID.setText("");
            AturText(false);
            bKeluar.setText("KELUAR");
            tombol(true, false);
            tblAnggota.setVisible(true);
            bersih();
        }
    }
    void AksiTambah(){
        SIMPANEDIT = "Add";
        //buatnomor();
//        noUrut();
        //auto();
        ID();
        //oto();
        bersih();
        tombol(false, true);
        AturText(true);
        bKeluar.setText("BATAL");
        tblAnggota.setVisible(false);
        cmbPekerjaan.setSelectedItem("");
    }
    
    void AksiEdit(){
        if(txID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih data yang akan di Rubah");
        }
        else{
            SIMPANEDIT = "Edit";
            tombol(false, true);
            AturText(true);
            bKeluar.setText("BATAL");
            tblAnggota.setVisible(false);
        }        
    }
    
    void noUrut(){
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            String sql ="SELECT MAX(right(No_anggota,1)) FROM t_anggota";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.first()==false){
                txID.setText("AG-1");
            }
            else{
                rs.last();
                int no=rs.getInt(1)+1;
                String cno=String.valueOf(no);
                int pjg_cno=cno.length();
                for (int i = 0; i < 2-pjg_cno; i++) {
                    cno=""+cno;
                }
                txID.setText("AG-"+ cno);
            }
        } catch (Exception e) {
            System.err.println("Error = "+ e);
        }
    }
    
    void LoadPekerjaan(){
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("Select Pekerjaan From t_pekerjaan order by No_Pek asc");
            while (res.next()) 
            {
                Object[] ob = new Object[1];
                ob[0] = res.getString(1);
                
                cmbPekerjaan.addItem(ob[0]);
            }
            res.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah" +e);
        }
    }
    
    void filterangka(KeyEvent b){
        if(Character.isDigit(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Huruf");
        }
    }
    
    void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
        }
    }
        
    void ID(){
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            String sql = "SELECT MAX(right(No_anggota,5)) AS no FROM t_anggota";
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next())
            {
                if(rs.first() == false)
                {
                txID.setText("AG-000001");
            }
                else
            {
                   rs.last();
                   int auto_id = rs.getInt(1) + 1;
                   String no = String.valueOf(auto_id);
                   int noLong = no.length();
                   //MENGATUR jumlah 0
                    for(int a=0;a<6-noLong;a++)
                    { 
                        no = "0" + no;
                    }
                   txID.setText("AG-" + no);
                 }        
            }
       rs.close();
        } catch (Exception e) {
        }
    }
}
