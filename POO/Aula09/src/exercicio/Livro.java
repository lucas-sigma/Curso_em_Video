package exercicio;

public class Livro implements Publicacao {
	private String titulo, autor;
	private int totalPaginas, paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	

	// Métodos Públicos
	public void detalhes() {
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotalPaginas());
		System.out.println("Página Atual: " + this.getPaginaAtual());
		System.out.println("Aberto: " + isAberto());
		System.out.println("Leitor: " + this.getLeitor());
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotalPaginas() {
		return totalPaginas;
	}


	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}


	public int getPaginaAtual() {
		return paginaAtual;
	}


	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}


	public String isAberto() {
		if (this.aberto == true)
				return "Sim";
		return "Não";
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public Pessoa getLeitor() {
		return leitor;
	}


	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		if(isAberto() == "Não")
			this.setAberto(true);		
	}


	@Override
	public void fechar() {
		if(isAberto() == "Sim")
			this.setAberto(false);
	}


	@Override
	public void folhear(int pagina) {
		if(pagina > this.getTotalPaginas() || pagina < 0)
			System.out.println("Não é possível folhear para uma página inexistente.");
		else
			this.setPaginaAtual(pagina);
	}


	@Override
	public void avancarPagina() {
		this.setPaginaAtual(this.getPaginaAtual() + 1);
	}


	@Override
	public void voltarPagina() {
		this.setPaginaAtual(this.getPaginaAtual() - 1);
	}
	
	
}