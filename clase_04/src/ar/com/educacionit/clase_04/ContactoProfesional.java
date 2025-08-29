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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "ContactoProfesional [" + super.toString() + " empresa=" + empresa + "]";
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Soy un contacto Profesional");
		System.out.println("Nombre: " + super.getNombre());
		System.out.println("Empresa: " + this.getEmpresa());
	}
	
	

	
	
	

}
