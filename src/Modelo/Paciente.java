/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jean2
 */
public class Paciente {
    
    Conexion cx;
    private String ApellidoP;
    private String ApellidoM;
    private String Nombres;
    private String Dni;
    private String Religion;
    private String EstadoCivil;
    private String FactorRH;
    private String NumHC;
    private String Edad;
    
    

    public Conexion getCx() {
        return cx;
    }

    public void setCx(Conexion cx) {
        this.cx = cx;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getFactorRH() {
        return FactorRH;
    }

    public void setFactorRH(String FactorRH) {
        this.FactorRH = FactorRH;
    }

    public String getNumHC() {
        return NumHC;
    }

    public void setNumHC(String NumHC) {
        this.NumHC = NumHC;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }


    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }



    
    public void InsertarPaciente(JTextField paramApellidoP,JTextField paramApellidoM, JTextField paramNombres ) {
        
        setApellidoP(paramApellidoP.getText());
        setApellidoM(paramApellidoM.getText());
        setNombres(paramNombres.getText());
        
        cx=new Conexion("centrodesalud");
        
        String consulta = "insert into Identificacion(apellido_paterno,apellido,materno,nombres) values (?,?,?);";
        
        try{
            
            CallableStatement cs = cx.conectar().prepareCall(consulta);
            
            cs.setString(1, getApellidoP());
            cs.setString(2, getApellidoM());
            cs.setString(3, getNombres());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se agregó correctamente la historia clínica");
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "No se insertó correctamente los datos de la historia clínica, error: " +e.toString());
            
        }
        
        
        
    
}
    
  
}
