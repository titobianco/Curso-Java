package es.pildorasinformaticas.flujos;

import javax.swing.JOptionPane;

public class Anidamiento_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor: "));
		
		if (edad>=18) {
		
			String carnet=JOptionPane.showInputDialog("¿Tienes Carnet?");
			
			if(carnet.equals("si"))  JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
			
			else JOptionPane.showMessageDialog(null, "Sin carnet no hay coche");
				
				

	}else {
		
		 JOptionPane.showMessageDialog(null, "Si eres menos no puedes tener carnet ni coche");
	}

}
	
}
