
package proyecto.sige.tigo;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class AssistCRM extends javax.swing.JFrame {


    public AssistCRM() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Asistente de CRM");
    }

    public String[] getMotivos2(String motivos2)
    {
        String[] motivo2 = new String[20];
        
        if(motivos2.equalsIgnoreCase("AVERIAS"))  
        {
            motivo2[0] = "INTERNET SIN SEÑAL*";
            motivo2[1] = "DIGITAL SIN SEÑAL*";
            motivo2[2] = "CONFIGURACIÓN-MÓDEM ";
            motivo2[3] = "AVERÍA GENERAL*";
            motivo2[4] = "AVERÍA SIN SEÑAL*";
            motivo2[5] = "INTERNET REINICIAR";
            motivo2[6] = "TV SIN SEÑAL";
            motivo2[7] = "INTERNET INTERMITENCIA";
            motivo2[8] = "INTERNET MONITOREO";
            motivo2[9] = "INTERNET PROVISIONAR";
            motivo2[10] = "INTERNET LENTITUD";
        }
        if(motivos2.equalsIgnoreCase("COBROS"))
        {
            motivo2[0] = "DESGLOSE DE FACTURACIÓN*";
            motivo2[1] = "MONTO A PAGAR*";
            motivo2[2] = "N/C - N/D*";
            motivo2[3] = "SOLICITA ARREGLO DE PAGO";
            motivo2[4] = "CARGO AUTOMÁTICO*";
            motivo2[5] = "RECONEXIÓN";
            motivo2[6] = "DESCO FALTA DE PAGO BAJA MOROSO";
            motivo2[7] = "DESCO FALTA DE PAGO BAJA MOROSO";
        }
        if(motivos2.equalsIgnoreCase("VENTAS"))
        {
            motivo2[0] = "PREVENTA";
 
        }
        return motivo2;
    }

    public String[] getMotivos3(String motivos3)
    {
        String[] motivo3 = new String[5];
        
        if(motivos3.equalsIgnoreCase("DIGITAL SIN SEÑAL"))  
        {
            motivo3[0] = "DTH";
            motivo3[1] = "DIGITAL BASICO";
            motivo3[2] = "DIGITAL HD ";
            motivo3[3] = "AVERÍA GENERAL ";

        }
        return motivo3;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbMotivo1 = new javax.swing.JComboBox();
        cbMotivo2 = new javax.swing.JComboBox();
        cbMotivo3 = new javax.swing.JComboBox();
        jGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, null), "Asistente de CRM"));

        cbMotivo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotivo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "AVERIAS", "COBROS" }));
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

        cbMotivo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMotivo2ItemStateChanged(evt);
            }
        });

        cbMotivo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbMotivo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMotivo3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMotivo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMotivo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMotivo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cbMotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMotivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMotivo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jGenerar.setText("Generar");
        jGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGenerar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jGenerar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMotivo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo1ItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cbMotivo1.getSelectedIndex()>-0)
            {
                this.cbMotivo2.setModel(new DefaultComboBoxModel(this.getMotivos2(this.cbMotivo1.getSelectedItem().toString())));
            }
            
        }
    }//GEN-LAST:event_cbMotivo1ItemStateChanged

    private void cbMotivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotivo1ActionPerformed

    private void jGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenerarActionPerformed
        String iMoti= cbMotivo2.getSelectedItem().toString();
        
        if (iMoti.equals("MONTO A PAGAR")  )
        {	
           CRMMonto obj=new CRMMonto();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("DESGLOSE DE FACTURACIÓN")  )
        {	
           CRMDesglose obj=new CRMDesglose();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("N/C - N/D")  )
        {	
           CRMNC obj=new CRMNC();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("INTERNET SIN SEÑAL")  )
        {	
           CRMAverias obj=new CRMAverias();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("DIGITAL SIN SEÑAL")  )
        {	
           CRMAverias obj=new CRMAverias();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("AVERÍA GENERAL")  )
        {	
           CRMAveriaGeneral obj=new CRMAveriaGeneral();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("AVERÍA SIN SEÑAL")  )
        {	
           CRMAveriasSinSenal obj=new CRMAveriasSinSenal();
            obj.setVisible(true);
            dispose();	
         }
        if (iMoti.equals("CARGO AUTOMÁTICO")  )
        {	
           CRMCargoAutomatico obj=new CRMCargoAutomatico();
            obj.setVisible(true);
            dispose();	
         }
        
        
        
    }//GEN-LAST:event_jGenerarActionPerformed

    private void cbMotivo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo3ItemStateChanged
       
    }//GEN-LAST:event_cbMotivo3ItemStateChanged

    private void cbMotivo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMotivo2ItemStateChanged
    if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cbMotivo2.getSelectedIndex()>=0)
            {
                this.cbMotivo3.setModel(new DefaultComboBoxModel(this.getMotivos2(this.cbMotivo2.getSelectedItem().toString())));
                                    }
        }
    }//GEN-LAST:event_cbMotivo2ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssistCRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbMotivo1;
    private javax.swing.JComboBox cbMotivo2;
    private javax.swing.JComboBox cbMotivo3;
    private javax.swing.JButton jGenerar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
