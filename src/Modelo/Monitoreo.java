package Modelo;
public class Monitoreo {
    private int idcontrol;
    private String apecontrol,nomcontrol,opecontrol,reccontrol,fechacontrol,horacontrol;

    public Monitoreo(int idcontrol, String apecontrol, String nomcontrol, String opecontrol, String reccontrol, String fechacontrol, String horacontrol) {
        this.idcontrol = idcontrol;
        this.apecontrol = apecontrol;
        this.nomcontrol = nomcontrol;
        this.opecontrol = opecontrol;
        this.reccontrol = reccontrol;
        this.fechacontrol = fechacontrol;
        this.horacontrol = horacontrol;
    }

    public Monitoreo() {
    }

    public int getIdcontrol() {
        return idcontrol;
    }

    public void setIdcontrol(int idcontrol) {
        this.idcontrol = idcontrol;
    }

    public String getApecontrol() {
        return apecontrol;
    }

    public void setApecontrol(String apecontrol) {
        this.apecontrol = apecontrol;
    }

    public String getNomcontrol() {
        return nomcontrol;
    }

    public void setNomcontrol(String nomcontrol) {
        this.nomcontrol = nomcontrol;
    }

    public String getOpecontrol() {
        return opecontrol;
    }

    public void setOpecontrol(String opecontrol) {
        this.opecontrol = opecontrol;
    }

    public String getReccontrol() {
        return reccontrol;
    }

    public void setReccontrol(String reccontrol) {
        this.reccontrol = reccontrol;
    }

    public String getFechacontrol() {
        return fechacontrol;
    }

    public void setFechacontrol(String fechacontrol) {
        this.fechacontrol = fechacontrol;
    }

    public String getHoracontrol() {
        return horacontrol;
    }

    public void setHoracontrol(String horacontrol) {
        this.horacontrol = horacontrol;
    }
    
}