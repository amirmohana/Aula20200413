package package20200413;

public class AppSerie {
	public static void main(String[] args) {
		Serie marvel = new Serie("Serie Marvel", 2010, 15, 10);
		Serie twd = new Serie();
		twd.setNome("The Walking Dead");
		twd.setTemporadas(12);
		twd.setAnoDeLançamento(2005);
		twd.setNota(10);

		System.out.println(twd);
		System.out.println(marvel);
	}
}