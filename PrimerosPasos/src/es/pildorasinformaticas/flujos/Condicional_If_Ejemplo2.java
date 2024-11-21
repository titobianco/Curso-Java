package es.pildorasinformaticas.flujos;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		if(edad<18) {
			
			System.out.println("Esres muy joven");
			
		} else if(edad<40){
			
			System.out.println("Eres joven");
		}else if(edad<65) {
			
			System.out.println("Eres maduro");
			
		}else {
			
			System.out.println("Cuidate!");
		}

	}

}
