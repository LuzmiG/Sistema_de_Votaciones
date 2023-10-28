/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import java.awt.Component;
import javax.swing.DefaultListModel;
import proyectofinal.Login;

/**
 *
 * @author Home
 */
public class frmConfigurarElecciones extends javax.swing.JFrame {

    /**
     * Creates new form frmElecciones
     */
    public frmConfigurarElecciones() {
       
        initComponents(); 
        //Invocar las combos de Elecciones
  
        Clases.CAdministrador invocarCbxEleccion = new Clases.CAdministrador();
        //CBX ELEECCION
        invocarCbxEleccion.leerComboElecciones(cbxEleccion);
        //CBX CANDIDATOS
        invocarCbxEleccion.leerComboCadidatos(cbxCandidatos);
     
        limpiarJlist(); 
    }

  /*  public frmConfigurarElecciones(JComboBox<String> cbxEleccion) {
        this.cbxEleccion = cbxEleccion;
        
         
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxEleccion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxCandidatos = new javax.swing.JComboBox<>();
        txtConf_Eleccion = new javax.swing.JTextField();
        btnSelec = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        btnAlmacenar = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        btn_Inicio = new javax.swing.JButton();
        btnCrearArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Elecciones");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("GESTIONAR ELECCIONES");

        jLabel2.setText("Elegir Elección");

        cbxEleccion.setDoubleBuffered(true);
        cbxEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEleccionActionPerformed(evt);
            }
        });

        jLabel3.setText("Elegir Candidatos:");

        cbxCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCandidatosActionPerformed(evt);
            }
        });

        btnSelec.setBackground(new java.awt.Color(0, 204, 0));
        btnSelec.setText("Agregar");
        btnSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Elminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAlmacenar.setText("Guardar");
        btnAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenarActionPerformed(evt);
            }
        });

        btn_Menu.setBackground(new java.awt.Color(102, 102, 0));
        btn_Menu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_Menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_Menu.setText("← Regresar");
        btn_Menu.setToolTipText("");
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });

        btn_Inicio.setBackground(new java.awt.Color(102, 102, 0));
        btn_Inicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_Inicio.setText("Inicio");
        btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicioActionPerformed(evt);
            }
        });

        btnCrearArchivo.setBackground(new java.awt.Color(255, 51, 102));
        btnCrearArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearArchivo.setText("Crear Archivo");
        btnCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jLabel2)
                                    .addComponent(cbxEleccion, 0, 246, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(cbxCandidatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtConf_Eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnAlmacenar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearArchivo)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConf_Eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelec))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(btnAlmacenar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Menu)
                    .addComponent(btn_Inicio))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cbxEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEleccionActionPerformed
       String valor  = cbxEleccion.getSelectedItem().toString();
       txtConf_Eleccion.setText(valor);


    }//GEN-LAST:event_cbxEleccionActionPerformed

    private void cbxCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCandidatosActionPerformed

    }//GEN-LAST:event_cbxCandidatosActionPerformed

    private void btnSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecActionPerformed
    String valor  = cbxCandidatos.getSelectedItem().toString();
    
    
    DefaultListModel modelo = (DefaultListModel) jList2.getModel();
    modelo.addElement(valor);  
    }//GEN-LAST:event_btnSelecActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private void btnAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenarActionPerformed
       /* Clases.CAdministrador elegir = new Clases.CAdministrador();
        elegir.Eleccion(txtConf_Eleccion, jList2);
          this.hide();
        */
        
        Clases.CAdministrador archivoConfiEleccion = new Clases.CAdministrador();
        archivoConfiEleccion.setConfi_Eleccion(txtConf_Eleccion.getText());
        archivoConfiEleccion.setConfi_Candidatos(jList2.getModel().toString());
        archivoConfiEleccion.agregarConfiguracion();
    }//GEN-LAST:event_btnAlmacenarActionPerformed

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        administrador ventanaAdministrador = new administrador();
        ventanaAdministrador.setVisible(true);
        ventanaAdministrador.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicioActionPerformed
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        ventanaLogin.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_InicioActionPerformed

    private void btnCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArchivoActionPerformed
        Clases.CAdministrador archivoConfiEleccion = new Clases.CAdministrador();
        archivoConfiEleccion.crearConfiElecciones();
    }//GEN-LAST:event_btnCrearArchivoActionPerformed
     
   public DefaultListModel limpiarJlist(){
        DefaultListModel modelo = new DefaultListModel();
        jList2.setModel(modelo);
        return modelo;
    }
    
   /*public DefaultListModel agregarDato(){
         String valor  = cbxCandidatos.getSelectedItem().toString();

        DefaultListModel modelo = (DefaultListModel) jList2.getModel();
        modelo.addElement(valor);
        return modelo;
   }
    */
   
   public DefaultListModel eliminar(){
        DefaultListModel modelo = (DefaultListModel) jList2.getModel();
       modelo.remove(jList2.getSelectedIndex());
       return modelo;
   }
   
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacenar;
    private javax.swing.JButton btnCrearArchivo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSelec;
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JComboBox<String> cbxCandidatos;
    private javax.swing.JComboBox<String> cbxEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtConf_Eleccion;
    // End of variables declaration//GEN-END:variables
}