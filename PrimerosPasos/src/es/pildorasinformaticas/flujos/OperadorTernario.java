package es.pildorasinformaticas.flujos;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {
        double salariot1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
        double salariot2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));
        
        double salario_mayor;
        
        // Uso del operador ternario para determinar el mayor salario
        salario_mayor = (salariot1 > salariot2) ? salariot1 : salariot2;

	System.out.println("El salario mayor es: " + salario_mayor);
	
    }
}

