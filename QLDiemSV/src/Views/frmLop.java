/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Data.ConnectData;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Gin
 */
public class frmLop extends javax.swing.JFrame {

    /**
     * Creates new form frmLop
     */
    public frmLop() {
        initComponents();

        load();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdLop = new javax.swing.JTextField();
        txtTenLop = new javax.swing.JTextField();
        btnHuyBo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLop = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LỚP");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin lớp");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập lớp:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 102, 102));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add16.png"))); // NOI18N
        btnThem.setText("Thêm mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(0, 102, 102));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save16.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 102, 102));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit16.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 102, 102));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete16.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Mã lớp:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Tên lớp:");

        txtIdLop.setBackground(new java.awt.Color(255, 204, 153));
        txtIdLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdLop.setForeground(new java.awt.Color(153, 51, 0));

        txtTenLop.setBackground(new java.awt.Color(255, 204, 153));
        txtTenLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTenLop.setForeground(new java.awt.Color(153, 51, 0));

        btnHuyBo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuyBo.setForeground(new java.awt.Color(0, 102, 102));
        btnHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh16.png"))); // NOI18N
        btnHuyBo.setText("HỦY BỎ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdLop, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa))
                            .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHuyBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHuyBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tblLop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLop.setGridColor(new java.awt.Color(0, 102, 102));
        tblLop.setSelectionBackground(new java.awt.Color(153, 0, 153));
        tblLop.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLop);
        if (tblLop.getColumnModel().getColumnCount() > 0) {
            tblLop.getColumnModel().getColumn(0).setResizable(false);
            tblLop.getColumnModel().getColumn(1).setResizable(false);
            tblLop.getColumnModel().getColumn(2).setResizable(false);
        }

        btnThoat.setBackground(new java.awt.Color(0, 204, 204));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 102, 102));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit16.png"))); // NOI18N
        btnThoat.setToolTipText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// region Variable
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs;
    ResultSetMetaData rsm;

    private boolean capNhat = false;
// endregion
// region Funtion
    private void load(){
        tblLop.clearSelection();
        // disabled textbox
        txtIdLop.setEnabled(false);
        txtTenLop.setEnabled(false);
        // Enable nút Thêm mới, Sửa và Xóa
        btnThem.setEnabled(true);
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
            //DisAble nút lưu và bỏ qua
        btnLuu.setEnabled(false);
        btnHuyBo.setEnabled(false);

        HienThiDanhSach();
    }
    private void clearDataTextBox(){
        txtIdLop.setText("");
        txtTenLop.setText("");
    }
    private void HienThiDanhSach(){
        conn = ConnectData.getConnection();
        try {
            pst = conn.prepareStatement("select * from lop order by idLop Asc");
            rs = pst.executeQuery();
            rsm = rs.getMetaData();

            DefaultTableModel table = (DefaultTableModel)tblLop.getModel();
            table.setRowCount(0);
            //Đặt tiêu đề cho cột
            table.setColumnIdentifiers(new Object[]{"STT","Mã lớp","Tên lớp"});
            // Đặt kích thước cột
            TableColumnModel columnModel = tblLop.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(80);
            columnModel.getColumn(2).setPreferredWidth(240);
            // Định dạng lại tiêu đề cột
            DefaultTableCellRenderer tHeader = new DefaultTableCellRenderer();
            tHeader.setBackground(new Color(247, 141, 27));
            tHeader.setForeground(Color.WHITE);
            tHeader.setFont(new Font("Tahoma",Font.BOLD, 18));
            for (int i = 0; i < tblLop.getModel().getColumnCount(); i++) {
                    tblLop.getColumnModel().getColumn(i).setHeaderRenderer(tHeader);
            }
            while(rs.next()){
                Vector vt = new Vector();  
                //rs.last();
                for(int i=1;i<=rsm.getColumnCount();i++){
                    vt.add(i);
                    vt.add(rs.getString("idLop"));
                    vt.add(rs.getString("TenLop"));
                }
                table.addRow(vt);
            }
            } catch (SQLException ex) {
                Logger.getLogger(frmLop.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
// endregion
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION)        
            System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        clearDataTextBox();
        // Enabled textbox
        txtIdLop.setEnabled(true);
        txtTenLop.setEnabled(true);
        // Disable nút Thêm mới, Sửa và Xóa
        btnThem.setEnabled(false);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        //Enable nút lưu và bỏ qua
        btnLuu.setEnabled(true);
        btnHuyBo.setEnabled(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopMouseClicked
        // TODO add your handling code here:
        String id = tblLop.getValueAt(tblLop.getSelectedRow(), 1).toString();
        String name = tblLop.getValueAt(tblLop.getSelectedRow(), 2).toString();
        txtIdLop.setText(id);
        txtTenLop.setText(name);
    }//GEN-LAST:event_tblLopMouseClicked

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        // TODO add your handling code here:
        clearDataTextBox();
        load();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

            if (tblLop.getSelectedRowCount() > 0)
            {
                // Đánh dấu là Cập nhật
                capNhat = true;
                // Enabled textbox
                txtIdLop.setEnabled(false);
                txtTenLop.setEnabled(true);
                // Disable nút Thêm mới, Sửa và Xóa
                btnThem.setEnabled(false);
                btnSua.setEnabled(false);
                btnXoa.setEnabled(false);
                //Enable nút lưu và bỏ qua
                btnLuu.setEnabled(true);
                btnHuyBo.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Bạn cần phải chọn 1 hàng để cập nhật?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (tblLop.getSelectedRowCount() > 0)
        {
            int response;
            response = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa Lớp ("+ txtIdLop.getText() +") không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION)        
            {
                conn = ConnectData.getConnection();
                try {
                    String sql = "Delete from lop where idLop = ?";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,txtIdLop.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Xóa thất bại!\n"+ex);
                }
            }
            load();
            clearDataTextBox();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Bạn cần phải chọn 1 hàng để Xóa?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        //Kiểm tra mã loại đã tồn tại hay chưa
        boolean error = false;
        conn = ConnectData.getConnection();
        if(!capNhat){
            try {
                pst = conn.prepareStatement("select * from lop where idLop = ?");
                pst.setString(1, txtIdLop.getText());
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    error = true;
                }else{
                    error = false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmLop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (error)
            JOptionPane.showMessageDialog(null, "Lớp (" + txtIdLop.getText() + ") đã tồn tại!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        else
        {
            // Lưu các thông tin trên các control vào CSDL
            try
            {
                if (capNhat)
                {
                    try {
                        pst = conn.prepareStatement("update lop set tenLop=? where idLop=?");
                        pst.setString(1, txtTenLop.getText());
                        pst.setString(2, txtIdLop.getText());
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Cập nhật thất bại!\n"+e);
                    }
                }
                else
                {
                    try {
                        pst = conn.prepareStatement("insert into lop values(?,?)");
                        pst.setString(1, txtIdLop.getText());
                        pst.setString(2, txtTenLop.getText());
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Thêm thành công!");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Thêm thất bại!\n"+e);
                    }
                }
                // Tải lại form
                load();
                clearDataTextBox();
            }catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLop;
    private javax.swing.JTextField txtIdLop;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
