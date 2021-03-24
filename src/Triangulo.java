
public class Triangulo extends Ponto {

	public Triangulo() {
		super("Triangulo");		
	}

	@Override
	public boolean podeRotacionar() {
		return false;
	}

	@Override
	public boolean podeAumentar() {
		return true;
	}

	@Override
	public boolean podeDiminuir() {
		return true;
	}

}
