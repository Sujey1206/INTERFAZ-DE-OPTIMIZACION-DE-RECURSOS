package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasMonitoreo extends Conexion {
    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(Monitoreo monitoreo) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("insert into monitoreo (apecontrol,nomcontrol,opecontrol,reccontrol,fechacontrol,horacontrol) values (?,?,?,?,?,?)");
            ps.setString(1, monitoreo.getApecontrol());
            ps.setString(2, monitoreo.getNomcontrol());
            ps.setString(3, monitoreo.getOpecontrol());
            ps.setString(4, monitoreo.getReccontrol());
            ps.setString(5, monitoreo.getFechacontrol());
            ps.setString(6, monitoreo.getHoracontrol());
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
    
    ArrayList<Monitoreo> pac;
    public ArrayList<Monitoreo> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM monitoreo ");
            while(rs.next()){
                pac.add(new Monitoreo(rs.getInt("idcontrol"),rs.getString("apecontrol"),rs.getString("nomcontrol"),rs.getString("opecontrol"),
                        rs.getString("reccontrol"),rs.getString("fechacontrol"),rs.getString("horacontrol")));
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
