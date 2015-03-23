
package proyecto.sige.tigo;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class Troublesurin extends javax.swing.JFrame { 

    public Troublesurin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Asistente de CRM");
    }

    
    public String[] getMotivos(String motivos2)
    {
        String[] motivo2 = new String[20];
        if(motivos2.equalsIgnoreCase("ATENCION AL CLIENTE (SAC)"))
        {
            motivo2[0] = "DESGLOSE DE FACTURAS";
            motivo2[1] = "MONTO A PAGAR";
            motivo2[2] = "N/C - N/D";
            motivo2[3] = "CARGO AUTOMATICO";
            motivo2[4] = "SOLICITA ARREGLO DE PAGO";
        }
        if(motivos2.equalsIgnoreCase("SOPORTE TECNICO (SOP)"))
        {
            motivo2[0] = "Seleccione";
            motivo2[1] = "APROVISIOMADO";
            motivo2[2] = "LENTIRUD";
            motivo2[3] = "INTERMITENCIA";
            motivo2[4] = "DESENGANCHADO";
        }
        return motivo2;
    }

    public String[] getMotivos2 (String motivos3)
    {
      String[] motivo3 = new String[20];
      
      
        if(motivos3.equalsIgnoreCase("APROVISIOMADO"))
            
            
        {
            motivo3[0] = "Seleccione";
            motivo3[1] = "SI";
            motivo3[2] = "MONTO A PAGAR";
            motivo3[3] = "N/C - N/D";
            motivo3[4] = "CARGO AUTOMATICO";
            motivo3[5] = "SOLICITA ARREGLO DE PAGO";
        }   
        
        if(motivos3.equalsIgnoreCase("LENTIRUD"))
            
            
        {
            motivo3[0] = "Seleccione";
            motivo3[1] = "Pones1";
            motivo3[2] = "Pones2";
            motivo3[3] = "Pones3";
            motivo3[4] = "Pones4";
            motivo3[5] = "Pones5";
        }   
        
         if(motivos3.equalsIgnoreCase("INTERMITENCIA"))
            
            
        {
            motivo3[0] = "Seleccione";
            motivo3[1] = "Pones1";
            motivo3[2] = "Pones2";
            motivo3[3] = "Pones3";
            motivo3[4] = "Pones4";
            motivo3[5] = "Pones5";
        }   
         
         if(motivos3.equalsIgnoreCase("DESENGANCHADO"))
            
            
        {
            motivo3[0] = "Seleccione";
            motivo3[1] = "Pones1";
            motivo3[2] = "Pones2";
            motivo3[3] = "Pones3";
            motivo3[4] = "Pones4";
            motivo3[5] = "Pones5";
        }  
        
        return motivo3;
            }
    
    public String[] getMotivos3(String motivos4)
    {
        String[] motivo4 = new String[20];
        
        if(motivos4.equalsIgnoreCase("AVERIAS"))  
        {
            motivo4[0] = "INTERNET-SIN SEÑAL ";
            motivo4[1] = "DIGITAL-SIN SEÑAL ";
            motivo4[2] = "CONFIGURACIÓN-MÓDEM ";
            motivo4[3] = "AVERÍA GENERAL ";
            motivo4[4] = "AVERÍA-SIN SEÑAL";
            motivo4[5] = "INTERNET-REINICIAR ";
        }
        if(motivos4.equalsIgnoreCase("COBROS"))
        {
            motivo4[0] = "DESGLOSE DE FACTURACIÓN ";
            motivo4[1] = "MONTO A PAGAR ";
            motivo4[2] = "N/C - N/D   ";
            motivo4[3] = "SOLICITA ARREGLO DE PAGO ";
            motivo4[4] = "CARGO AUTOMÁTICO ";
            motivo4[4] = "RE CONEXIÓN  ";
        }
        return motivo4;
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbMotivo1 = new javax.swing.JComboBox();
        cbMotivo2 = new javax.swing.JComboBox();
        cbMotivo3 = new javax.swing.JComboBox();
        cbMotivo4 = new javax.swing.JComboBox();
        cbMotivo5 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbMotivo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotivo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MOTIVO DE LA LLAMADA", "ATENCION AL CLIENTE (SAC)", "SOPORTE TECNICO (SOP)" }));
        cbMotivo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMotivo1ItemStateChanged(evt);
            }
        });
        cbMotivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotivo1ActionPerformed(evt);
            }
        });

        cbMotivo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotivo2.setPreferredSize(new java.awt.Dimension(150, 20));
        cbMotivo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMotivo2ItemStateChanged(evt);
            }
        });
        cbMotivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotivo2ActionPerformed(evt);
            }
        });

        cbMotivo3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotivo3.setPreferredSize(new java.awt.Dimension(150, 20));
        cbMotivo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotivo3ActionPerformed(evt);
            }
        });

        cbMotivo4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotivo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "AVERIAS", "COBROS" }));
        cbMotivo4.setPreferredSize(new java.awt.Dimension(150, 20));
        cbMotivo4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMotivo4ItemStateChanged(evt);
            }
        });
        cbMotivo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotivo4ActionPerformed(evt);
            }
        });

        cbMotivo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotivo5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbMotivo4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMotivo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbMotivo2, 0, 202, Short.MAX_VALUE)
                    .addComponent(cbMotivo5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMotivo3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMotivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMotivo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMotivo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMotivo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMotivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo1ActionPerformed

    }//GEN-LAST:event_cbMotivo1ActionPerformed

    private void cbMotivo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo1ItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cbMotivo1.getSelectedIndex()>-0)
            {
                this.cbMotivo2.setModel(new DefaultComboBoxModel(this.getMotivos(this.cbMotivo1.getSelectedItem().toString())));
                                    }
        }
        
        
    }//GEN-LAST:event_cbMotivo1ItemStateChanged

    private void cbMotivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo2ActionPerformed
        
        
    }//GEN-LAST:event_cbMotivo2ActionPerformed

    private void cbMotivo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotivo3ActionPerformed

    private void cbMotivo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo2ItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cbMotivo2.getSelectedIndex()>=0)
            {
                this.cbMotivo3.setModel(new DefaultComboBoxModel(this.getMotivos2(this.cbMotivo2.getSelectedItem().toString())));
                                    }
        }
        
    }//GEN-LAST:event_cbMotivo2ItemStateChanged

    private void cbMotivo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotivo4ActionPerformed

    private void cbMotivo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotivo5ActionPerformed

    private void cbMotivo4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo4ItemStateChanged
      if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cbMotivo4.getSelectedIndex()>0)
            {
                this.cbMotivo5.setModel(new DefaultComboBoxModel(this.getMotivos3(this.cbMotivo4.getSelectedItem().toString())));
                                    }
        }
    }//GEN-LAST:event_cbMotivo4ItemStateChanged


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
            java.util.logging.Logger.getLogger(Troublesurin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Troublesurin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Troublesurin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Troublesurin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Troublesurin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbMotivo1;
    private javax.swing.JComboBox cbMotivo2;
    private javax.swing.JComboBox cbMotivo3;
    private javax.swing.JComboBox cbMotivo4;
    private javax.swing.JComboBox cbMotivo5;
    // End of variables declaration//GEN-END:variables

    private Object[] getMotivos1(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

