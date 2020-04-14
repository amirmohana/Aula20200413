package package20200413;

public class Serie {
	private String nome;
	private int anoDeLan�amento;
	private int temporadas;
	private int nota;

	public String toString() {
		return "Serie [" + "nome:" + getNome() + ",nota:" + getNota()+" ,temporadas=" + getTemporadas() + ",Serie lan�anda a "
				+ getAnoDeLan�amento() + " anos]";
	}

	// 2.1 Um construtor padr�o;
	public Serie() {
		System.out.println("Series");
	}

	// 2.2 Um construtor alternativo;
	public Serie(String nome, int anoDeLan�amento, int temporadas, int nota) {
		setNome(nome);
		setAnoDeLan�amento(anoDeLan�amento);
		setTemporadas(temporadas);
		setNota(nota);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLan�amento(int anoDeLan�amento) {
		this.anoDeLan�amento = anoDeLan�amento;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	//// 2.3 Um m�todo modificador;
	public void setNota(int nota) {
		if (nota < 0) {
			throw new RuntimeException("Nota deve ser Maior que 0");
		}
		this.nota = nota;
		
	}

	public String getNome() {
		return nome;
	}

	// 2.5 Um m�todo de acesso cujo retorno N�O seja o valor de um atributo, mas sim
	// um valor CALCULADO em fun��o de um valor de atributo.;
	public int getAnoDeLan�amento() {
		return calculandoAnoDeLan�amento();
	}

	public int getTemporadas() {
		return temporadas;
	}

	public int getNota() {
		return calcularNota() ;
	}

	public int calculandoAnoDeLan�amento() {
		return 2020 - anoDeLan�amento;
	}
	public int calcularNota() {
		return 100 - nota;
	}
}