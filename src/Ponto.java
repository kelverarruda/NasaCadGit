
public class Ponto implements FormasGeometricas {
	
	private String nome;

	public Ponto(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	@Override
	public boolean podeRotacionar() {
		return false;
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
