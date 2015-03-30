
package proyecto.sige.tigo;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.DefaultComboBoxModel;


public class CRMAveriaDTH extends javax.swing.JFrame {


    public CRMAveriaDTH() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Problemas con DTH v1.1");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        inicioGuardar = new javax.swing.JButton();
        btAtras = new javax.swing.JButton();
        cbCalidad = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCRM = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        cbClima = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tCRM1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ShGenerar = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Problemas con DTH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE DE LA PERSONA QUE LLAMA:");

        Generar.setText("Generar CRM");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        inicioGuardar.setText("Guardar y volver al inicio");
        inicioGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioGuardarActionPerformed(evt);
            }
        });

        btAtras.setText("Atras");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        cbCalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE UNO", "SIN SEÑAL (0% POTENCIA 0% CALIDAD)", "CON SEÑAL (99% POTENCIA 85% CALIDAD)", "NO VE LOS NACIONALES", "NO PUEDE VER UN PAQUETE ADICIONAL (FOX HBO, ETC)" }));

        tCRM.setEditable(false);
        jScrollPane2.setViewportView(tCRM);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NUMERO DE SERIE: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("ESTADO DEL CLIMA: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("NIVELES DE POTENCIA Y CALIDAD:");

        cbClima.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE UNO", "SOLEADO", "LLUVIOSO", "NUBLADO", "VENTOSO" }));

        tCRM1.setEditable(false);
        tCRM1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ayuda"));
        jScrollPane3.setViewportView(tCRM1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        ShGenerar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        ShGenerar.setText("Generar");
        ShGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShGenerarActionPerformed(evt);
            }
        });
        jMenu1.add(ShGenerar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbClima, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCalidad, 0, 357, Short.MAX_VALUE)
                                    .addComponent(jTextNombre)))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btAtras)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(inicioGuardar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addGap(279, 279, 279)))
                                    .addComponent(Generar))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Generar)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioGuardar)
                    .addComponent(btAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed

    String Nom= jTextNombre.getText().toString();
    String Num= jTextNumero.getText().toString();
    String Moti= cbCalidad.getSelectedItem().toString();
    String Clima= cbClima.getSelectedItem().toString();
    String Moti2="";
    String Cali="";
    String Helper="";
    
    
        if (Moti.equals("SIN SEÑAL (0% POTENCIA 0% CALIDAD)")  )
        {	
           Moti2=Nom+" llama por problemas de DTH, los niveles de señal son 0% en potencia 0% en calidad. Se sube a cuadro";
           Cali="0% POTENCIA 0% CALIDAD";
           Helper="Explicar le al cliente que se SOLICITARA una visita tenica"
                   +"\nSiempre y cuando hallas revisados los niveles de señal, recuerda que el motivo que pongas en el formulario dependera de lo que te diga el cliente";
        }
        if (Moti.equals("CAMBIO")  )
        {	
           Moti2="llama para solicitar el cambio del pastico en donde se le esta cargando las facturas";
         }
        if (Moti.equals("EXCLUCIÓN")  )
        {	
           Moti2="llama para solicitar el exclucion del pastico en donde se le esta cargando las facturas, el cliente ya no desea que se le debite automaticamente";
         }
//        Vista1
    String vista1="";
    vista1=(""+Helper);
    tCRM1.setText(vista1);
        
//    Vista    
    String vista="";
    vista=("NOMBRE DE LA PERSONA QUE LLAMA: "+Nom
            +"\nNUMERO DE SERIE: "+Num
            +"\nESTADO DEL CLIMA: "+Clima
            +"\nNIVELES DE POTENCIA Y CALIDAD: "+Cali
            +"\nOBSERVACIONES: "+Moti2);
    tCRM.setText(vista);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(""+vista);
        clipboard.setContents(data, data);
    }//GEN-LAST:event_GenerarActionPerformed

    private void inicioGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioGuardarActionPerformed
   String Nom= jTextNombre.getText().toString();
    String Moti= cbCalidad.getSelectedItem().toString();
    String Moti2="";
    
        if (Moti.equals("INCLUCIÓN")  )
        {	
           Moti2="llama para solicitar el inclucion del pastico en donde se le esta cargando las facturas, el cliente desea que se le debite automaticamente";
         }
        if (Moti.equals("CAMBIO")  )
        {	
           Moti2="llama para solicitar el cambio del pastico en donde se le esta cargando las facturas";
         }
        if (Moti.equals("EXCLUCIÓN")  )
        {	
           Moti2="llama para solicitar el exclucion del pastico en donde se le esta cargando las facturas, el cliente ya no desea que se le debite automaticamente";
         }
    
    String vista="";
    vista=("PERSONA QUIEN LLAMA: "+Nom
            +"\nTIPO DE GESTION: "+Moti
            +"\nOBSERVACION: "+Nom+" "+Moti2);
    tCRM.setText(vista);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(""+vista);
        clipboard.setContents(data, data);
        AssistCRM obj=new AssistCRM();
        obj.setVisible(true);    
        dispose();
    }//GEN-LAST:event_inicioGuardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            AssistCRM obj=new AssistCRM();
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ShGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShGenerarActionPerformed
  String Nom= jTextNombre.getText().toString();
    String Moti= cbCalidad.getSelectedItem().toString();
    String Moti2="";
    
        if (Moti.equals("INCLUCIÓN")  )
        {	
           Moti2="llama para solicitar el inclucion del pastico en donde se le esta cargando las facturas, el cliente desea que se le debite automaticamente";
         }
        if (Moti.equals("CAMBIO")  )
        {	
           Moti2="llama para solicitar el cambio del pastico en donde se le esta cargando las facturas";
         }
        if (Moti.equals("EXCLUCIÓN")  )
        {	
           Moti2="llama para solicitar el exclucion del pastico en donde se le esta cargando las facturas, el cliente ya no desea que se le debite automaticamente";
         }
    
    String vista="";
    vista=("PERSONA QUIEN LLAMA: "+Nom
            +"\nTIPO DE GESTION: "+Moti
            +"\nOBSERVACION: "+Nom+" "+Moti2);
    tCRM.setText(vista);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(""+vista);
        clipboard.setContents(data, data);
    }//GEN-LAST:event_ShGenerarActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
            AssistCRM obj=new AssistCRM();
            obj.setVisible(true);
            dispose();
            
    }//GEN-LAST:event_btAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(CRMAverias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRMAverias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRMAverias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRMAverias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRMAverias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JMenuItem ShGenerar;
    private javax.swing.JButton btAtras;
    private javax.swing.JComboBox cbCalidad;
    private javax.swing.JComboBox cbClima;
    private javax.swing.JButton inicioGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextPane tCRM;
    private javax.swing.JTextPane tCRM1;
    // End of variables declaration//GEN-END:variables
}
