
package Modelo;

public class Recursos {
    private int idrec,cantrec;
    private String nomrec, provrec, tiporec,descrec,fecharec,horarec;
    private double costorec,totalrec;

    public Recursos(int idrec, String nomrec, String provrec, int cantrec, String tiporec, String descrec, String fecharec, String horarec, double costorec, double totalrec) {
        this.idrec = idrec;
        this.cantrec = cantrec;
        this.nomrec = nomrec;
        this.provrec = provrec;
        this.tiporec = tiporec;
        this.descrec = descrec;
        this.fecharec = fecharec;
        this.horarec = horarec;
        this.costorec = costorec;
        this.totalrec = totalrec;
    }

    public Recursos() {
    }

    public int getIdrec() {
        return idrec;
    }

    public void setIdrec(int idrec) {
        this.idrec = idrec;
    }

    public int getCantrec() {
        return cantrec;
    }

    public void setCantrec(int cantrec) {
        this.cantrec = cantrec;
    }

    public String getNomrec() {
        return nomrec;
    }

    public void setNomrec(String nomrec) {
        this.nomrec = nomrec;
    }

    public String getProvrec() {
        return provrec;
    }

    public void setProvrec(String provrec) {
        this.provrec = provrec;
    }

    public String getTiporec() {
        return tiporec;
    }

    public void setTiporec(String tiporec) {
        this.tiporec = tiporec;
    }

    public String getDescrec() {
        return descrec;
    }

    public void setDescrec(String descrec) {
        this.descrec = descrec;
    }

    public String getFecharec() {
        return fecharec;
    }

    public void setFecharec(String fecharec) {
        this.fecharec = fecharec;
    }

    public String getHorarec() {
        return horarec;
    }

    public void setHorarec(String horarec) {
        this.horarec = horarec;
    }

    public double getCostorec() {
        return costorec;
    }

    public void setCostorec(double costorec) {
        this.costorec = costorec;
    }

    public double getTotalrec() {
        totalrec = (cantrec * costorec);
        return totalrec;
    }



    
}
