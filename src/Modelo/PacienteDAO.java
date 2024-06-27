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
public class PacienteDAO {
    
    public void insertarPaciente(Paciente paciente) throws SQLException {
        String sql = "INSERT INTO paciente (apellido_paterno, apellido_materno, nombres, edad, tiene_seguro, tipo_seguro, numero_seguro, grupo_sanguineo, fecha_nacimiento, lugar_nacimiento, sexo, procedencia, domicilio, distrito, provincia, dni, estado_civil, grado_instruccion, religion, telefono, tiene_acompanante, acompanante_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getApellidoP());
            stmt.setString(2, paciente.getApellidoM());
            stmt.setString(3, paciente.getNombres());
            stmt.setInt(4, paciente.getEdad());
            stmt.setBoolean(5, paciente.isTieneSeguro());
            stmt.setString(6, paciente.getTipoSeguro());
            stmt.setString(7, paciente.getNumeroSeguro());
            stmt.setString(8, paciente.getGrupoSan());
            stmt.setDate(9, new Date (paciente.getFechanac().getTime()));
            stmt.setString(10, paciente.getLugar_nac());
            stmt.setString(11, paciente.getSexo());
            stmt.setString(12, paciente.getProcedencia());
            stmt.setString(13, paciente.getDomicilio());
            stmt.setString(14, paciente.getDistrito());
            stmt.setString(15, paciente.getProvincia());
            stmt.setString(16, paciente.getDnibd());
            stmt.setString(17, paciente.getEstadoCivil());
            stmt.setString(18, paciente.getGradoInstruccion());
            stmt.setString(19, paciente.getReligion());
            stmt.setString(20, paciente.getTelefono());
            stmt.setBoolean(21, paciente.isTieneAcompañante());
            stmt.setInt(22, paciente.getAcompañante_id());
            stmt.executeUpdate();
            
            
        }
    }
    
}
