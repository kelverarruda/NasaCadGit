
public class Circulo extends Ponto {

	public Circulo() {
		super("Circulo");
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
