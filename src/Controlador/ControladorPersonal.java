package Controlador;
import Modelo.ConsultasPersonal;
import Modelo.Personal;
import VistaJefeAlmacén.AdmiPersonal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorPersonal implements ActionListener {

    private AdmiPersonal vista;
    private Personal personal;
    private ConsultasPersonal modelo;

    public ControladorPersonal(AdmiPersonal vista, Personal personal, ConsultasPersonal modelo) {
        this.vista = vista;
        this.personal = personal;
        this.modelo = modelo;
        vista.btnRegistrar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        MostrarDatos();
        vista.txtIdper.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnRegistrar) {
            try {
                personal.setDni(Integer.parseInt(vista.txtDni.getText()));
                personal.setApe(vista.txtApe.getText());
                personal.setNom(vista.txtNom.getText());
                personal.setEdad(Integer.parseInt(vista.cbedad.getSelectedItem().toString()));
                personal.setSex(vista.cbSex.getSelectedItem().toString());
                personal.setTelefono(vista.txtTelefono.getText());
                personal.setDireccion(vista.txtDireccion.getText());
                personal.setCorreo(vista.txtCorreo.getText());
                if (modelo.insertar(personal)) {
                    JOptionPane.showMessageDialog(null, "Personal registrado  correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor");
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numérico");
                }
                vista.txtDni.setText("");
            }
        }
        if (ae.getSource() == vista.btnLimpiar) {
            limpiar();
        }
        if (ae.getSource() == vista.btnBuscar) {
            Object[] cabecera = {"  ", "DNI", "APELLIDOS", "NOMBRES", "EDAD", "SEXO", "TELEFONO", "DIRECCION", "CORREO"};
            TableModel model = new DefaultTableModel(cabecera, tamañoB());
            int i = 0;
            for (Personal a : modelo.listar()) {
                if (vista.txtBuscar.getText().compareTo(a.getDni() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getApe()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNom()) == 0 || vista.txtBuscar.getText().compareTo(a.getEdad() + "") == 0
                        || vista.txtBuscar.getText().compareTo(a.getSex()) == 0 || vista.txtBuscar.getText().compareTo(a.getTelefono()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getDireccion()) == 0 || vista.txtBuscar.getText().compareTo(a.getCorreo()) == 0) {
                    model.setValueAt(a.getIddoc(), i, 0);
                    model.setValueAt(a.getDni(), i, 1);
                    model.setValueAt(a.getApe(), i, 2);
                    model.setValueAt(a.getNom(), i, 3);
                    model.setValueAt(a.getEdad(), i, 4);
                    model.setValueAt(a.getSex(), i, 5);
                    model.setValueAt(a.getTelefono(), i, 6);
                    model.setValueAt(a.getDireccion(), i, 7);
                    model.setValueAt(a.getCorreo(), i, 8);
                    i++;
                }
            }
            vista.JTablaPersonal.setModel(model);
            if (vista.txtBuscar.getText().isEmpty()) {
                MostrarDatos();
            }
        }
        if (ae.getSource() == vista.btnModificar) {
            try{
                personal.setIddoc(Integer.parseInt(vista.txtIdper.getText()));
                personal.setDni(Integer.parseInt(vista.txtDni.getText()));
                personal.setApe(vista.txtApe.getText());
                personal.setNom(vista.txtNom.getText());
                personal.setEdad(Integer.parseInt(vista.cbedad.getSelectedItem().toString()));
                personal.setSex(vista.cbSex.getSelectedItem().toString());
                personal.setTelefono(vista.txtTelefono.getText());
                personal.setDireccion(vista.txtDireccion.getText());
                personal.setCorreo(vista.txtCorreo.getText());
                if (modelo.modificar(personal)) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para actualizar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para actualizar");
                }
                vista.txtDni.setText("");
            }
        }
        if (ae.getSource() == vista.btnEliminar) {
            try {
                personal.setIddoc(Integer.parseInt(vista.txtIdper.getText()));
                System.out.println(" " + vista.txtIdper.getText());
                if (modelo.eliminar(personal)) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para eliminar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para eliminar");
                }
                vista.txtDni.setText("");
            }
        }
    }

    public int tamañoB() {
        int tam = 0;
        for (Personal a : modelo.listar()) {
                if (vista.txtBuscar.getText().compareTo(a.getDni() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getApe()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNom()) == 0 || vista.txtBuscar.getText().compareTo(a.getEdad() + "") == 0
                        || vista.txtBuscar.getText().compareTo(a.getSex()) == 0 || vista.txtBuscar.getText().compareTo(a.getTelefono()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getDireccion()) == 0 || vista.txtBuscar.getText().compareTo(a.getCorreo()) == 0) {
                    tam++;
            }
        }
        return tam;
    }

    public void limpiar() {
        vista.txtIdper.setText("");
        vista.txtDni.setText("");
        vista.txtApe.setText("");
        vista.txtNom.setText("");
        vista.cbedad.setSelectedIndex(0);
        vista.cbSex.setSelectedIndex(0);
        vista.txtTelefono.setText("");
        vista.txtDireccion.setText("");
        vista.txtCorreo.setText("");
    }

    public void MostrarDatos() {
        Object[] cabecera = {"  ", "DNI", "APELLIDOS", "NOMBRES", "EDAD", "SEXO", "TELEFONO", "DIRECCION", "CORREO"};
        TableModel model = new DefaultTableModel(cabecera, modelo.listar().size());
        int i = 0;
        for (Personal a : modelo.listar()) {
            model.setValueAt(a.getIddoc(), i, 0);
            model.setValueAt(a.getDni(), i, 1);
            model.setValueAt(a.getApe(), i, 2);
            model.setValueAt(a.getNom(), i, 3);
            model.setValueAt(a.getEdad(), i, 4);
            model.setValueAt(a.getSex(), i, 5);
            model.setValueAt(a.getTelefono(), i, 6);
            model.setValueAt(a.getDireccion(), i, 7);
            model.setValueAt(a.getCorreo(), i, 8);
            i++;
        }
        vista.JTablaPersonal.setModel(model);
    }
}
