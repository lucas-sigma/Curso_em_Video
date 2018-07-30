package exercicio;

public class App {

	public static void main(String[] args) {
		Pessoa lucas = new Pessoa("Lucas", "Masculino", 20);
		Livro l = new Livro("Python", "Use a Cabeça", 300, 100, lucas);
		
		l.detalhes();
	}

}
