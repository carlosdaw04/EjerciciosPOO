package ejercicio1;

public class Autor {
	
	String nombre;
	String email;
	char genero;
	
	public Autor(String nombre, String email, char genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String datos = getNombre() + " (" + getGenero() + ")" + " " + getEmail();
		return datos;
	}
}
