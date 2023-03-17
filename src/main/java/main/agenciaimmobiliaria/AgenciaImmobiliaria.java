/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.agenciaimmobiliaria;

/**
 *
 * @author kerlyn.murillo
 */
public class AgenciaImmobiliaria {

    public static void main(String[] args) {
        AgenciaImmobiliaria agencia = new AgenciaImmobiliaria();
        agencia.iniciar();
    }

    public void iniciar(){
        MainView mainView = new MainView();
    }
}
