package main.agenciaimmobiliaria;

public class Xalet extends Propietats{
    private boolean piscina;
    private boolean jardí;
    private boolean urbanització;

    public Xalet() {
        super();
    }

    public Xalet(int ID, int areaPropietat, int numHabitacions, String nomBarri, int preuPropietat, boolean piscina, boolean jardí, boolean urbanització) {
        super(ID, areaPropietat, numHabitacions, nomBarri, preuPropietat);
        this.piscina = piscina;
        this.jardí = jardí;
        this.urbanització = urbanització;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean getJardí() {
        return jardí;
    }

    public void setJardí(boolean jardí) {
        this.jardí = jardí;
    }

    public boolean getUrbanització() {
        return urbanització;
    }

    public void setUrbanització(boolean urbanització) {
        this.urbanització = urbanització;
    }

    @Override
    public String toString(){ // Retornar totes les dades, tambe las de propietat
        return "id " + ID + ", areaPropietat " + areaPropietat + ", numHabitacions " + numHabitacions + ", nomBarri " + nomBarri + ", preuPropietat " + preuPropietat + ", piscina " + piscina + ", jardí " + jardí + ", urbanització " + urbanització;
    }
}
