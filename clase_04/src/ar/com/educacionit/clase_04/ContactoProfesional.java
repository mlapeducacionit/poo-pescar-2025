package ar.com.educacionit.clase_04;

public class ContactoProfesional extends Contacto {
	
	private String empresa;

	public ContactoProfesional(String nombre, String correo, Direccion direccion) {
		super(nombre, correo, direccion); // <---- super() es un método que construye la superclase 'Contacto'
	
	}

	public ContactoProfesional(String nombre, String correo, Direccion direccion, String empresa) {
		super(nombre, correo, direccion);
		this.empresa = empresa;
	}

	
	
	

}
