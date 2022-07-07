package ExercícioAula09;

import java.util.Arrays;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totalpaginas;
	private int pagatual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo2, String autor2, int totalpaginas2, Pessoa leitor) {

		super();
		this.titulo = titulo2;
		this.autor = autor2;
		this.totalpaginas = totalpaginas2;
		this.pagatual = 0;
		this.aberto = false;
		this.leitor = leitor;

	}

	public void detalhar() {

		System.out.println("Nome do leitor: " + leitor.getNome()+ " -" + " Idade:" + leitor.getIdade() + " anos"+ " -" + " Sexo:" + leitor.getSexo());
		System.out.println();
		System.out.println("Título : " + getTitulo() + "\nAutor : " + getAutor());

		System.out.println("Total de páginas: " + getTotalpaginas());
		System.out.println("Página atual: " + getPagatual());
		System.out.println("O livro está aberto : : " + isAberto());
		System.out.println("==============================================================================");

	}

	public Livro() {

	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
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

	public int getTotalpaginas() {
		return totalpaginas;
	}

	public void setTotalpaginas(int totalpaginas) {
		this.totalpaginas = totalpaginas;
	}

	public int getPagatual() {
		return pagatual;
	}

	public void setPagatual(int pagatual) {
		this.pagatual = pagatual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		if (aberto == true) {

			System.out.println("Abrindo o livro......");
			System.out.println("===========================================");
		} else {
			System.out.println("Livro já está aberto");
			System.out.println("===========================================");
		}

	}

	@Override
	public void fechar() {
		this.aberto = false;
		if (aberto == false) {

			System.out.println("Fechando o livro");
			System.out.println("===========================================");
		} else {
			System.out.println("Livro já está fechado");
			System.out.println("===========================================");
		}

	}

	@Override
	public void folhear(int p) {

		this.pagatual = p;
		if (aberto == true) {

			System.out.println("Folheando o livro até a página escolhida " + getPagatual());
			System.out.println("===========================================");
		} else {
			System.out.println("Não têm como folhear com o livro fechado");
			System.out.println("===========================================");
		}

	}

	@Override
	public void avancarpagina() {

		this.pagatual++;
	}

	@Override
	public void voltarpagina() {

		this.pagatual--;
	}

	/*
	 * public void abrir() { this.aberto = true; if (aberto == true) {
	 * 
	 * 
	 * System.out.println("Abrindo o livro"); }else {
	 * System.out.println("Livro já está aberto");
	 * 
	 * }
	 * 
	 * }
	 */

}
