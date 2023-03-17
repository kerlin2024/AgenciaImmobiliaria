package main.agenciaimmobiliaria;

import java.util.Scanner;

public class MainView {
    PropietatsController pc;

    // Fer el constructor per que al llamar al MainView() es mostri el menu
    public MainView() {
        pc = new PropietatsController();
        Scanner sc = new Scanner(System.in);
        int opcio;
        do {
            // Menu sobre el que vol realitzar, Menu CRUD de propietats
            System.out.println("Menu CRUD de propietats");
            System.out.println("1. Afegir una propietat");
            System.out.println("2. Modificar una propietat");
            System.out.println("3. Eliminar una propietat");
            System.out.println("4. Llistar totes les propietats");
            System.out.println("0. Sortir");
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    // Afegir una propietat
                    afegirPropietat();
                    break;
                case 2:
                    // Modificar una propietat
                    afegirPropietat();
                    break;
                case 3:
                    // Eliminar una propietat
                    afegirPropietat();
                    break;
                case 4:
                    // Llistar totes les propietats
                    pc.LlistarPropietats();
                    break;
                default:
                    System.out.println("Opció incorrecta");
                    break;
            }
        } while (opcio != 0);
    }

    private void afegirPropietat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Afegir una propietat");
        System.out.println("1. Xalet");
        System.out.println("2. Apartament Buit");
        System.out.println("3. Apartament Moblat");
        int opcio = sc.nextInt();
        switch (opcio) {
            case 1:
                // Afegir una casa
                System.out.println("Afegir un Xalet");
                System.out.println("Introdueix el ID de la propietat");
                int ID = sc.nextInt();
                System.out.println("Introdueix l'area de la propietat");
                int areaPropietat = sc.nextInt();
                System.out.println("Introdueix el nombre d'habitacions");
                int numHabitacions = sc.nextInt();
                System.out.println("Introdueix el nom del barri");
                String nomBarri = sc.next();
                System.out.println("Introdueix el preu de la propietat");
                int preuPropietat = sc.nextInt();
                System.out.println("Introdueix si té piscina");
                boolean piscina = sc.nextBoolean();
                System.out.println("Introdueix si té jardí");
                boolean jardí = sc.nextBoolean();
                System.out.println("Introdueix si té urbanització");
                boolean urbanització = sc.nextBoolean();
                Xalet xalet = new Xalet(ID, areaPropietat, numHabitacions, nomBarri, preuPropietat, piscina, jardí, urbanització);
                pc.afegirPropietat(xalet);
                break;
            case 2:
                //Afegir un apartament buit
                System.out.println("Afegir un Apartament Buit");
                System.out.println("Introdueix el ID de la propietat");
                ID = sc.nextInt();
                System.out.println("Introdueix l'area de la propietat");
                areaPropietat = sc.nextInt();
                System.out.println("Introdueix el nombre d'habitacions");
                numHabitacions = sc.nextInt();
                System.out.println("Introdueix el nom del barri");
                nomBarri = sc.next();
                System.out.println("Introdueix el preu de la propietat");
                preuPropietat = sc.nextInt();
                System.out.println("Introdueix si té parking");
                String parking = sc.next();
                System.out.println("Introdueix el pis");
                int pis = sc.nextInt();
                System.out.println("Introdueix la porta");
                int porta = sc.nextInt();
                System.out.println("Introdueix el tipus");
                String tipus = sc.next();
                System.out.println("Introdueix si està preparat per viure");
                boolean preparatPerViure = sc.nextBoolean();
                ApartamentBuit apartamentBuit = new ApartamentBuit(ID, areaPropietat, numHabitacions, nomBarri, preuPropietat, parking, pis, porta, tipus, preparatPerViure);
                pc.afegirPropietat(apartamentBuit);
                break;
            case 3:
                //Afegir un apartament moblat
                System.out.println("Afegir un Apartament Moblat");
                System.out.println("Introdueix el ID de la propietat");
                ID = sc.nextInt();
                System.out.println("Introdueix l'area de la propietat");
                areaPropietat = sc.nextInt();
                System.out.println("Introdueix el nombre d'habitacions");
                numHabitacions = sc.nextInt();
                System.out.println("Introdueix el nom del barri");
                nomBarri = sc.next();
                System.out.println("Introdueix el preu de la propietat");
                preuPropietat = sc.nextInt();
                System.out.println("Introdueix si té parking");
                parking = sc.next();
                System.out.println("Introdueix el pis");
                pis = sc.nextInt();
                System.out.println("Introdueix la porta");
                porta = sc.nextInt();
                System.out.println("Introdueix el tipus");
                tipus = sc.next();
                System.out.println("Introdueix la qualitat dels mobles");
                int qualitatMobles = sc.nextInt();
                ApartamentMoblat apartamentMoblat = new ApartamentMoblat(ID, areaPropietat, numHabitacions, nomBarri, preuPropietat, parking, pis, porta, tipus, qualitatMobles);
                pc.afegirPropietat(apartamentMoblat);
                break;
            default:
                System.out.println("Opció incorrecta");
                break;


        }
        
    }
}
