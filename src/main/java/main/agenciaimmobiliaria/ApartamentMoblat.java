package main.agenciaimmobiliaria;

public class ApartamentMoblat extends Apartament{
    private int qualitatMobilari;

    public ApartamentMoblat() {
        super();
    }

    public ApartamentMoblat(int ID, int areaPropietat, int numHabitacions, String nomBarri, int preuPropietat, String parking, int pis, int porta, String tipus, int qualitatMobilari) {
        super(parking, pis, porta, tipus, ID, areaPropietat, numHabitacions, nomBarri, preuPropietat);
        this.qualitatMobilari = qualitatMobilari;
    }

    public int getQuantitatMobilari() {
        return qualitatMobilari;
    }

    public void setQuantitatMobilari(int qualitatMobilari) {
        this.qualitatMobilari = qualitatMobilari;
    }

    @Override
    public String toString(){
        return "ID " + ID + ", Area " + areaPropietat + ", Habitacions " + numHabitacions + ", Barri " + nomBarri + ", Preu " + preuPropietat + ", Parking " + parking + ", Pis " + pis + ", Porta " + porta + ", Tipus " + tipus + ", Qualitat de la moblari " + qualitatMobilari;
    }
}
