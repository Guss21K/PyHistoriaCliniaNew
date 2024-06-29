/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author jean2
 */
public class Paciente {
    
    //BD
    //identificacion
    private int id_identificacionbd;
    private String ApellidoP;
    private String ApellidoM;
    private String Nombres;
    private Date fechanac;
    private String sexo;
    private String telefono;
    private String direccion;
    private boolean tieneSeguro;
    private String tipoSeguro;
    private String numeroSeguro;
    private String domicilio;
    private String distrito;
    private String provincia;
    private String procedencia;
    private boolean tieneAcompañante;
    
    //paciente
    private String gradoInstruccion;
    private int idpaciente;
    private String Dnibd;
    private String GrupoSan;
    private String FactorRH;
    private String Religion;
    private String EstadoCivil;
    private int Edad;

    private String lugar_nac;
    private int contacto_id;
    private int educacion_id;
    private int seguro_id;
    private int acompañante_id;
    private int identificacion_id;
    private int hitoriaclinica_id;
    private String NumHC;
    

    
    
    public String getGrupoSan() {
        return GrupoSan;
    }

    public void setGrupoSan(String GrupoSan) {
        this.GrupoSan = GrupoSan;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getLugar_nac() {
        return lugar_nac;
    }

    public void setLugar_nac(String lugar_nac) {
        this.lugar_nac = lugar_nac;
    }

    public int getContacto_id() {
        return contacto_id;
    }

    public void setContacto_id(int contacto_id) {
        this.contacto_id = contacto_id;
    }

    public int getEducacion_id() {
        return educacion_id;
    }

    public void setEducacion_id(int educacion_id) {
        this.educacion_id = educacion_id;
    }

    public int getSeguro_id() {
        return seguro_id;
    }

    public void setSeguro_id(int seguro_id) {
        this.seguro_id = seguro_id;
    }

    public int getAcompañante_id() {
        return acompañante_id;
    }

    public void setAcompañante_id(int acompañante_id) {
        this.acompañante_id = acompañante_id;
    }

    public int getIdentificacion_id() {
        return identificacion_id;
    }

    public void setIdentificacion_id(int identificacion_id) {
        this.identificacion_id = identificacion_id;
    }

    public int getHitoriaclinica_id() {
        return hitoriaclinica_id;
    }

    public void setHitoriaclinica_id(int hitoriaclinica_id) {
        this.hitoriaclinica_id = hitoriaclinica_id;
    }

    
    public int getId_identificacionbd() {
        return id_identificacionbd;
    }

    public void setId_identificacionbd(int id_identificacionbd) {
        this.id_identificacionbd = id_identificacionbd;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }


    public String getDnibd() {
        return Dnibd;
    }

    public void setDnibd(String Dnibd) {
        this.Dnibd = Dnibd;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
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
    
       
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
       public boolean isTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }
    
    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
        public boolean isTieneAcompañante() {
        return tieneAcompañante;
    }

    public void setTieneAcompañante(boolean tieneAcompañante) {
        this.tieneAcompañante = tieneAcompañante;
    }
    
       public String getGradoInstruccion() {
        return gradoInstruccion;
    }

    public void setGradoInstruccion(String gradoInstruccion) {
        this.gradoInstruccion = gradoInstruccion;
    }
    
}
