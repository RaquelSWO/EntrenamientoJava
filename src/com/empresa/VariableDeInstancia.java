package com.empresa;

public class VariableDeInstancia {
   String nombre;
   
   void mostrarNombre()
   {
   System.out.println("Nombre: "+nombre);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VariableDeInstancia p1 = new VariableDeInstancia();
		 p1.nombre ="Raquel";
		 p1.mostrarNombre();
	}

}
