package ar.com.educacionit.clase_04;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> contactos;
	
	public Agenda() {
        contactos = new ArrayList<>();
    }
	
	public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado: " + contacto.getNombre());
    }
	
	 public void mostrarAgenda() {
        System.out.println("\n Agenda:");
        for (Contacto p : contactos) {
            p.mostrarInformacion();
        }
    }
}
