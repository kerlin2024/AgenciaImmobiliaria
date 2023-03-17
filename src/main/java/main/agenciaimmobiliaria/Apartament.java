package main.agenciaimmobiliaria;

public class Apartament extends Propietats{
    protected String parking;
    protected int pis;
    protected int porta;
    protected String tipus;

    public Apartament() {
        super();
    }

    public Apartament(String parking, int pis, int porta, String tipus, int ID, int areaPropietat, int numHabitacions, String nomBarri, int preuPropietat) {
        super(ID, areaPropietat, numHabitacions, nomBarri, preuPropietat);
        this.parking = parking;
        this.pis = pis;
        this.porta = porta;
        this.tipus = tipus;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString(){
        return "Apartament{" + "parking=" + parking + ", pis=" + pis + ", porta=" + porta + ", tipus=" + tipus + '}';
    }
}
