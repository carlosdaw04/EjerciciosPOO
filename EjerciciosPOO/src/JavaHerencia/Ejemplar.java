package JavaHerencia;

public class Ejemplar {

	private int codigo;
	private String titulo;
	private int año;
	
	public Ejemplar(int codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}

	@Override
	public String toString() {
		return "Ejemplar [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
}
