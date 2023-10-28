/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import java.awt.Component;
import javax.swing.JTextArea;
import proyectofinal.Login;

/**
 *
 * @author Home
 */
public class auditor extends javax.swing.JFrame {
    private Component[] controles;

    public auditor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarVotantes = new javax.swing.JButton();
        btn_Femenino = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area_Mostrar = new javax.swing.JTextArea();
        btn_Menu1 = new javax.swing.JButton();
        btn_Masculino = new javax.swing.JButton();
        lbl_Voto = new javax.swing.JLabel();
        btn_Guatemala = new javax.swing.JButton();
        btn_Internacional = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("AUDITOR");

        btnMostrarVotantes.setBackground(new java.awt.Color(255, 153, 0));
        btnMostrarVotantes.setText("Todos los Votos");
        btnMostrarVotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVotantesActionPerformed(evt);
            }
        });

        btn_Femenino.setBackground(new java.awt.Color(255, 0, 102));
        btn_Femenino.setForeground(new java.awt.Color(255, 255, 255));
        btn_Femenino.setText("Votos Femenino");
        btn_Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FemeninoActionPerformed(evt);
            }
        });

        Area_Mostrar.setEditable(false);
        Area_Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Area_Mostrar.setColumns(20);
        Area_Mostrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Area_Mostrar.setRows(5);
        jScrollPane2.setViewportView(Area_Mostrar);

        btn_Menu1.setBackground(new java.awt.Color(102, 102, 0));
        btn_Menu1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_Menu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Menu1.setText("← Regresar");
        btn_Menu1.setToolTipText("");
        btn_Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Menu1ActionPerformed(evt);
            }
        });

        btn_Masculino.setBackground(new java.awt.Color(0, 0, 204));
        btn_Masculino.setForeground(new java.awt.Color(255, 255, 255));
        btn_Masculino.setText("Votos Masculino");
        btn_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MasculinoActionPerformed(evt);
            }
        });

        lbl_Voto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Voto.setText("Voto");

        btn_Guatemala.setBackground(new java.awt.Color(0, 102, 51));
        btn_Guatemala.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guatemala.setText("Votos Nacional");
        btn_Guatemala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuatemalaActionPerformed(evt);
            }
        });

        btn_Internacional.setBackground(new java.awt.Color(204, 204, 0));
        btn_Internacional.setForeground(new java.awt.Color(0, 0, 0));
        btn_Internacional.setText("Votos Internacional");
        btn_Internacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InternacionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btn_Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMostrarVotantes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Guatemala, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Internacional, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Voto, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarVotantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Guatemala, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Internacional, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lbl_Voto)
                .addGap(32, 32, 32)
                .addComponent(btn_Menu1)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Variable para lable
     private String voto;
    public void setVoto(String voto){
        this.voto = voto;
        lbl_Voto.setText(voto);
    }
    
    private void btnMostrarVotantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVotantesActionPerformed
     Area_Mostrar.setText("");
     Clases.CAuditor ArchivoVoto = new Clases.CAuditor();
     ArchivoVoto.Mostrar(Area_Mostrar, lbl_Voto);
    
    }//GEN-LAST:event_btnMostrarVotantesActionPerformed

    private void btn_FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FemeninoActionPerformed
        Area_Mostrar.setText("");
        Clases.CAuditor ArchivoVoto = new Clases.CAuditor();
        ArchivoVoto.MostrarVotoFemenino(Area_Mostrar, lbl_Voto);
       
    }//GEN-LAST:event_btn_FemeninoActionPerformed

    private void btn_Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Menu1ActionPerformed
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        ventanaLogin.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_Menu1ActionPerformed

    private void btn_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MasculinoActionPerformed
       Area_Mostrar.setText("");
       Clases.CAuditor ArchivoVoto = new Clases.CAuditor();
       ArchivoVoto.MostrarVotoMasculino(Area_Mostrar, lbl_Voto);
    }//GEN-LAST:event_btn_MasculinoActionPerformed

    private void btn_GuatemalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuatemalaActionPerformed
       Area_Mostrar.setText("");
       Clases.CAuditor ArchivoVoto = new Clases.CAuditor();
       ArchivoVoto.MostrarVotoGuatemala(Area_Mostrar, lbl_Voto);
    }//GEN-LAST:event_btn_GuatemalaActionPerformed

    private void btn_InternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InternacionalActionPerformed
       Area_Mostrar.setText("");
       Clases.CAuditor ArchivoVoto = new Clases.CAuditor();
       ArchivoVoto.MostrarVotoInternacional(Area_Mostrar, lbl_Voto);
    }//GEN-LAST:event_btn_InternacionalActionPerformed

    
    /**
     * @param args the command line arguments
     */

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Mostrar;
    private javax.swing.JButton btnMostrarVotantes;
    private javax.swing.JButton btn_Femenino;
    private javax.swing.JButton btn_Guatemala;
    private javax.swing.JButton btn_Internacional;
    private javax.swing.JButton btn_Masculino;
    private javax.swing.JButton btn_Menu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Voto;
    // End of variables declaration//GEN-END:variables
}
