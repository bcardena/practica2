package com.co.edu.udea.automata;

public class Automata {

    public boolean analizarSecuencia(String secuencia) {
        String estado = "q0";

        System.out.println("La secuencia leída es: " + secuencia);

        for (int i = 0; i < secuencia.length(); i++) {
            char caracter = secuencia.charAt(i);

            switch (estado) {
                case "q0":
                    if (caracter == '0') {
                        estado = "q2";
                    } else if (caracter == '1') {
                        estado = "q1";
                    }
                    break;
                case "q1":
                    if (caracter == '0') {
                        estado = "q3";
                    } else if (caracter == '1') {
                        estado = "q0";
                    }
                    break;
                case "q2":
                    if (caracter == '0') {
                        estado = "q0";
                    } else if (caracter == '1') {
                        estado = "q3";
                    }
                    break;
                case "q3":
                    if (caracter == '0') {
                        estado = "q1";
                    } else if (caracter == '1') {
                        estado = "q2";
                    }
            }

        }

        return estado.equals("q0") || estado.equals("q1") || estado.equals("q3");
    }
}
