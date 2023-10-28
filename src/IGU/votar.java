/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import javax.swing.JOptionPane;
import proyectofinal.Login;

/**
 *
 * @author Home
 */
public class votar extends javax.swing.JFrame {

    /**
     * Creates new form Votación
     */
    public votar() {
        initComponents();
        //Invocar las combos de Elecciones
  
        Clases.CAdministrador invocarCbx = new Clases.CAdministrador();
        //CBX ELEECCIONES
        invocarCbx.MostarEleccion(cbx_Elecciones, cbx_candidatos);
    
      
      
    }
    
    private String sexo;
    public void setSexo(String sexo){
        this.sexo = sexo;
        lbl_Sexo.setText(sexo);
    }
    
      private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
        lbl_Nombre.setText(nombre);
    }
     private String pais;
    public void setPais(String pais){
        this.pais = pais;
        lbl_Pais.setText(pais);
    }
    
    private String opc1;
    public void setOpc1(String opc1){
        this.opc1 = opc1;
       // jLabel2.setText(opc1);
        cbx_candidatos.addItem(opc1);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbx_candidatos = new javax.swing.JComboBox<>();
        btn_Votar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbx_Elecciones = new javax.swing.JComboBox<>();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Sexo = new javax.swing.JLabel();
        lbl_Pais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Votación");

        jLabel2.setText("Candidatos:");

        cbx_candidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_candidatosActionPerformed(evt);
            }
        });

        btn_Votar.setBackground(new java.awt.Color(0, 0, 153));
        btn_Votar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Votar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Votar.setText("Votar");
        btn_Votar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VotarActionPerformed(evt);
            }
        });

        jLabel3.setText("Elección");

        cbx_Elecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_EleccionesActionPerformed(evt);
            }
        });

        lbl_Titulo.setBackground(new java.awt.Color(0, 51, 51));
        lbl_Titulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setText("Bienvenido");
        lbl_Titulo.setOpaque(true);

        lbl_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Nombre.setText("Nombre");
        lbl_Nombre.setOpaque(true);

        lbl_Sexo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Sexo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_Sexo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Sexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Sexo.setText("Hola");
        lbl_Sexo.setOpaque(true);

        lbl_Pais.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Pais.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_Pais.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Pais.setText("Hola");
        lbl_Pais.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lbl_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_Elecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_candidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Votar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Elecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_candidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Votar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(lbl_Sexo)
                    .addComponent(lbl_Pais))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VotarActionPerformed
        Clases.CVotante ArchivoVotar = new Clases.CVotante();
        ArchivoVotar.setVotante(lbl_Nombre.getText());
        ArchivoVotar.setSexo(lbl_Sexo.getText());
        ArchivoVotar.setPais(lbl_Pais.getText());
        ArchivoVotar.setEleccion(cbx_Elecciones.getSelectedItem().toString());
        ArchivoVotar.setCandidato(cbx_candidatos.getSelectedItem().toString());
        ArchivoVotar.agregarVoto();
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        ventanaLogin.setLocationRelativeTo(null);
        dispose();

        
  
         
    }//GEN-LAST:event_btn_VotarActionPerformed

    private void cbx_candidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_candidatosActionPerformed
    
    }//GEN-LAST:event_cbx_candidatosActionPerformed

    private void cbx_EleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_EleccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_EleccionesActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Votar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbx_Elecciones;
    private javax.swing.JComboBox<String> cbx_candidatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Pais;
    private javax.swing.JLabel lbl_Sexo;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
