/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import config.Database;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class user extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;
    private String SQL;

    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        setform(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(false);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
        getuser();
    }

    public void setform(boolean b) {
        txt_id.setEnabled(b);
        txt_nama.setEnabled(b);
        txt_username.setEnabled(b);
        txt_password.setEnabled(b);
        cb_role.setEnabled(b);
    }

    public void baru() {
        txt_id.setText(null);
        txt_nama.setText(null);
        txt_username.setText(null);
        txt_password.setText(null);
        cb_role.setSelectedIndex(0);
    }

    public void getuser() {
        dtm = new DefaultTableModel();
        dtm.addColumn("ID User");
        dtm.addColumn("Nama");
        dtm.addColumn("Username");
        dtm.addColumn("Password");
        dtm.addColumn("ID Role");

        tbl_user.setModel(dtm);
        java.sql.Connection DB = new Database().connect();
        try {
            java.sql.Statement stmt = DB.createStatement();
            SQL = "SELECT * FROM user";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                dtm.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("nama"),
                    res.getString("username"),
                    res.getString("password"),
                    res.getString("role")
                });
            }
        } catch (Exception e) {

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

        bodyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_cancel_edit = new javax.swing.JButton();
        cb_role = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("User");

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("|Input Data User");

        jLabel2.setText("ID User");

        jLabel3.setText("Nama");

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        jLabel6.setText("Role");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("|Table Data User");

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_user);

        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_cancel_edit.setText("Cancel Edit");
        btn_cancel_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_editActionPerformed(evt);
            }
        });

        cb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Role...", "Admin", "Petugas" }));

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_cancel_edit, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bodyPanelLayout.createSequentialGroup()
                                        .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_edit)
                                        .addGap(16, 16, 16)
                                        .addComponent(btn_delete))
                                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txt_password)
                            .addComponent(txt_username)
                            .addComponent(txt_nama)
                            .addComponent(txt_id)
                            .addComponent(cb_role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(77, 77, 77)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_new)
                            .addComponent(btn_save)
                            .addComponent(btn_edit)
                            .addComponent(btn_delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancel_edit)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_userMouseClicked
        // TODO add your handling code here:
        txt_id.setEnabled(false);
        btn_new.setEnabled(true);
        btn_edit.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_update.setEnabled(false);
        btn_save.setEnabled(false);
        btn_cancel_edit.setVisible(false);

        int baris = tbl_user.getSelectedRow();
        txt_id.setText(dtm.getValueAt(baris, 0).toString());
        txt_nama.setText(dtm.getValueAt(baris, 1).toString());
        txt_username.setText(dtm.getValueAt(baris, 2).toString());
        txt_password.setText(dtm.getValueAt(baris, 3).toString());
        cb_role.setSelectedItem(dtm.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tbl_userMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        btn_new.setEnabled(true);
        btn_save.setEnabled(true);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
        if (txt_id.getText().isEmpty() || txt_nama.getText().isEmpty() || txt_username.getText().isEmpty() || txt_password.getText().isEmpty() || cb_role.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Silahkan isi data terlebih dahulu !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            java.sql.Connection DB = new Database().connect();
            try {
                java.sql.PreparedStatement stmt = DB.prepareStatement("INSERT INTO user (id, nama, username, password, role) VALUES (?, ?, ?, ?, ?)");
                try {
                    stmt.setString(1, txt_id.getText());
                    stmt.setString(2, txt_nama.getText());
                    stmt.setString(3, txt_username.getText());
                    stmt.setString(4, txt_password.getText());
                    stmt.setString(5, cb_role.getSelectedItem().toString());
                    stmt.executeUpdate();
                    btn_save.setEnabled(false);
                    baru();
                    setform(false);
                    getuser();
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Data gagal disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        btn_new.setEnabled(true);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
        java.sql.Connection DB = new Database().connect();
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ?", "Message", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                SQL = "DELETE FROM user WHERE id = '" + txt_id.getText() + "'";
                java.sql.PreparedStatement stmt = DB.prepareStatement(SQL);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                getuser();
                baru();
                setform(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        setform(true);
        txt_id.setEnabled(false);
        btn_edit.setVisible(true);
        btn_update.setEnabled(true);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_new.setEnabled(false);
        btn_cancel_edit.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        btn_update.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_new.setEnabled(true);
        btn_cancel_edit.setVisible(false);
        
        if (txt_id.getText().isEmpty() || txt_nama.getText().isEmpty() || txt_username.getText().isEmpty() || txt_password.getText().isEmpty() || cb_role.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Kosong, Silahkan isi data terlebih dahulu !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            java.sql.Connection DB = new Database().connect();
        try {
                SQL = "UPDATE user set nama = '"+ txt_nama.getText() +"', username = '"+ txt_username.getText() +"', nama = '"+ txt_nama.getText() + "', role = '"+ cb_role.getSelectedItem() +"' WHERE id = '" + txt_id.getText() + "'";
                java.sql.PreparedStatement stmt = DB.prepareStatement(SQL);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                getuser();
                btn_update.setEnabled(false);
                 baru();
                 setform(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Data gagal diupdate", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }  
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_cancel_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_editActionPerformed
        // TODO add your handling code here:
        baru();
        setform(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(false);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_cancel_editActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
         baru();
        setform(true);
        txt_id.requestFocus();
        btn_new.setEnabled(true);
        btn_save.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_newActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btn_cancel_edit;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_user;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
