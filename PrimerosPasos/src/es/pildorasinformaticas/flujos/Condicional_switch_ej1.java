package es.pildorasinformaticas.flujos;

import javax.swing.JOptionPane;

public class Condicional_switch_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int hijos=Integer.parseInt(JOptionPane.showInputDialog("Introduce n° de hijos"));
		
		switch (hijos) {
		
		
		case 0: 
			
			System.out.println("La natalidad es baja, tenlo en cuenta");
			break;
			
		case 1:
			
			System.out.println("Por algo se empieza");
			break;
			
		case 2:
			System.out.println("Tienes pareja");
			break;
			
		case 3: 
			System.out.println("Veo que te estas animando");
			break;
			
		case 4:
			System.out.println("Ya tienes familia numerosa");
			break;
			
			default: 
				System.out.println("Vas a tener que trabajar duro");
	 }

   }
	
}
