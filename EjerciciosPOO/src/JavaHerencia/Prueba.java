package JavaHerencia;

public class Prueba {
	public static void main(String[] args) {
		Libro libro = new Libro (123, "El Quijote", 1605);
		System.out.println(libro);
		Ejemplar e = libro;
		Prestable p = libro;
		
	}
}
