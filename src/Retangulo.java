
public class Retangulo extends Ponto {	

	public Retangulo() {
		super("Retangulo");
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
