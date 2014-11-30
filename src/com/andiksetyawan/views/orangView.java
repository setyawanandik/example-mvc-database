/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * orangView.java
 *
 * Created on Jul 26, 2013, 11:53:41 PM
 */
package com.andiksetyawan.views;

import javax.swing.JTextField;
import com.andiksetyawan.controllers.orangControlel;
import com.andiksetyawan.entity.orang;
import com.andiksetyawan.models.orangModel;
import com.andiksetyawan.models.orangModelListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andik S
 */
public class orangView extends javax.swing.JPanel implements orangModelListener {
    private orangModel model;
    private orangControlel controlel;
    /** Creates new form orangView */
    public orangView() {
        model = new orangModel();
        this.model.setModelListener(this);
        
        controlel = new orangControlel(model);
        controlel.setModel(model);
        initComponents();
    }

    public JTextField getTextNama() {
        return textNama;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        buttonInsert = new javax.swing.JButton();

        jLabel1.setText("Masukkan nama :");

        buttonInsert.setText("insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNama, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(253, Short.MAX_VALUE)
                        .addComponent(buttonInsert)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonInsert)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        try {
            // TODO add your handling code here:
                controlel.insert(this);
        } catch (SQLException ex) {
            Logger.getLogger(orangView.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_buttonInsertActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textNama;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(orangModel model) {
        textNama.setText(model.getNama());
    }

   
//    public void onInsert(orang o) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

//    @Override
//    public void onInsert(orang o) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
}