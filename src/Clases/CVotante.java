/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class CVotante {
    
    //Eleccion
    String votante, eleccion, candidato, sexo, pais;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getVotante() {
        return votante;
    }

    public void setVotante(String votante) {
        this.votante = votante;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

   

    public void agregarVoto(){
        try{
            FileWriter fw = new FileWriter("Voto.txt", true);
            fw.write(getVotante());
            fw.write("|");
            fw.write(getSexo());
            fw.write("|");
            fw.write(getPais());
            fw.write("|");
            fw.write(getEleccion());
            fw.write("|");
            fw.write(getCandidato());
            fw.write("|");

            fw.write("\n");
            fw.close();
          
             JOptionPane.showMessageDialog(null, "¡Felicidades! \n Su voto ha sido registrado \n" ); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error al registrar"); 
        }
    
}
}
