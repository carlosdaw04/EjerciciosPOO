package JavaHerencia;

public class Ejemplar {

	private int codigo;
	private String titulo;
	private int a�o;
	
	public Ejemplar(int codigo, String titulo, int a�o) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Ejemplar [codigo=" + codigo + ", titulo=" + titulo + ", a�o=" + a�o + "]";
	}
	
}
