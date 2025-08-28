package ar.com.educacionit.clase_03;

public class ContactoPersonal {

	// Atributos (Caracteristas)
	String nombre;
	String correo;
	
	// Constructor por defecto
	public ContactoPersonal() {	}
	
	// Constructor parametrizado 
	public ContactoPersonal(String nombre, String correo) {
		this.nombre = nombre;
		this.correo = correo;
	}

	// Métodos -> (Acciones) -> (Comportamiento)
	void mostrarNombre() {
		System.out.println("El nombre es: " + this.nombre);
	}

	@Override
	public String toString() {
		return "ContactoPersonal [nombre=" + nombre + ", correo=" + correo + "]";
	}
		
	
}
