package main.agenciaimmobiliaria;

public class ApartamentBuit extends Apartament{
    private boolean preparatPerViure;
    
    public ApartamentBuit() {
        super();
    }

    public ApartamentBuit(int ID, int areaPropietat, int numHabitacions, String nomBarri, int preuPropietat, String parking, int pis, int porta, String tipus, boolean preparatPerViure) {
        super(parking, pis, porta, tipus, ID, areaPropietat, numHabitacions, nomBarri, preuPropietat);
        this.preparatPerViure = preparatPerViure;
    }

    public boolean getPreparatPerViure() {
        return preparatPerViure;
    }

    public void setPreparatPerViure(boolean preparatPerViure) {
        this.preparatPerViure = preparatPerViure;
    }

    @Override
    public String toString(){
        return "ID " + ID + ", Area " + areaPropietat + ", Habitacions " + numHabitacions + ", Barri " + nomBarri + ", Preu " + preuPropietat + ", Parking " + parking + ", Pis " + pis + ", Porta " + porta + ", Tipus " + tipus + ", Preparat per viure " + preparatPerViure;
    }
}
