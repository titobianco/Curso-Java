package es.pildorasinformaticas.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in); 
		
		System.out.println("Introduce el primer n°, por favor");
		
		int numero1=entrada.nextInt();
		
		System.out.println("Introduce el segundo n°, por favor");
		
		int numero2=entrada.nextInt();
		
		System.out.println("El resultado es  " + (numero1+numero2));
		
		entrada.close();
	}

}
