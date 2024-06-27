
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Variables de instancia
    String bd="centrodesalud";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    // Constructor que inicializa la variable 'bd' con el nombre de la base de datos
    public Conexion(String bd){
        this.bd=bd;
    }
    
     // Método para conectar a la base de datos
    public Connection conectar(){
        
        
        try {
            // Carga el driver JDBC
            Class.forName(driver);
             // Establece la conexión usando la URL, el usuario y la contraseña
            cx=DriverManager.getConnection(url+bd, user, password);
            // Captura y maneja las excepciones de clase no encontrada y SQL
            System.out.println("SE CONECTO A BD " + bd);
            
        } catch (ClassNotFoundException |SQLException ex) {
            
            System.out.println("NO SE CONECTO A BD " + bd);
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Retorna la conexión
        return cx;
    }
    
    // Método para desconectar de la base de datos
    public void Desconectar(){
        try {
            // Cierra la conexión
            cx.close();
        } catch (SQLException ex) {
             // Captura y maneja las excepciones SQL
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     // Método principal para probar la conexión
    public static void main(String[] args){
        Conexion conexion = new Conexion("centrodesalud");
        conexion.conectar();
        
    }

}
