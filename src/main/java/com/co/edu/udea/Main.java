package com.co.edu.udea;

import com.co.edu.udea.automata.Automata;

import java.util.Scanner;

public class Main {

    private static Automata automata = new Automata();

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        boolean esUnosYCeros = false;

        while (!esUnosYCeros) {

            System.out.println("Ingrese una secuencia de unos y ceros");
            String secuencia = lector.nextLine();

            esUnosYCeros = esUnosYCeros(secuencia);

            if (esUnosYCeros) {

                boolean esSecuenciaValida = automata.analizarSecuencia(secuencia);

                if (esSecuenciaValida) {
                    System.out.println("Secuencia aceptada");
                } else {
                    System.out.println("Secuencia no aceptada");
                }
            } else {
                System.out.println("Solo puede ingresar unos y ceros, intente nuevamente");
            }
        }
    }

    private static boolean esUnosYCeros(String secuencia) {
        boolean esUnosYCeros = true;

        for(int i = 0; i < secuencia.length(); i++){
            if(secuencia.charAt(i) != '0' && secuencia.charAt(i) != '1'){
                esUnosYCeros = false;
                break;
            }
        }

        return esUnosYCeros;
    }
}