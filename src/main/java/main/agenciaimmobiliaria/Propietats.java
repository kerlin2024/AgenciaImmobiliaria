package main.agenciaimmobiliaria;

public class Propietats {
    protected int ID;
    protected int areaPropietat;
    protected int numHabitacions;
    protected String nomBarri;
    protected int preuPropietat;

    public Propietats() {
    }

    public Propietats(int ID, int areaPropietat, int numHabitacions, String nomBarri, int preuPropietat) {
        this.ID = ID;
        this.areaPropietat = areaPropietat;
        this.numHabitacions = numHabitacions;
        this.nomBarri = nomBarri;
        this.preuPropietat = preuPropietat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAreaPropietat() {
        return areaPropietat;
    }

    public void setAreaPropietat(int areaPropietat) {
        this.areaPropietat = areaPropietat;
    }

    public int getNumHabitacions() {
        return numHabitacions;
    }

    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }

    public String getNomBarri() {
        return nomBarri;
    }

    public void setNomBarri(String nomBarri) {
        this.nomBarri = nomBarri;
    }

    public int getPreuPropietat() {
        return preuPropietat;
    }

    public void setPreuPropietat(int preuPropietat) {
        this.preuPropietat = preuPropietat;
    }

    @Override
    public String toString() {
        return "Propietats{" + "ID=" + ID + ", areaPropietat=" + areaPropietat + ", numHabitacions=" + numHabitacions + ", nomBarri=" + nomBarri + ", preuPropietat=" + preuPropietat + '}';
    }
}
