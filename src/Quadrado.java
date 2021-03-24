
public class Quadrado extends Ponto {

	public Quadrado() {
		super("Quadrado");
	}

	@Override
	public boolean podeRotacionar() {
		return true;
	}

	@Override
	public boolean podeAumentar() {
		return false;
	}

	@Override
	public boolean podeDiminuir() {
		return false;
	}

}
