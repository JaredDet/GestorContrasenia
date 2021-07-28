package contrasenia;

import java.util.Random;

public class GeneraContrasenia {

    private static Character seleccionarCaracter() {
        String numeros = "0123456789";
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String simbolos = "!#@%&/?¿-_:.;,<>=´*+÷";

        char seleccionado = 0;

        switch ((int) (Math.random() * 4)) {
            case 0 -> seleccionado = numeros.charAt((int) (Math.random() * numeros.length()));
            case 1 -> seleccionado = mayusculas.charAt((int) (Math.random() * mayusculas.length()));
            case 2 -> seleccionado = minusculas.charAt((int) (Math.random() * minusculas.length()));
            case 3 -> seleccionado = simbolos.charAt((int) (Math.random() * simbolos.length()));
        }
        return seleccionado;
    }
    public static String generarContrasenia() {

        String contrasenia = "";

        do {
            contrasenia += seleccionarCaracter();
        } while (!AnalizaContrasenia.verificarContrasenia(contrasenia).equals("SEGURA"));
        return contrasenia;
    }

    private static Character seleccionarCaracterSinSimbolos() {
        String numeros = "0123456789";
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        char seleccionado = 0;

        switch ((int) (Math.random() * 3)) {
            case 0 -> seleccionado = numeros.charAt((int) (Math.random() * numeros.length()));
            case 1 -> seleccionado = mayusculas.charAt((int) (Math.random() * mayusculas.length()));
            case 2 -> seleccionado = minusculas.charAt((int) (Math.random() * minusculas.length()));
        }
        return seleccionado;
    }
    public static String generarContraseniasinSimbolos() {

        String contrasenia = "";

        do {
            contrasenia += seleccionarCaracterSinSimbolos();
        } while (!AnalizaContrasenia.verificarContrasenia(contrasenia).equals("MEDIANAMENTE SEGURA"));
        return contrasenia;
    }
}
