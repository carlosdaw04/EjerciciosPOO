package ejercicio2;

import ejercicio1.Autor;

public class Libro {
	String titulo;
	Autor autor;
	float precio;
	int stock;
	
	public Libro(String titulo, Autor autor, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public Libro (String titulo, Autor autor, float precio, int stock) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		String datos = getTitulo() + " de " + getAutor() + ". Precio:" + getPrecio() + "€";
		return datos;
	}
	
	public String getNombreAutor() {
		return autor.getNombre();
	}
	
	public String getEmailAutor() {
		return autor.getEmail();
	}
	
	public char getGeneroAutor() {
		return autor.getGenero();
	}
}
