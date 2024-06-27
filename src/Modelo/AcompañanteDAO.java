/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Controlador.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author jean2
 */
public class AcompañanteDAO {
    
        public void insertarAcompanante(Acompañante acompañante) throws SQLException {
        String sql = "INSERT INTO acompañante (apellido_paterno, apellido_materno, nombres, telefono, dni, direccion) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, acompañante.getAcom_apellidoPbd());
            stmt.setString(2, acompañante.getAcom_apellidoMbd());
            stmt.setString(3, acompañante.getAcom_nombresbd());
            stmt.setString(4, acompañante.getAcom_telefonobd());
            stmt.setString(5, acompañante.getAcom_dnibd());
            stmt.setString(6, acompañante.getAcom_direccionbd());
            stmt.executeUpdate();
        }
    }
        
        
        public int obtenerUltimoId() throws SQLException {
            String sql = "SELECT MAX(id) AS id FROM acompanante";
        try (Connection conn = Conexion.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                throw new SQLException("No se pudo obtener el último ID del acompañante.");
            }
        }
        }
}
