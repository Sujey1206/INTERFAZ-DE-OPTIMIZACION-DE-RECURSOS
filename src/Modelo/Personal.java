
package Modelo;

public class Personal {
    private int iddoc,dni,edad;
    private String ape, nom, sex,telefono,direccion,correo;

    public Personal(int iddoc, int dni, int edad, String ape, String nom, String sex, String telefono, String direccion, String correo) {
        this.iddoc = iddoc;
        this.dni = dni;
        this.edad = edad;
        this.ape = ape;
        this.nom = nom;
        this.sex = sex;
        this.telefono=telefono;
        this.direccion=direccion;
        this.correo = correo;
    }

    public Personal() {
    }

    public int getIddoc() {
        return iddoc;
    }

    public void setIddoc(int iddoc) {
        this.iddoc = iddoc;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
