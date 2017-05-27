/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db_offi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class db_gui extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    private Object TextID;
    private Object TextName;
    private Object TextPos;
    private Object TextSal;
    
    public db_gui() {
        initComponents();
        DoConnect();
    }

    public void DoConnect() {
    
    try  {
            //CONNECT TO THE DATABASE
            String host = "jdbc:derby://localhost:1527/Employees";
            String uName = "user1";
            String uPass = "user1";
            con = DriverManager.getConnection( host, uName, uPass );
            
            stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            String SQL = "SELECT * FROM DEMO";
            rs = stmt.executeQuery( SQL );
            
            rs.next();
            String id = rs.getString("ID");
            String name = rs.getString("Name");
            String pos = rs.getString("POSITION");
            int sal_col = rs.getInt("SALARY");
            String sal = Integer.toString(sal_col);
              //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
              
             TextID.setText(id);
             TextName.setText(name);
             TextPos.setText(pos);
             TextSal.setText(sal);}
    catch (SQLException err ) {
        JOptionPane.showMessageDialog(this, err.getMessage());}}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextID = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextSal = new javax.swing.JTextField();
        TextPos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnUp = new javax.swing.JButton();
        jBtnDel = new javax.swing.JButton();
        jBtnNew = new javax.swing.JButton();
        jBtnSave = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBtnPevr = new javax.swing.JButton();
        jBtnNxt = new javax.swing.JButton();
        jBtnFast = new javax.swing.JButton();
        jBtnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextID.setEnabled(false);

        TextName.setEnabled(false);
        TextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameActionPerformed(evt);
            }
        });

        TextSal.setEnabled(false);
        TextSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSalActionPerformed(evt);
            }
        });

        TextPos.setEnabled(false);

        jLabel1.setText("ID");

        jLabel2.setText("Salary");

        jLabel3.setText("Position");

        jLabel4.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextPos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnUp.setText("Update Record");
        jBtnUp.setToolTipText("");
        jBtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpActionPerformed(evt);
            }
        });

        jBtnDel.setText("Delete Record");
        jBtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelActionPerformed(evt);
            }
        });

        jBtnNew.setText("New Record");
        jBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewActionPerformed(evt);
            }
        });

        jBtnSave.setText("Save New Record");
        jBtnSave.setEnabled(false);
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jBtnCancel.setText("Cancel New Record");
        jBtnCancel.setEnabled(false);
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnUp)
                .addGap(39, 39, 39)
                .addComponent(jBtnDel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jBtnNew)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnSave)
                .addGap(43, 43, 43)
                .addComponent(jBtnCancel)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUp)
                    .addComponent(jBtnDel)
                    .addComponent(jBtnNew))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSave)
                    .addComponent(jBtnCancel))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnPevr.setText("<<");
        jBtnPevr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPevrActionPerformed(evt);
            }
        });

        jBtnNxt.setText(">>");
        jBtnNxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNxtActionPerformed(evt);
            }
        });

        jBtnFast.setText("First");
        jBtnFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFastActionPerformed(evt);
            }
        });

        jBtnLast.setText("Last");
        jBtnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnPevr)
                .addGap(64, 64, 64)
                .addComponent(jBtnNxt)
                .addGap(60, 60, 60)
                .addComponent(jBtnFast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnLast)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPevr)
                    .addComponent(jBtnNxt)
                    .addComponent(jBtnFast)
                    .addComponent(jBtnLast))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNameActionPerformed

    private void TextSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalActionPerformed
        //DO add your handling code here:
    }//GEN-LAST:event_TextSalActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
       rs.moveToInsertRow( );
       
        rs.updateString("ID", nid);
        rs.updateString("Name", nname);
        rs.updateString("POSITION", npos);
        rs.updateInt("SALARY", newsal);
        
        rs.updateRow();
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jBtnNxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNxtActionPerformed
        try {
            if (rs.next()) {
            String id = rs.getString("ID");
            String name = rs.getString("Name");
            String pos = rs.getString("POSITION");
            int sal_col = rs.getInt("SALARY");
            String sal = Integer.toString(sal_col);
              //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
              
             TextID.setText(id);
             TextName.setText(name);
             TextPos.setText(pos);
             TextSal.setText(sal);

            } else {
                rs.previous();
                JOptionPane.showMessageDialog(db_gui.this, "End of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(db_gui.this, err.getMessage());
        }
    }//GEN-LAST:event_jBtnNxtActionPerformed

    private void jBtnPevrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPevrActionPerformed
        try {
            if (rs.previous()) {
            String id = rs.getString("ID");
            String name = rs.getString("Name");
            String pos = rs.getString("POSITION");
            int sal_col = rs.getInt("SALARY");
            String sal = Integer.toString(sal_col);
              //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
              
             TextID.setText(id);
             TextName.setText(name);
             TextPos.setText(pos);
             TextSal.setText(sal);

            } else {
                rs.next();
                JOptionPane.showMessageDialog(this, "End of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_jBtnPevrActionPerformed

    private void jBtnFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFastActionPerformed
        try {
            rs.first();
            String id = rs.getString("ID");
            String name = rs.getString("Name");
            String pos = rs.getString("POSITION");
            int sal_col = rs.getInt("SALARY");
            String sal = Integer.toString(sal_col);
              //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
              
             TextID.setText(id);
             TextName.setText(name);
             TextPos.setText(pos);
             TextSal.setText(sal);
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_jBtnFastActionPerformed

    private void jBtnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLastActionPerformed
        try {
            rs.last();
            String id = rs.getString("ID");
            String name = rs.getString("Name");
            String pos = rs.getString("POSITION");
            int sal_col = rs.getInt("SALARY");
            String sal = Integer.toString(sal_col);
              //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
              
             TextID.setText(id);
             TextName.setText(name);
             TextPos.setText(pos);
             TextSal.setText(sal);
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_jBtnLastActionPerformed

    private void jBtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpActionPerformed
        String nid = TextID.getText();
        String nname = TextName.getText();
        String npos = TextPos.getText();
        String sal = TextSal.getText();
        
        int newsal = Integer.parseInt( sal );
        
        try{
            rs.updateString("ID", nid);
            rs.updateString("Name", nname);
            rs.updateString("POSITION", npos);
            rs.updateInt("SALARY", newsal);
            rs.updateRow();
            JOptionPane.showMessageDialog(db_gui.this, "Updated");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
}
        }
    }//GEN-LAST:event_jBtnUpActionPerformed

    private void jBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewActionPerformed
        try{
        curRow = rs.getRow( );

        TextID.setText("");
        TextName.setText("");
        TextPos.setText("");
        TextSal.setText("");

        jBtnFast.setEnabled( false );
        jBtnPevr.setEnabled( false ) ;
        jBtnNxt.setEnabled( false );
        jBtnLast.setEnabled( false );
        jBtnUp.setEnabled( false );
        jBtnDel.setEnabled( false );
        jBtnNew.setEnabled( false );

        jBtnSave.setEnabled( true );
        jBtnCancel.setEnabled( true );
    }
    catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
    }
    }//GEN-LAST:event_jBtnNewActionPerformed

    private void jBtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnDelActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        try{
        rs.absolute( curRow );

        TextID.setText( rs.getString("ID") );
        TextName.setText(rs.getString("Name"));
        TextPos.setText(rs.getString("POSITION"));
        TextSal.setText(Integer.toString(rs.getInt("SALARY");

        jBtnFast.setEnabled( true );
        jBtnPevr.setEnabled( true ) ;
        jBtnNxt.setEnabled( true );
        jBtnLast.setEnabled( true );
        jBtnUp.setEnabled( true );
        jBtnDel.setEnabled( true );
        jBtnNew.setEnabled( true );

        jBtnSave.setEnabled( false );
        jBtnCancel.setEnabled( false );
}
    catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
    }
    }//GEN-LAST:event_jBtnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(db_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(db_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(db_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(db_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new db_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextPos;
    private javax.swing.JTextField TextSal;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnDel;
    private javax.swing.JButton jBtnFast;
    private javax.swing.JButton jBtnLast;
    private javax.swing.JButton jBtnNew;
    private javax.swing.JButton jBtnNxt;
    private javax.swing.JButton jBtnPevr;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jBtnUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
