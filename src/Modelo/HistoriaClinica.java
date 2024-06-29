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
public class HistoriaClinica {
    
    private int id_historiaclinica;
    private String numeroHistoria;
    private Date FechaApertura;

    
    public int getId_historiaclinica() {
        return id_historiaclinica;
    }

    public void setId_historiaclinica(int id_historiaclinica) {
        this.id_historiaclinica = id_historiaclinica;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public Date getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(Date FechaApertura) {
        this.FechaApertura = FechaApertura;
    }
    
    
}
