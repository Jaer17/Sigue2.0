
package sige2.pkg0;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class TextMoti extends javax.swing.JFrame {


    public TextMoti() {
        initComponents();
    }

    public String[] getMotivos(String motivos2)
    {
        String[] motivo2 = new String[5];
        if(motivos2.equalsIgnoreCase("COBROS"))
        {
            motivo2[0] = "MONTO A PAGAR";
            motivo2[1] = "DESGLOSE DE FACTURAS";

        }
        
        if(motivos2.equalsIgnoreCase("AVERIAS"))
        {
            motivo2[0] = "INTERNET SIN SEÑAL";
            motivo2[1] = "DTH SIN SEÑAL";

        }
        return motivo2;
    }

    public String[] getMotivos2(String motivos3)
    {
        String[] motivo3 = new String[5];
        if(motivos3.equalsIgnoreCase("MONTO A PAGAR"))
        {
            motivo3[0] = " ";
            motivo3[1] = "FUNCIONA";

        }
        
        if(motivos3.equalsIgnoreCase("INTERNET SIN SEÑAL"))
        {
            motivo3[0] = "FUNCIONA";
            motivo3[1] = "NO FUNCIONA";

        }
        return motivo3;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbMotivo1 = new javax.swing.JComboBox();
        cbMotivo2 = new javax.swing.JComboBox();
        cbMotivo3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbMotivo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE MOTIVO", "COBROS", "AVERIAS" }));
        cbMotivo1.setPreferredSize(new java.awt.Dimension(150, 20));
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

        cbMotivo2.setPreferredSize(new java.awt.Dimension(150, 20));

        cbMotivo3.setPreferredSize(new java.awt.Dimension(150, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbMotivo3, 0, 177, Short.MAX_VALUE)
                    .addComponent(cbMotivo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cbMotivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMotivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMotivo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMotivo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo1ItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cbMotivo1.getSelectedIndex()>0)
            {
                this.cbMotivo2.setModel(new DefaultComboBoxModel(this.getMotivos(this.cbMotivo1.getSelectedItem().toString())));
                {
                this.cbMotivo3.setModel(new DefaultComboBoxModel(this.getMotivos2(this.cbMotivo2.getSelectedItem().toString())));
                    }
                        }
        }
    }//GEN-LAST:event_cbMotivo1ItemStateChanged

    private void cbMotivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotivo1ActionPerformed

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
            java.util.logging.Logger.getLogger(TextMoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextMoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextMoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextMoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextMoti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbMotivo1;
    private javax.swing.JComboBox cbMotivo2;
    private javax.swing.JComboBox cbMotivo3;
    // End of variables declaration//GEN-END:variables
}
