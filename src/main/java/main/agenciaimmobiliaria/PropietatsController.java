package main.agenciaimmobiliaria;

public class PropietatsController {
    Propietats[] propietats = new Propietats[100];
    

    public PropietatsController() {
    }

    public void afegirPropietat(Propietats propietat) {
        for (int i = 0; i < propietats.length; i++) {
            if (propietats[i] == null) {
                propietats[i] = propietat;
                break;
            }
        }
    }

    public void eliminarPropietat(int ID) {
        for (int i = 0; i < propietats.length; i++) {
            if (propietats[i] != null && propietats[i].getID() == ID) {
                propietats[i] = null;
                break;
            }
        }
    }

    public void modificarPropietat(int ID, Propietats propietat) {
        for (int i = 0; i < propietats.length; i++) {
            if (propietats[i] != null && propietats[i].getID() == ID) {
                propietats[i] = propietat;
                break;
            }
        }
    }

    public void LlistarPropietats(){
        for(int i=0; i < propietats.length; i++){
            if(propietats[i] != null)
            System.out.println(propietats[i]);
        }
    }


}
