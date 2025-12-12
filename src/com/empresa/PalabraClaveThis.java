package com.empresa;

public class PalabraClaveThis {

	int numeromatricula;
	String nombre;
	String grado;
	
	//public PalabraClaveThis (int i, String n, String s)
	public PalabraClaveThis (int numeromatricula, String nombre,String grado)
		 {
		
		this.numeromatricula= numeromatricula;
		this.nombre= nombre;
		this.grado= grado;
	 }
	public  void display()
	{
		System.out.println("numeromatricula : "+ numeromatricula+ "Nombre es :"+nombre+ "Clase: "+grado);
	}
	public static void main(String[] args) {
		
		PalabraClaveThis est = new PalabraClaveThis(10, "Juan", "Segundo");
		est.display();
	}

}
