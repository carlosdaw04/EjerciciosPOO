package ejercicio2;

import ejercicio1.Autor;

public class PruebaAutor {
	public static void main(String[] args) {
		Autor autor = new Autor("Carlos Costales", "costales98@gmail.com", 'M');
		Libro unLibro = new Libro("'Autobiografia'", autor, 49.5f);
		System.out.println(unLibro);
		
		Libro otroLibro = new Libro("'El brujo'", new Autor("Ramon Ramirez", "email22@gmail.com", 'M'), 30);
		System.out.println(otroLibro);
		System.out.println(otroLibro.getAutor().getEmail());
//		System.out.println(otroLibro.autor.getEmail());
		System.out.println(otroLibro.getEmailAutor());
	}
	
}
