package ar.com.educacionit.clase_04;

// Superclase 
// Al colocarle un abstract a la superclase genero una restricción sobre esta clase. No se va a poder instanciar directemente
// Voy usar Contacto a través de las clases ContactoPersonal y ContactoProfesional.
public abstract class Contacto {
	
	private String nombre;
	private String correo;
	private Direccion direccion;
	
	// Contacto por defecto
	public Contacto() { }
	
	// C parametrizado
	public Contacto(String nombre, String correo, Direccion direccion) {
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
	}

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
		this.correo = correo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", direccion=" + direccion + "]";
	}
	
	
	public void mostrarInformacion() {
		System.out.println("Soy un contacto");
	}
	
	
	
	

}
