package Controlador;
import Inicio.LoginPersonal;
import Modelo.*;

public class ControladorCuentas{

    private Cuentas cuentas;
    private LoginPersonal vistaD;
    private ConsultasPersonal modeloD;
    private ConsultasCuentas modeloCD;
    String correo;

    public ControladorCuentas(LoginPersonal vista, Cuentas cuentas, ConsultasCuentas modeloCD, ConsultasPersonal modeloD) {
        this.vistaD = vista;
        this.cuentas = cuentas;
        this.modeloCD = modeloCD;
        this.modeloD = modeloD;
    }

    public void iniciarD() {
        vistaD.setLocationRelativeTo(null);
        insertarRelaciónD();
    }

    public void insertarRelaciónD() {
        for (Personal d : modeloD.listar()) {
            int cont = 0;
            cuentas.setUsuario(d.getCorreo());
            cuentas.setContraseña(d.getDni());
            for (Cuentas n : modeloCD.listar()) {
                if (n.getUsuario().compareTo(d.getCorreo()) == 0) {
                    cont = 1;
                }
            }
            if (cont != 1) {
                modeloCD.insertar(cuentas);
                cont = 0;
            }
        }
        eliminarRelacionD();
    }
    
    public void eliminarRelacionD() {
        int cont;
        for (Cuentas n : modeloCD.listar()) {
            cont = 0;
            for (Personal d : modeloD.listar()) {
                if (d.getCorreo().compareTo(n.getUsuario()) == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                modeloCD.eliminar(n);
                cont = 0;
            }
        }
    }
}
