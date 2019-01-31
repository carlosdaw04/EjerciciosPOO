package ejercicio1;

public class PruebaAutor {
	public static void main(String[] args) {
		Autor autor = new Autor("Carlos Costales", "costales98@gmail.com", 'M');
		System.out.println(autor);
		autor.setEmail("carcos_98@hotmail.com");
		System.out.println(autor);
		System.out.println(autor.getNombre());
	}
}
