package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasCuentas extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Cuentas cuentas) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("insert into cuentas (usuario,contraseña,idcuenta) values (?,?,?)");
            ps.setString(1, cuentas.getUsuario());
            ps.setInt(2, cuentas.getContraseña());
            ps.setInt(3, cuentas.getIdcuenta());
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
    
    public boolean modificar(Cuentas cuentas) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update cuentas set usuario=?,contraseña=? where idcuenta=?");    
            ps.setString(1, cuentas.getUsuario());
            ps.setInt(2, cuentas.getContraseña());
            ps.setInt(3, cuentas.getIdcuenta());
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
    public boolean eliminar(Cuentas cuentas) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from cuentas where idcuenta=?");
            ps.setInt(1, cuentas.getIdcuenta());
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
    ArrayList<Cuentas> pac;
    public ArrayList<Cuentas> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM cuentas ");
            while(rs.next()){
                pac.add(new Cuentas(rs.getInt("idcuenta"),rs.getInt("contraseña"),rs.getString("usuario")));
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
