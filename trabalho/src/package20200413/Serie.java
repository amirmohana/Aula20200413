package package20200413;

public class Serie {
	private String nome;
	private int anoDeLançamento;
	private int temporadas;
	private int nota;

	public String toString() {
		return "Serie [" + "nome:" + getNome() + ",nota:" + getNota()+" ,temporadas=" + getTemporadas() + ",Serie lançanda a "
				+ getAnoDeLançamento() + " anos]";
	}

	// 2.1 Um construtor padrão;
	public Serie() {
		System.out.println("Series");
	}

	// 2.2 Um construtor alternativo;
	public Serie(String nome, int anoDeLançamento, int temporadas, int nota) {
		setNome(nome);
		setAnoDeLançamento(anoDeLançamento);
		setTemporadas(temporadas);
		setNota(nota);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLançamento(int anoDeLançamento) {
		this.anoDeLançamento = anoDeLançamento;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	//// 2.3 Um método modificador;
	public void setNota(int nota) {
		if (nota < 0) {
			throw new RuntimeException("Nota deve ser Maior que 0");
		}
		this.nota = nota;
		
	}

	public String getNome() {
		return nome;
	}

	// 2.5 Um método de acesso cujo retorno NÂO seja o valor de um atributo, mas sim
	// um valor CALCULADO em função de um valor de atributo.;
	public int getAnoDeLançamento() {
		return calculandoAnoDeLançamento();
	}

	public int getTemporadas() {
		return temporadas;
	}

	public int getNota() {
		return calcularNota() ;
	}

	public int calculandoAnoDeLançamento() {
		return 2020 - anoDeLançamento;
	}
	public int calcularNota() {
		return 100 - nota;
	}
}