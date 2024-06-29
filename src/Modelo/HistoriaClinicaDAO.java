/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
/**
 *
 * @author jean2
 */
public class HistoriaClinicaDAO {
    
    public void insertarHistoriaClinica(HistoriaClinica historiaclinica) throws SQLException {
            
        String sql="INSERT INTO historia_clinica (idhistoria_clinia, num_historia,fecha_apertura,consulta_medica_idconsulta_medica,centro_salud_identro_salud) VALUES (?,?,?,?,?)";
             
        try (Connection conn = Conexion.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, historiaclinica.getId_historiaclinica());
            stmt.setString(2, historiaclinica.getNumeroHistoria());
            stmt.setDate(3, new Date (historiaclinica.getFechaApertura().getTime()));
            stmt.executeUpdate();
            
            
        }
    
    }
    
}
