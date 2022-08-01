package Controlador;

import Modelo.*;
import VistaJefeAlmacén.AdmiPersonal;
import VistaPersonal.RegistroRecursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorRecursos implements ActionListener {

    private RegistroRecursos vista;
    private Recursos recursos;
    private ConsultasRecursos modelo;
    private Monitoreo monitoreo;
    private ConsultasMonitoreo modeloM;
    private ConsultasPersonal modeloP;
    String correo;

    public ControladorRecursos(RegistroRecursos vista, Recursos recursos, ConsultasRecursos modelo, Monitoreo monitoreo, ConsultasMonitoreo modeloM, ConsultasPersonal modeloP, String correo) {
        this.vista = vista;
        this.recursos = recursos;
        this.modelo = modelo;
        this.monitoreo = monitoreo;
        this.modeloM = modeloM;
        this.modeloP = modeloP;
        this.correo = correo;
        vista.btnRegistrar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        MostrarDatos();
        vista.txtIdrec.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnRegistrar) {
            try{
                recursos.setNomrec(vista.txtNombre.getText());
                recursos.setProvrec(vista.txtProv.getText());
                recursos.setCantrec(Integer.parseInt(vista.txtCant.getText()));
                recursos.setTiporec(vista.cbTipo.getSelectedItem().toString());
                recursos.setDescrec(vista.txtDesc.getText());
                recursos.setFecharec(vista.fecha);
                recursos.setHorarec(vista.hor);
                recursos.setCostorec(Double.parseDouble(vista.txtCosto.getText()));
                for (Personal p : modeloP.listar()) {
                    if (correo.compareTo(p.getCorreo()) == 0) {
                            monitoreo.setApecontrol(p.getApe());
                            monitoreo.setNomcontrol(p.getNom());
                            monitoreo.setOpecontrol("Registro");
                            monitoreo.setReccontrol(vista.txtNombre.getText());
                            monitoreo.setFechacontrol(vista.fecha);
                            monitoreo.setHoracontrol(vista.hor);
                        if (modeloM.insertar(monitoreo)) {
                            System.out.println("Monitoreo registrado  correctamente");
                        } else {
                            System.out.println("Error monitoreo");
                        }
                    } else {
                        System.out.println("No se encontro el usuario");
                    }
                }
                if (modelo.insertar(recursos)) {
                    JOptionPane.showMessageDialog(null, "Recurso registrado  correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtCant.getText().isEmpty() || vista.txtCosto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor");
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numerico en la cantidad");
                }
                vista.txtCant.setText("");
                vista.txtCosto.setText("");
            }
            vista.lbFecha.setVisible(true);
            vista.lbFecha2.setVisible(false);
            vista.lbHora.setVisible(true);
            vista.lbHora2.setVisible(false);
            vista.lbFecha.setText("" + vista.fecha);
            vista.lbHora.setText("" + vista.hor);
        }
        if (ae.getSource() == vista.btnLimpiar) {
            limpiar();
        }
        if (ae.getSource() == vista.btnBuscar) {
            Object[] cabecera = {"  ", "NOMBRE", "PROVEEDOR", "CANTIDAD", "TIPO", "DESCRIPCIÓN", "FECHA", "HORA", "COSTO", "TOTAL"};
            TableModel model = new DefaultTableModel(cabecera, tamañoB());
            int i = 0;
            for (Recursos a : modelo.listar()) {
                if (vista.txtBuscar.getText().compareTo(a.getNomrec()) == 0 || vista.txtBuscar.getText().compareTo(a.getProvrec()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getCantrec() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getTiporec()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getDescrec()) == 0 || vista.txtBuscar.getText().compareTo(a.getFecharec()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getHorarec()) == 0 || vista.txtBuscar.getText().compareTo(a.getCostorec() + "") == 0
                        || vista.txtBuscar.getText().compareTo(a.getTotalrec() + "") == 0) {
                    model.setValueAt(a.getIdrec(), i, 0);
                    model.setValueAt(a.getNomrec(), i, 1);
                    model.setValueAt(a.getProvrec(), i, 2);
                    model.setValueAt(a.getCantrec(), i, 3);
                    model.setValueAt(a.getTiporec(), i, 4);
                    model.setValueAt(a.getDescrec(), i, 5);
                    model.setValueAt(a.getFecharec(), i, 6);
                    model.setValueAt(a.getHorarec(), i, 7);
                    model.setValueAt(a.getCostorec(), i, 8);
                    model.setValueAt(a.getTotalrec(), i, 9);
                    i++;
                }
            }
            vista.JtablaRecursos.setModel(model);
            if (vista.txtBuscar.getText().isEmpty()) {
                MostrarDatos();
            }
        }
        if (ae.getSource() == vista.btnModificar) {
            try{
                recursos.setIdrec(Integer.parseInt(vista.txtIdrec.getText()));
                recursos.setNomrec(vista.txtNombre.getText());
                recursos.setProvrec(vista.txtProv.getText());
                recursos.setCantrec(Integer.parseInt(vista.txtCant.getText()));
                recursos.setTiporec(vista.cbTipo.getSelectedItem().toString());
                recursos.setDescrec(vista.txtDesc.getText());
                recursos.setFecharec(vista.lbFecha2.getText());
                recursos.setHorarec(vista.lbHora2.getText());
                recursos.setCostorec(Double.parseDouble(vista.txtCosto.getText()));
                for (Personal p : modeloP.listar()) {
                    if (correo.compareTo(p.getCorreo()) == 0) {
                            monitoreo.setApecontrol(p.getApe());
                            monitoreo.setNomcontrol(p.getNom());
                            monitoreo.setOpecontrol("Modificar");
                            monitoreo.setReccontrol(vista.txtNombre.getText());
                            monitoreo.setFechacontrol(vista.fecha);
                            monitoreo.setHoracontrol(vista.hor);
                        if (modeloM.insertar(monitoreo)) {
                            System.out.println("Monitoreo registrado correctamente");
                        } else {
                            System.out.println("Error monitoreo");
                        }
                    } else {
                        System.out.println("No se encontro el usuario");
                    }
                }
                if (modelo.modificar(recursos)) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtCant.getText().isEmpty() || vista.txtCosto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para actualizar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para actualizar");
                }
                vista.txtCant.setText("");
                vista.txtCosto.setText("");
            }
            vista.lbFecha.setVisible(true);
            vista.lbFecha2.setVisible(false);
            vista.lbHora.setVisible(true);
            vista.lbHora2.setVisible(false);
            vista.lbFecha.setText("" + vista.fecha);
            vista.lbHora.setText("" + vista.hor);
        }
        if (ae.getSource() == vista.btnEliminar) {
            try{
                recursos.setIdrec(Integer.parseInt(vista.txtIdrec.getText()));
                for (Personal p : modeloP.listar()) {
                    if (correo.compareTo(p.getCorreo()) == 0) {
                        monitoreo.setApecontrol(p.getApe());
                        monitoreo.setNomcontrol(p.getNom());
                        monitoreo.setOpecontrol("Eliminar");
                        monitoreo.setReccontrol(vista.txtNombre.getText());
                        monitoreo.setFechacontrol(vista.fecha);
                        monitoreo.setHoracontrol(vista.hor);
                        if (modeloM.insertar(monitoreo)) {
                            System.out.println("Monitoreo registrado  correctamente");
                        } else {
                            System.out.println("Error monitoreo");
                        }
                    } else {
                        System.out.println("No se encontro el usuario");
                    }
                }
                if (modelo.eliminar(recursos)) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtCant.getText().isEmpty() || vista.txtCosto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para eliminar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para eliminar");
                }
                vista.txtCant.setText("");
                vista.txtCosto.setText("");
            }
            vista.lbFecha.setVisible(true);
            vista.lbFecha2.setVisible(false);
            vista.lbHora.setVisible(true);
            vista.lbHora2.setVisible(false);
            vista.lbFecha.setText("" + vista.fecha);
            vista.lbHora.setText("" + vista.hor);
        }
    }

    public int tamañoB() {
        int tam = 0;
        for (Recursos a : modelo.listar()) {
            if (vista.txtBuscar.getText().compareTo(a.getNomrec()) == 0 || vista.txtBuscar.getText().compareTo(a.getProvrec()) == 0
                    || vista.txtBuscar.getText().compareTo(a.getCantrec() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getTiporec()) == 0
                    || vista.txtBuscar.getText().compareTo(a.getDescrec()) == 0 || vista.txtBuscar.getText().compareTo(a.getFecharec()) == 0
                    || vista.txtBuscar.getText().compareTo(a.getHorarec()) == 0 || vista.txtBuscar.getText().compareTo(a.getCostorec() + "") == 0
                    || vista.txtBuscar.getText().compareTo(a.getTotalrec() + "") == 0) {
                tam++;
            }
        }
        return tam;
    }

    public void limpiar() {
        vista.lbHora.setVisible(true);
        vista.lbHora2.setVisible(false);
        vista.lbFecha.setVisible(true);
        vista.lbFecha2.setVisible(false);
        vista.txtIdrec.setText("");
        vista.txtNombre.setText("");
        vista.txtProv.setText("");
        vista.txtCant.setText("");
        vista.cbTipo.setSelectedIndex(0);
        vista.txtDesc.setText("");
        vista.lbFecha.setText("" + vista.fecha);
        vista.lbHora.setText("" + vista.hor);
        vista.txtCosto.setText("");
    }

    public void MostrarDatos() {
        Object[] cabecera = {"  ", "NOMBRE", "PROVEEDOR", "CANTIDAD", "TIPO", "DESCRIPCIÓN", "FECHA", "HORA", "COSTO", "TOTAL"};
        TableModel model = new DefaultTableModel(cabecera, modelo.listar().size());
        int i = 0;
        for (Recursos a : modelo.listar()) {
            model.setValueAt(a.getIdrec(), i, 0);
            model.setValueAt(a.getNomrec(), i, 1);
            model.setValueAt(a.getProvrec(), i, 2);
            model.setValueAt(a.getCantrec(), i, 3);
            model.setValueAt(a.getTiporec(), i, 4);
            model.setValueAt(a.getDescrec(), i, 5);
            model.setValueAt(a.getFecharec(), i, 6);
            model.setValueAt(a.getHorarec(), i, 7);
            model.setValueAt(a.getCostorec(), i, 8);
            model.setValueAt(a.getTotalrec(), i, 9);
            i++;
        }
        vista.JtablaRecursos.setModel(model);
    }
}
