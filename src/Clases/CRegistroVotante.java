/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import IGU.registradorVotante;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.StringJoiner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Luzmi
 */
public class CRegistroVotante {
    /*OJO: DEBEN SER TIPOS STRING PARA ALMACENAR EN ARCHIVOX TXT, NO LO PUEDO ALMACENAR DIRECTAMENTE 
    COMO INT, SEGUN INVESTIGUE JAJA CREA CONFLICTO
    ------------------------------
      Variables a almacenar 
    -Nombre -Apellidos -CUI -Sexo -Fecha de Nacimiento
    -----RESIDENCIA
    -Pais -Departamento -Direccion -Municipio
    */
  
    String nombres, apellidos, CUI, sexo, fechaNacimiento, pais, departamento, municipio, direccion,
             pass, buscar, EPais, EDepartamento, EMunicipio, EDireccion, ECUI;

    public String getECUI() {
        return ECUI;
    }

    public void setECUI(String ECUI) {
        this.ECUI = ECUI;
    }

    public String getEPais() {
        return EPais;
    }

    public void setEPais(String EPais) {
        this.EPais = EPais;
    }

    public String getEDepartamento() {
        return EDepartamento;
    }

    public void setEDepartamento(String EDepartamento) {
        this.EDepartamento = EDepartamento;
    }

    public String getEMunicipio() {
        return EMunicipio;
    }

    public void setEMunicipio(String EMunicipio) {
        this.EMunicipio = EMunicipio;
    }

    public String getEDireccion() {
        return EDireccion;
    }

    public void setEDireccion(String EDireccion) {
        this.EDireccion = EDireccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
    
    
    
    
    
    //METODO DE CONTRASEÑA ALEATORIA
    public String pass() {
        char [] mayusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] minusculas = {'A' ,'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
        char [] numeros = {'1','2','3','4','5','6','7','8','9','0'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
       
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i <= 16; i++) {
            int cantidadCaracteres = caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            
          contrasena.append((caracteres.toString()).charAt(numeroRandom));
            
        
            
        } 
        return contrasena.toString();
    }
    
    //METODO PARA el CRUD
   
    
    //CREAR ARCHIVO
    public void crearArchivoRegistoVotante(){
       
        try{
            
            //SE CREA EL ARCHIVO TXT
            File archivoDatosVotante = new File("Registro_De_Votantes.txt");
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
    }  
    
    public void agregarRegistrosVotantes(){
        try{
            FileWriter fw = new FileWriter("Registro_De_Votantes.txt", true);
            fw.write(getNombres());
            fw.write("|");
            fw.write(getApellidos());
            fw.write("|");
            fw.write(getCUI());
            fw.write("|");
            fw.write(pass());
            fw.write("|");
            fw.write(getSexo());   
            fw.write("|");
            fw.write(getFechaNacimiento());   
            fw.write("|");
            fw.write(getPais());   
            fw.write("|");
            fw.write(getDepartamento());   
            fw.write("|");
            fw.write(  getMunicipio());   
            fw.write("|");
            fw.write(  getDireccion());   
            fw.write("|");
            fw.write("\n");
            fw.close();
          
             JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS \n" + "Usuario: " + getNombres() +"\n "+ "Contraseña " + pass()); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un errro al registrar"); 
        }
    }
    
    public void MostarRegistroVotante(JTable tblDatos){
        //Indicamos de que archivos queremos llamar los datos
        //filePath = ruta archivo
        String rutaArchivo = "Registro_De_Votantes.txt";
        File archivo = new File(rutaArchivo);
        try{
             BufferedReader br = new BufferedReader(new FileReader(archivo));       
             DefaultTableModel model = new DefaultTableModel();
             model.addColumn("Nombre");
             model.addColumn("Apellidos");
             model.addColumn("CUI");
             model.addColumn("Pass");
             model.addColumn("Sexo");       
             model.addColumn("FechaNacimiento");
             model.addColumn("Pais");
             model.addColumn("Departamento");
             model.addColumn("Municipio");
             model.addColumn("Dirección");
             
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
    
    public void SeleccionarRegistroVotante(JTable tblDatos){
        
        try{
            

             int fila  = tblDatos.getSelectedRow(); 
            if (fila>=0) {
                setECUI(tblDatos.getValueAt(fila, 2).toString());
                setEPais(tblDatos.getValueAt(fila, 6).toString());
               setEDepartamento(tblDatos.getValueAt(fila, 7).toString());
                setEMunicipio(tblDatos.getValueAt(fila, 8).toString());
                setEDireccion(tblDatos.getValueAt(fila, 9).toString());

            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
            
        }
        
        /*try {
            String rutaArchivo = "Registro_De_Votantes.txt";
            File archivo = new File(rutaArchivo);
            FileReader fr = new FileReader(rutaArchivo);
         BufferedReader br = new BufferedReader(fr);
                    
         File copiaArchivo = new File ( "Registro_copia.txt");
         FileWriter fw = new FileWriter(copiaArchivo);
         BufferedWriter bw = new BufferedWriter(fw) ;
         String linea = "";
         
         while((linea = br.readLine()) != null){
                    String [] datos = linea.split("\\ |");
                        if(datos[0].compareTo(getBuscar()) !=0){
                            linea = "Hola | verificando | cambio | xd | ";
                        }
                        bw.write(linea + "\n");
                    }
                    bw.close();
                    br.close();
                    Files.move(copiaArchivo.toPath(),archivo.toPath(), REPLACE_EXISTING);
         
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
            
        }
        */
         
                  
                    
                    
        
    }
    
    public void EliminarRegistroVotante (JTable tblDatos, JTextField ECUI ){
        DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if(((String)model.getValueAt(i,2)).equals(ECUI.getText())) {
                model.removeRow(i);
                break;
            }
           
            
        } 
        JOptionPane.showMessageDialog(null, "Usuario eliminado");    
        //lIMPIEZZA DE TXT
        try{
            PrintWriter writer = new PrintWriter("Registro_De_Votantes.txt");
            writer.print("");
            writer.close(); 
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Registro_De_Votantes.txt")))){
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
            
            
            //interesante aqui no utilice un replace 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        
    }
  
    //BORAR CONTROLADOR
     public void borartxt (Component[] controles){
            for(Object control : controles){
                if (control instanceof JTextField){
                    ((JTextField) control).setText("");
                }
            }
    } 

    public void editarRegistroVotante(JTable tblDatos) {
        
        
        //lIMPIEZZA DE TXT
        try{
            PrintWriter writer = new PrintWriter("Registro_De_Votantes.txt");
            writer.print("");
            writer.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Registro_De_Votantes.txt")))){
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
            
            
            //interesante aqui no utilice un replace 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());    
        }
       
    }
    
}
