package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasRecursos extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(Recursos recursos) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("insert into recursos (nomrec,provrec,cantrec,tiporec,descrec,fecharec,horarec,costorec,totalrec) values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, recursos.getNomrec());
            ps.setString(2, recursos.getProvrec());
            ps.setInt(3, recursos.getCantrec());
            ps.setString(4, recursos.getTiporec());
            ps.setString(5, recursos.getDescrec());
            ps.setString(6, recursos.getFecharec());
            ps.setString(7, recursos.getHorarec());
            ps.setDouble(8, recursos.getCostorec());
            ps.setDouble(9, recursos.getTotalrec());
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

    public boolean modificar(Recursos recursos) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update recursos set nomrec=?,provrec=?,cantrec=?,tiporec=?,descrec=?,fecharec=?,horarec=?,costorec=?,totalrec=? where idrec=?");    
            ps.setString(1, recursos.getNomrec());
            ps.setString(2, recursos.getProvrec());
            ps.setInt(3, recursos.getCantrec());
            ps.setString(4, recursos.getTiporec());
            ps.setString(5, recursos.getDescrec());
            ps.setString(6, recursos.getFecharec());
            ps.setString(7, recursos.getHorarec());
            ps.setDouble(8, recursos.getCostorec());
            ps.setDouble(9, recursos.getTotalrec());
            ps.setInt(10, recursos.getIdrec());
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

    public boolean eliminar(Recursos recursos) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from recursos where idrec=?");
            ps.setInt(1, recursos.getIdrec());
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
    ArrayList<Recursos> pac;
    public ArrayList<Recursos> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM recursos ");
            while(rs.next()){
                pac.add(new Recursos(rs.getInt("idrec"),rs.getString("nomrec"),rs.getString("provrec"),rs.getInt("cantrec"),
                        rs.getString("tiporec"),rs.getString("descrec"),rs.getString("fecharec"),rs.getString("horarec"),
                        rs.getDouble("costorec"),rs.getDouble("totalrec")));
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
