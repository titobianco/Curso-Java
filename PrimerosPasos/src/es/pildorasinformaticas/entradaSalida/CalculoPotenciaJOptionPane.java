package es.pildorasinformaticas.entradaSalida;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {
    public static void main(String[] args) {
        // Solicitar la base mediante una ventana de entrada
        String baseStr = JOptionPane.showInputDialog("Introduce la base:");
        // Convertimos la entrada en un número double
        double base = Double.parseDouble(baseStr);

        // Solicitar el exponente mediante una ventana de entrada
        String exponenteStr = JOptionPane.showInputDialog("Introduce el exponente:");
        // Convertimos la entrada en un número double
        double exponente = Double.parseDouble(exponenteStr);

        // Calcular la potencia base^exponente
        double resultado = Math.pow(base, exponente);

        // Mostrar el resultado en la consola
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
    }
}

