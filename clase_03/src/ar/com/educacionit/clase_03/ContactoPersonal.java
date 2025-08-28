package ar.com.educacionit.clase_03;

public class ContactoPersonal {

	// Atributos (Caracteristas)
	private String nombre;
	private String correo;
	private Direccion direccion;
		
	// Constructor por defecto
	public ContactoPersonal() {	}

	// Constructor parametrizado (1)
	public ContactoPersonal(String nombre, String correo) {
		atributosComunes(nombre, correo);
	}
	
	// Constructor parametrizado (2)
	public ContactoPersonal(String nombre, String correo, Direccion direccion) {
		atributosComunes(nombre, correo);
		this.direccion = direccion;
	}
	// Btn Der -> Refactor -> Extract Method...
	private void atributosComunes(String nombre, String correo) {
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
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "ContactoPersonal [nombre=" + nombre + ", correo=" + correo + ", direccion=" + direccion + "]";
	}

	
	
}
