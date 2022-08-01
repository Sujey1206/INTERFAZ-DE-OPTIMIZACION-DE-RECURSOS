package Controlador;
import Modelo.*;
import VistaJefeAlmacén.AdmiRecursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorMonitoreo implements ActionListener {

    private Monitoreo notas;
    private AdmiRecursos vista;
    private ConsultasMonitoreo modeloM;
    String correo;

    public ControladorMonitoreo(AdmiRecursos vista, Monitoreo notas, ConsultasMonitoreo modeloM) {
        this.vista = vista;
        this.notas = notas;
        this.modeloM = modeloM;
        vista.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        MostrarDatos();
        vista.txtIdcontrol.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnBuscar) {
            Object[] cabecera = {"  ", "APELLIDOS", "NOMBRES", "OPERACIÓN", "RECURSOS", "FECHA", "HORA"};
            TableModel model = new DefaultTableModel(cabecera, tamañoB());
            int i = 0;
            for (Monitoreo n : modeloM.listar()) {
                if (vista.txtBuscar.getText().compareTo(n.getApecontrol()) == 0 || vista.txtBuscar.getText().compareTo(n.getNomcontrol()) == 0
                        || vista.txtBuscar.getText().compareTo(n.getOpecontrol()) == 0 || vista.txtBuscar.getText().compareTo(n.getReccontrol()) == 0
                        || vista.txtBuscar.getText().compareTo(n.getFechacontrol()) == 0 || vista.txtBuscar.getText().compareTo(n.getHoracontrol()) == 0) {
                    model.setValueAt(n.getIdcontrol(), i, 0);
                    model.setValueAt(n.getApecontrol(), i, 1);
                    model.setValueAt(n.getNomcontrol(), i, 2);
                    model.setValueAt(n.getOpecontrol(), i, 3);
                    model.setValueAt(n.getReccontrol(), i, 4);
                    model.setValueAt(n.getFechacontrol(), i, 5);
                    model.setValueAt(n.getHoracontrol(), i, 6);
                    i++;
                }
            }
            vista.JTablaMonitoreo.setModel(model);
            if (vista.txtBuscar.getText().isEmpty()) {
                MostrarDatos();
            }
        }   
    }

    public int tamañoB() {
        int tam = 0;
        for (Monitoreo n : modeloM.listar()) {
            if (vista.txtBuscar.getText().compareTo(n.getApecontrol()) == 0 || vista.txtBuscar.getText().compareTo(n.getNomcontrol()) == 0
                    || vista.txtBuscar.getText().compareTo(n.getOpecontrol()) == 0 || vista.txtBuscar.getText().compareTo(n.getReccontrol()) == 0
                    || vista.txtBuscar.getText().compareTo(n.getFechacontrol()) == 0 || vista.txtBuscar.getText().compareTo(n.getHoracontrol()) == 0) {
                tam++;
            }
        }
        return tam;
    }

    public void MostrarDatos() {
        Object[] cabecera = {"  ", "APELLIDOS", "NOMBRES", "OPERACIÓN", "RECURSOS", "FECHA", "HORA"};
        TableModel model = new DefaultTableModel(cabecera, modeloM.listar().size());
        int i = 0;
        for (Monitoreo n : modeloM.listar()) {
            model.setValueAt(n.getIdcontrol(), i, 0);
            model.setValueAt(n.getApecontrol(), i, 1);
            model.setValueAt(n.getNomcontrol(), i, 2);
            model.setValueAt(n.getOpecontrol(), i, 3);
            model.setValueAt(n.getReccontrol(), i, 4);
            model.setValueAt(n.getFechacontrol(), i, 5);
            model.setValueAt(n.getHoracontrol(), i, 6);
            i++;
        }
        vista.JTablaMonitoreo.setModel(model);
    }
}
