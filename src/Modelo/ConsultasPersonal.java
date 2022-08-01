package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasPersonal extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(Personal personal) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("insert into personal (dniper,apellidoper,nombreper,edadper,sexoper,telefonoper,direccionper,correoper) values (?,?,?,?,?,?,?,?)");
            ps.setInt(1, personal.getDni());
            ps.setString(2, personal.getApe());
            ps.setString(3, personal.getNom());
            ps.setInt(4, personal.getEdad());
            ps.setString(5, personal.getSex());
            ps.setString(6, personal.getTelefono());
            ps.setString(7, personal.getDireccion());
            ps.setString(8, personal.getCorreo());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
                return false;
            }
        }
    }

    public boolean modificar(Personal personal) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update personal set dniper=?,apellidoper=?,nombreper=?,edadper=?,sexoper=?,telefonoper=?,direccionper=?,correoper=? where idper=?");    
            ps.setInt(1, personal.getDni());
            ps.setString(2, personal.getApe());
            ps.setString(3, personal.getNom());
            ps.setInt(4, personal.getEdad());
            ps.setString(5, personal.getSex());
            ps.setString(6, personal.getTelefono());
            ps.setString(7, personal.getDireccion());
            ps.setString(8, personal.getCorreo());
            ps.setInt(9, personal.getIddoc());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        }finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
                return false;
            }
        }
    }

    public boolean eliminar(Personal personal) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from personal where idper=?");
            ps.setInt(1, personal.getIddoc());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
                return false;
            }
        }
    }
    ArrayList<Personal> pac;
    public ArrayList<Personal> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM personal ");
            while(rs.next()){
                pac.add(new Personal(rs.getInt("idper"),rs.getInt("dniper"),rs.getInt("edadper"),rs.getString("apellidoper"),
                        rs.getString("nombreper"),rs.getString("sexoper"),rs.getString("telefonoper"),
                        rs.getString("direccionper"),rs.getString("correoper")));
            }
            conexion.close();
        } catch (NullPointerException np) {
            System.err.println("Tabla vacia, " + np);
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        } 
        return pac;
    }
}
