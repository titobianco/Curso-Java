package es.pildorasinformaticas.flujos;

import javax.swing.JOptionPane;

public class Condicional_iF_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int distancia_colegio;
		
		double renta_familiar; 
		
		byte hermanos_centro;
		
		distancia_colegio=Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia al colegio en Km"));
		
		renta_familiar=Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar"));
		
		hermanos_centro=Byte.parseByte(JOptionPane.showInputDialog("Introduce numero de hermanos"));
		
		if (distancia_colegio>10 || renta_familiar<20000 || hermanos_centro>=2){
		
		System.out.println("El alumno tiene beca");
		
		 }else {
			 		System.out.println("El alumno no tiene beca");
		 }
	}
	
}

