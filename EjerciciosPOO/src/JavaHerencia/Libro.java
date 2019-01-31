package JavaHerencia;

public class Libro extends Ejemplar implements Prestable {
	private boolean prestado;
	
	public Libro(int codigo, String titulo, int año) {
		super(codigo, titulo, año);
	}

	@Override
	public String toString() {
		return super.toString() + " Libro [prestado=" + prestado + "]";
	}

	@Override
	public void prestar() {
		prestado = true;
		
	}

	@Override
	public void devolver() {
		prestado = false;
		
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
}
