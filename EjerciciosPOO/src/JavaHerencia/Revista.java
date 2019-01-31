package JavaHerencia;

public class Revista extends Ejemplar {
	private int numero;
	public Revista(int codigo, String titulo, int año) {
		super(codigo, titulo, año);
		this.numero = numero;
	}
	@Override
	public String toString() {
		return super.toString() + " Revista [numero=" + numero + "]";
	}

}
