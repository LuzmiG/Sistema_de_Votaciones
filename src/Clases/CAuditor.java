/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import IGU.votar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Home
 */
public class CAuditor {
       
    //MostrarVotantes
     public void Mostrar(JTextArea Area_Mostrar, JLabel Voto){
        
        try{    
                BufferedReader br = new BufferedReader(new FileReader("Voto.txt"));
                String linea = br.readLine(); 
                int x = 0;
     
                while(linea != null){
                        x++;
                      Area_Mostrar.append(linea + "\n");
                      linea = br.readLine();
                      //Convertir a String un int
                       String cadena = Integer.toString(x);
                        Voto.setText("Total de Votos en General: "+cadena);
                       // System.out.println(linea);
                    
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
        }
    }
    
    
    //Mostra Femenino
    public void MostrarVotoFemenino(JTextArea Area_Mostrar, JLabel Voto){    
        try{    
                BufferedReader br = new BufferedReader(new FileReader("Voto.txt"));
                String buscar = "Femenino";
                
                int x = 0;
                int votos = 0;
                String lector = "";
                
                while((lector = br.readLine()) != null){
                    //Incremetar contador 
                     x++;
                    if (lector.contains(buscar)) {
                        //Incremento para saber cuantos veces ha votando un "Femenino"
                        votos++;
                        Area_Mostrar.append(lector + "\n");
                       String cadena = Integer.toString(votos);
                        Voto.setText("Total de Votos Femeninos: "+cadena);
                    }
                }
                //System.out.println("Votos realizados"+votos);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
        }
    } 
     //Mostra Voto Masculino
    public void MostrarVotoMasculino(JTextArea Area_Mostrar, JLabel Voto){
        
        try{    
                BufferedReader br = new BufferedReader(new FileReader("Voto.txt"));
                String buscar = "Masculino";
                String lector = "";
                int votos = 0;
                int x = 0;
                while((lector = br.readLine()) != null){
                    //Incremetar contador 
                     x++;
                    if (lector.contains(buscar)) {
                        //Incremento para saber cuantos veces ha votando un "Masculinos"
                        votos++;
                        Area_Mostrar.append(lector + "\n");
                         String cadena = Integer.toString(votos);
                        Voto.setText("Total de Votos Masculinos: "+cadena);
                       // System.out.println(lector);
                    }
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
        }
    }
    
      //Mostra Voto Masculino
    public void MostrarVotoGuatemala(JTextArea Area_Mostrar, JLabel Voto){
        
        try{    
                BufferedReader br = new BufferedReader(new FileReader("Voto.txt"));
                String buscar = "Guatemala";
                String lector = "";
                int votos = 0;
                int x = 0;
                while((lector = br.readLine()) != null){
                    //Incremetar contador 
                     x++;
                    if (lector.contains(buscar)) {
                        //Incremento para saber cuantos veces ha votando un "Masculinos"
                        votos++;
                        Area_Mostrar.append(lector + "\n");
                         String cadena = Integer.toString(votos);
                        Voto.setText("Total de Votos Nacionales: "+cadena);
                       // System.out.println(lector);
                    }
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
        }
    }
    
       public void MostrarVotoInternacional(JTextArea Area_Mostrar, JLabel Voto){
        
        try{    
                BufferedReader br = new BufferedReader(new FileReader("Voto.txt"));
                String buscar = "Guatemala";
                String lector = "";
                int votos = 0;
                int x = 0;
                while((lector = br.readLine()) != null){
                    //Incremetar contador 
                     x++;
                    if (lector.contains(buscar)) {
                       
                    }else{
                        votos++;
                        Area_Mostrar.append(lector + "\n");
                         String cadena = Integer.toString(votos);
                        Voto.setText("Total de Votos Internacionales: "+cadena);
                    } 
                    
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error" +e.toString());
        }
    }
    
    
    
    
}
