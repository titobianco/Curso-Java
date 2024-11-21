package es.pildorasinformaticas.flujos;

import javax.swing.JOptionPane;

public class Ejercicio1Condicional_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir la altura al usuario mediante ventana emergente
        String alturaTexto = JOptionPane.showInputDialog("Introduce tu altura en cm (ej: 170):");
        int altura = Integer.parseInt(alturaTexto);

        // Pedir el género al usuario mediante ventana emergente
        String genero = JOptionPane.showInputDialog("Introduce tu género (hombre o mujer):");

        // Inicializar la variable que almacenará el peso ideal
        int pesoIdeal;

        // Condicional para calcular el peso ideal dependiendo del género
        if (genero.equalsIgnoreCase("hombre")) {
            pesoIdeal = altura - 110;
            JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + pesoIdeal + " kg");
        } else if (genero.equalsIgnoreCase("mujer")) {
            pesoIdeal = altura - 120;
            JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + pesoIdeal + " kg");
        } else {
            JOptionPane.showMessageDialog(null, "Género no reconocido. Por favor, introduce 'hombre' o 'mujer'.");
        }
    }
}
