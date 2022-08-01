package Conexión;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registrorecursos", "root", "");
        } catch (Exception ex) {
            System.out.println("SE PERDIO LA CONEXION");
            System.err.println("Error, " + ex);
        }
        return conexion;
    }
}
