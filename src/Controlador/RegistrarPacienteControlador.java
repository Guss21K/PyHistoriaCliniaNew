/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Acompañante;
import Modelo.AcompañanteDAO;
import Modelo.Paciente;
import Modelo.PacienteDAO;
import Vista.RegistrarPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jean2
 */
public class RegistrarPacienteControlador {
    
    private RegistrarPaciente view;
    private PacienteDAO pacienteDAO;
    private AcompañanteDAO acompañanteDAO;
    
     public RegistrarPacienteControlador(RegistrarPaciente view, PacienteDAO pacienteDAO, AcompañanteDAO acompañanteDAO) {
        this.view = view;
        this.pacienteDAO = pacienteDAO;
        this.acompañanteDAO = acompañanteDAO;

        this.view.getGuardarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    guardarPaciente();
                    JOptionPane.showMessageDialog(view, "Paciente guardado con éxito.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(view, "Error al guardar el paciente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(view, "Error en el formato de los datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
     }
     
     private void guardarPaciente() throws SQLException {
        
        Paciente paciente = new Paciente();
        
        paciente.setApellidoP(view.getApellidoPaterno());
        paciente.setApellidoM(view.getApellidoMaterno());
        paciente.setNombres(view.getNombres());
        paciente.setEdad(view.getEdad());
        paciente.setTieneSeguro(view.getTieneSeguro());
        paciente.setTipoSeguro(view.getTipoSeguro());
        paciente.setNumeroSeguro(view.getNumeroSeguro());
        paciente.setGrupoSan(view.getGrupoSanguineo());
        paciente.setFechanac(view.getFechaNacimiento());
        paciente.setLugar_nac(view.getLugarNacimiento());
        paciente.setProcedencia(view.getProcedencia());
        paciente.setDomicilio(view.getDomicilio());
        paciente.setDistrito(view.getDistrito());
        paciente.setProvincia(view.getProvincia());
        paciente.setDnibd(view.getDni());
        paciente.setEstadoCivil(view.getEstadoCivil());
        paciente.setGradoInstruccion(view.getGradoInstruccion());
        paciente.setReligion(view.getReligion());
        paciente.setTelefono(view.getTelefono());
        paciente.setTieneAcompañante(view.getTieneAcompanante());

        if (view.getTieneAcompanante()) {
            Acompañante acompañante = new Acompañante();
            acompañante.setAcom_apellidoPbd(view.getAcompañanteApellidoPaterno());
            acompañante.setAcom_apellidoMbd(view.getAcompañanteApellidoMaterno());
            acompañante.setAcom_nombresbd(view.getAcompañanteNombres());
            acompañante.setAcom_telefonobd(view.getAcompañanteTelefono());
            acompañante.setAcom_dnibd(view.getAcompañanteDni());
            acompañante.setAcom_direccionbd(view.getAcompañanteDomicilio());

            acompañanteDAO.insertarAcompanante(acompañante);
            int acompananteId = acompañanteDAO.obtenerUltimoId();
            paciente.setAcompañante_id(acompananteId);
        }

        pacienteDAO.insertarPaciente(paciente);
    }   
        
}
