package ar.com.educacionit.clase_03;

public class Test {
	// PUnto de entrada de la aplicación JAVA
	
	public static void main(String[] args) {
		
		// syso -> Ctrl + Enter
		System.out.println("Hola mundo desde JAVA");
		
		// Instanciar la clase ContactoPersonal
		
		// usando el constructor por defecto
		ContactoPersonal cp1 = new ContactoPersonal();
		
		System.out.println(cp1); // los atributos van tener valores por defecto
		System.out.println(cp1.toString());
		
		// usando el constructor parametrizado
		
		ContactoPersonal cp2 = new ContactoPersonal("Maxi", "max@gmail.com");
		System.out.println(cp2);
		System.out.println(cp2.toString());
		
		// Visibilidad publica, al cambiar a privado dejo de poder modificar los atributos directamente
		
		/*
		System.out.println(cp2.nombre);
		cp2.nombre = "Pedro";
		System.out.println(cp2.nombre);
		
		System.out.println(cp2.correo);
		cp2.correo = "pedro@gmail.com";
		System.out.println(cp2.correo);
		*/
		
		cp2.mostrarNombre();
		
		// Creamos otra instancia de ContactoPersonal
		
		ContactoPersonal cp3 = new ContactoPersonal("Roberto", "roberto@gmail.com");
		
		System.out.println(cp3);
		
		System.out.println(cp3.getNombre());
		System.out.println(cp3.getCorreo());
		
		cp3.setCorreo("roberto@gmail.com");
		cp3.setCorreo("roberto-carlos@gmail.com");
		System.out.println(cp3.getCorreo());
		
		
		Direccion d1 = new Direccion("Calle falsa 123", 1234, 304);
		
		System.out.println(cp3);
		
		cp3.setDireccion(d1);
		
		System.out.println(cp3);
		
		ContactoPersonal cp4 = new ContactoPersonal("Pepito", "pepito@gmail.com", 
														new Direccion("Otra calle", 222, 333));
		
		
	}

}
