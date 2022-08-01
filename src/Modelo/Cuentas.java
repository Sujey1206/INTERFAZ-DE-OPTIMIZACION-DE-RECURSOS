
package Modelo;

public class Cuentas {
    private int idcuenta,contraseña;
    private String usuario;

    public Cuentas(int idcuenta, int contraseña, String usuario) {
        this.idcuenta = idcuenta;
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public Cuentas() {
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
