package ar.com.educacionit.clase_04;

public class Test {

	public static void main(String[] args) {
	
		
		Direccion dpersonal = new Direccion("Alta dirección", 145, 1408);
		ContactoPersonal cpersonal = new ContactoPersonal("Juan", "juan@gmail.com", dpersonal, "2025-08-29");
		
		System.out.println(cpersonal);
		
		Direccion dprofesional = new Direccion("Calle empresa", 555, 1409);
		ContactoProfesional cprofesional = new ContactoProfesional("Laura", "laura@gmail.com", dprofesional, "ACME S.A.");

		System.out.println(cprofesional);
		
	}

}
