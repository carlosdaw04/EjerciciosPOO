package JavaHerencia;

public class Revista extends Ejemplar {
	private int numero;
	public Revista(int codigo, String titulo, int a�o) {
		super(codigo, titulo, a�o);
		this.numero = numero;
	}
	@Override
	public String toString() {
		return super.toString() + " Revista [numero=" + numero + "]";
	}

}
