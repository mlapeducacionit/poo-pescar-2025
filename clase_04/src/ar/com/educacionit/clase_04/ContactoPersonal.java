package ar.com.educacionit.clase_04;

public class ContactoPersonal extends Contacto {

	// Atributos (Caracteristas)
	private String fechaCumple;
	
	// Constructor por defecto
	public ContactoPersonal() {
		super();
	}
	// Constructor parametrizado (1)
	public ContactoPersonal(String nombre, String correo, Direccion direccion) {
		super(nombre, correo, direccion);
	}
	
	// Constructor parametrizado (2)
	public ContactoPersonal(String nombre, String correo, Direccion direccion, String fechaCumple) {
		super(nombre, correo, direccion);
		this.fechaCumple = fechaCumple;
	}
	public String getFechaCumple() {
		return fechaCumple;
	}
	public void setFechaCumple(String fechaCumple) {
		this.fechaCumple = fechaCumple;
	}
	
	@Override
	public String toString() {
		return "ContactoPersonal [" + super.toString() + " fechaCumple=" + fechaCumple + "]";
	}

	
	
	
	
	
	
	
}
