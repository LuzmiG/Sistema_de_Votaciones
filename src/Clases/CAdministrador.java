/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import IGU.votar;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luzmi
 */
public class CAdministrador {
    /*
    ------------------------------
      Variables a almacenar 
  -Titulo de Eleccion -Proposito -Descripcion -ID_Eleccion -Establecer tiempo de inscripcion
    */
    
    
    
    //Eleccion
    String titulo, proposito, descripcion, idEleccion;
    //Candidato
    String idCandidato, nombre, formacion, experiencia;
    
    //---------CANDIDATO

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
     
   
    
     //CREAR ARCHIVO Candidatos
    public void crearCandidatos(){
       
        try{
            
            //SE CREA EL ARCHIVO TXT
            File archivoDatosVotante = new File("Candidatos.txt");
         
            //Con este if le indicamos que no se cree uno tras otra y otra vez, ni se interponngan los archivos, que se creo una SOLA vez,
            if (archivoDatosVotante.createNewFile()) {
                //ataves de showMessageDialog
                JOptionPane.showMessageDialog(null, "Archivo Creado" + archivoDatosVotante.getName());
               // System.out.println("ARCHIVO CREADO "+ archivoDatosVotante.getName());
            }
            else{
                JOptionPane.showMessageDialog(null, "EL ARCHIVO YA EXISTE");
              //  System.out.println("EL ARCHIVO YA EXISTE");
            }   
        }  
        catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ocurrio un errro al crear el archivo"); 
        }
        
        try{
               File archivoCBX = new File("CBXCandidatos.txt");
                 if (archivoCBX.createNewFile()) {
                     System.out.println("ARCHIVO CREADO");   
                 }
                 else{
                     System.out.println("El archivo cbx ya existe");
                 }
        }  catch(Exception e){
             System.out.println("Existe un error");
                     
        }
    }  
    
    //Agregar candidatos
    public void agregarCandidatos(){
        try{
            FileWriter fw = new FileWriter("Candidatos.txt", true);
            fw.write(getIdCandidato());
            fw.write("|");
            fw.write(getNombre());
            fw.write("|");
            fw.write(getFormacion());
            fw.write("|");
            fw.write(getExperiencia());
            fw.write("|");
            fw.write("\n");
            fw.close();
          
             JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS \n" ); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error al registrar"); 
        }
        
         try{
            FileWriter fw = new FileWriter("CBXCandidatos.txt", true);
            fw.write(getNombre());
            fw.write("|");
            fw.close();
             System.out.println("dato registrado");
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error al almacenar"); 
        }
        
    }

    //Mostrar candidatos
    public void MostarCandidato(JTable tblCandidatos){
        String rutaArchivo = "Candidatos.txt";
        File archivo = new File(rutaArchivo);
        try{
             BufferedReader br = new BufferedReader(new FileReader(archivo));
            
             DefaultTableModel model = new DefaultTableModel();
             model.addColumn("Codigo Candidato");
             model.addColumn("Nombre");
             model.addColumn("Formacion");
             model.addColumn("Experiencia");
             
            tblCandidatos.setModel(model);
            Object[] tableLines = br.lines().toArray();  
                 for (int i = 0; i < tableLines.length; i++) {
                     String linea = tableLines[i].toString().  trim();
                     String[] datarow = linea.split("\\|");
                     model.addRow(datarow);
                      tblCandidatos.setModel(model);
            }     
                }
            
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
            
        }
    }
    
    //Seleccionar
     public void SeleccionarCandidato(JTable tblCandidatos){
        
        try{
             int fila  = tblCandidatos.getSelectedRow(); 
            if (fila>=0) {
                setIdCandidato(tblCandidatos.getValueAt(fila, 0).toString());
                setNombre(tblCandidatos.getValueAt(fila, 1).toString());
               setFormacion(tblCandidatos.getValueAt(fila, 2).toString());
                setExperiencia(tblCandidatos.getValueAt(fila, 3).toString());
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
            
        }
     }
     
    //ELIMINAR
    public void EliminarCandidato (JTable tblCandidatos, JTextField idCandidato ){
        DefaultTableModel model = (DefaultTableModel) tblCandidatos.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if(((String)model.getValueAt(i,0)).equals(idCandidato.getText())) {
                model.removeRow(i);
                break;
            } 
        } 
        
        JOptionPane.showMessageDialog(null, "Usuario eliminado");
         
        //lIMPIEZZA DE TXT
        try{
            PrintWriter writer = new PrintWriter("Candidatos.txt");
            writer.print("");
            writer.close();   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Candidatos.txt")))){
            for (int row = 0; row < tblCandidatos.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
           for (int col = 0; col < tblCandidatos.getColumnCount(); col++) {
                Object obj = tblCandidatos.getValueAt(row, col);
                String value = obj == null? "null" :obj.toString();
                joiner.add(value);
                
            }
                System.out.println(joiner.toString());
                bw.write(joiner.toString());
                bw.newLine();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        
    }
  
    //Editar 
    public void editarCandidato(JTable tblCandidatos) {
        try{
            PrintWriter writer = new PrintWriter("Candidatos.txt");
            writer.print("");
            writer.close(); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        //
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Candidatos.txt")))){
            for (int row = 0; row < tblCandidatos.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
           for (int col = 0; col < tblCandidatos.getColumnCount(); col++) {
                Object obj = tblCandidatos.getValueAt(row, col);
                String value = obj == null? "null" :obj.toString();
                joiner.add(value);     
            }
                System.out.println(joiner.toString());
                bw.write(joiner.toString());
                bw.newLine();
            }

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
       
    }
    
    
    /*
    .
    .
    .
    */
    //////// FORMULARIO FRMELECCIONES
     //------------ELECCION

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(String idEleccion) {
        this.idEleccion = idEleccion;
    }
    
    //Crear Elecciones
    public void crearElecciones(){
       
        try{
            File archivoDatosVotante = new File("Elecciones.txt");
            if (archivoDatosVotante.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo Creado" + archivoDatosVotante.getName());
            }
            else{
                JOptionPane.showMessageDialog(null, "EL ARCHIVO YA EXISTE");
            }   
        }  
        catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ocurrio un errro al crear el archivo"); 
        }
        
        try{
               File archivoCBX = new File("CBXElecciones.txt");
                 if (archivoCBX.createNewFile()) {
                     System.out.println("ARCHIVO CREADO");   
                 }
                 else{
                     System.out.println("El archivo cbx ya existe");
                 }
        }  catch(Exception e){
             System.out.println("Existe un error");
                     
        }
    }  
     //Agregar Eleccion
    public void agregarElecciones(){
        try{
            FileWriter fw = new FileWriter("Elecciones.txt", true);
            fw.write(getTitulo());
            fw.write("|");
            fw.write(getIdEleccion());
            fw.write("|");
            fw.write(getProposito());
            fw.write("|");
            fw.write(getDescripcion());
            fw.write("|");
            fw.write("\n");
            fw.close();
          
             JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS \n" ); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error al registrar"); 
        }
        
         try{
            FileWriter fw = new FileWriter("CBXElecciones.txt", true);
            fw.write(getTitulo());
            fw.write("|");
            fw.close();
             System.out.println("dato registrado");
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error al almacenar"); 
        }
        
    }
    
    //Seleccionar Eleccion
     public void SeleccionarEleccion(JTable tblDatos){
        
        try{
             int fila  = tblDatos.getSelectedRow(); 
            if (fila>=0) {
                setTitulo(tblDatos.getValueAt(fila, 0).toString());
                setIdEleccion(tblDatos.getValueAt(fila, 1).toString());
               setProposito(tblDatos.getValueAt(fila, 2).toString());
                setDescripcion(tblDatos.getValueAt(fila, 3).toString());
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
            
        }
     }
    
    //Mostrar Eleccion
    public void MostarEleccion(JTable tblDatos){
        String rutaArchivo = "Elecciones.txt";
        File archivo = new File(rutaArchivo);
        try{
             BufferedReader br = new BufferedReader(new FileReader(archivo));
            
             DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Titulo Eleccion");
             model.addColumn("Codigo Eleccion");
             model.addColumn("Proposito");
             model.addColumn("Descripción");
             
            tblDatos.setModel(model);
            Object[] tableLines = br.lines().toArray();  
                 for (int i = 0; i < tableLines.length; i++) {
                     String linea = tableLines[i].toString().  trim();
                     String[] datarow = linea.split("\\|");
                     model.addRow(datarow);
                      tblDatos.setModel(model);
            }     
                }
            
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
            
        }
    }
    
    //ELIMINAR
     public void EliminarEleccion (JTable tblDatos, JTextField idEleccion ){
        DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if(((String)model.getValueAt(i,1)).equals(idEleccion.getText())) {
                model.removeRow(i);
                break;
            } 
        } 
        
        JOptionPane.showMessageDialog(null, "Usuario eliminado");
         
        //lIMPIEZZA DE TXT
        try{
            PrintWriter writer = new PrintWriter("Elecciones.txt");
            writer.print("");
            writer.close();   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Elecciones.txt")))){
            for (int row = 0; row < tblDatos.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
           for (int col = 0; col < tblDatos.getColumnCount(); col++) {
                Object obj = tblDatos.getValueAt(row, col);
                String value = obj == null? "null" :obj.toString();
                joiner.add(value);
                
            }
                System.out.println(joiner.toString());
                bw.write(joiner.toString());
                bw.newLine();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        
    }
    
     
     /*
     .
     .
     .
     */
    //// FORMULARIO DE CONFIGURAION DE ELECCION
    ////GESTION DE COMBO BOX
    
     //LEER COMBO DE ELECCIONES
    public void leerComboElecciones(JComboBox cbxEleccion){
        try{
            BufferedReader br  = new BufferedReader(new FileReader("CBXElecciones.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                StringTokenizer ton = new StringTokenizer(linea, "\\|");
                while(ton.hasMoreTokens()){
                    cbxEleccion.addItem(ton.nextToken());
                }
            }
            br.close();
                    
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un problema"); 
        }
        
    }
    
    //LEER COMBO DE CANDIDATOS
     public void leerComboCadidatos(JComboBox cbxCandidatos){
          try{
            BufferedReader br  = new BufferedReader(new FileReader("CBXCandidatos.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                StringTokenizer ton = new StringTokenizer(linea, "\\|");
                while(ton.hasMoreTokens()){
                    cbxCandidatos.addItem(ton.nextToken());
                }
            }
            br.close();
                    
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un problema"); 
        }
    }
      
    String confi_Eleccion, confi_Candidatos;

    public String getConfi_Eleccion() {
        return confi_Eleccion;
    }

    public void setConfi_Eleccion(String confi_Eleccion) {
        this.confi_Eleccion = confi_Eleccion;
    }

    public String getConfi_Candidatos() {
        return confi_Candidatos;
    }

    public void setConfi_Candidatos(String confi_Candidatos) {
        this.confi_Candidatos = confi_Candidatos;
    }
    
    public void crearConfiElecciones(){
       
        try{
            File archivoDatosVotante = new File("Cofiguracion_Eleccion.txt");
            if (archivoDatosVotante.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo Creado" + archivoDatosVotante.getName());
            }
            else{
                JOptionPane.showMessageDialog(null, "EL ARCHIVO YA EXISTE");
            }   
        }  
        catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ocurrio un error al crear el archivo"); 
        }
        
      
    }  
    
        public void agregarConfiguracion(){
        try{
            FileWriter fw = new FileWriter("Cofiguracion_Eleccion.txt", true);
            fw.write(getConfi_Eleccion());
            fw.write("|");
            fw.write(getConfi_Candidatos());
            fw.write("\n");
            fw.close();
          
             JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS \n" ); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error al registrar"); 
        }
        
        
        
    }
        
        //Mostrar
    public void MostarEleccion(JComboBox cbx_Elecciones, JComboBox cbx_candidatos ){
        try{
            BufferedReader br  = new BufferedReader(new FileReader("Cofiguracion_Eleccion.txt"));
            String linea;
            String nom;
            while((linea = br.readLine()) != null){
                  
                StringTokenizer ton = new StringTokenizer(linea, "\\|");
        
                while(ton.hasMoreTokens()){
                    cbx_Elecciones.addItem(ton.nextToken());
                    if (linea != "[,]") {
                    
                        cbx_candidatos.addItem(ton.nextToken());
                       // if (linea != ",") {
                            
                       // }
                         
                    }
                    
                }

               
            }
            br.close();
                    
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un problema"); 
        }
      
        }
  //  public String[] getopc
    
    
   }
    
     /*public void Eleccion(JTextField confiEleccion, JList jList2){
         votar ventanaVotar = new votar();
         ventanaVotar.setTitulo(confiEleccion.getText());
         
         String[] desgloce = jList2.getModel().toString().split(",");
         
         for (int i = 0; i < desgloce.length; i++) {        
          // System.out.println(desgloce[i]);
             ventanaVotar.setOpc1(desgloce[i]);  
        }
        
         ventanaVotar.setVisible(true);
         ventanaVotar.setLocationRelativeTo(null);
      
    }
     */

     
     
   


     
    
   

 
    
    
    
    

