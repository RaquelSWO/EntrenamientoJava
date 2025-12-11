package com.empresa;

public class perro {

	
		String nombre= "Balto";
		String raza= "Criollo";
		int altura=4;
		
		public void ladrar()
		 {
			System.out.println(nombre+"Esta ladrando");
			
		 }
		
		public static void main(String[] args) {
			perro perro = new perro();
	System.out.println(perro.altura);
	perro.ladrar();
}
}
