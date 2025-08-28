package ar.com.educacionit.clase_03;

public class ContactoPersonal {

	// Atributos (Caracteristas)
	private String nombre;
	private String correo;
	private Direccion direccion;
	
	
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
	
	// Métodos estandar para poder acceder indirectamente a los atributos privados
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		
		if (this.correo == correo) {
			System.err.println("No podes cambiar por el mismo correo");
		} else {
			this.correo = correo;
			System.out.println("Se cambio, correctamente");
		}
		
	}

	@Override
	public String toString() {
		return "ContactoPersonal [nombre=" + nombre + ", correo=" + correo + "]";
	}
	
}
