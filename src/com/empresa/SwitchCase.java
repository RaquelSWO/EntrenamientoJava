package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
	String modulo ="contabilidad";
	
	switch(modulo)
	{
	case "contabilidad":
	System.out.println("Ingrso al modulo de Contabilidad");
	//localizador
	break;
		case "Presupuesto":
		System.out.println("Ingrso al modulo de Presupuesto");
		break;
	case "Tesoreria":
		System.out.println("Ingrso al modulo de Tesoreria");
		//localizador
		break;
	case "Nomina":
		System.out.println("Ingrso al modulo de Nomina");
		//localizador
		break;
	case "Inventarios":
		System.out.println("Ingrso al modulo de Inventarios");
	//localizador
		break;
	case "IndiCom":
		System.out.println("Ingrso al modulo de IndiCom");
		//localizador
		break;
	case "Predial":
		System.out.println("Ingrso al modulo de Predial");
		//localizador
		break;
		default:
		System.out.println("Regrese a la pagina y escoja un modulo");
	}
	}
}
