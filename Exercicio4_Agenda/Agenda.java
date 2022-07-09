package Exercicio4_Agenda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*Crie uma classe Agenda que pode armazenar 
10 pessoas e que seja 
capaz de realizar as seguintes operações:

void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.*/
public class Agenda extends Pessoa {

	public List<String> nomes = new ArrayList<String>();
	public List<Integer> idades = new ArrayList<Integer>();
	public List<Float> alturas = new ArrayList<Float>();

	// public List<Integer> idades = new ArrayList<Integer>();
	// public List<Float> alturas = new ArrayList<Float>();
	public Scanner leitor;
	// public Pessoa pessoa;

	public Agenda() {

	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public List<Integer> getIdades() {
		return idades;
	}

	public void setIdades(List<Integer> idades) {
		this.idades = idades;
	}

	public List<Float> getAlturas() {
		return alturas;
	}

	public void setAlturas(List<Float> alturas) {
		this.alturas = alturas;
	}

	public Scanner getLeitor() {
		return leitor;
	}

	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}

	/*
	 * public Pessoa getPessoa() { return pessoa; }
	 * 
	 * 
	 * public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	 */

	// void armazenaPessoa(String nome, int idade, float altura);
	public void armazenarPessoa(String nome, int idade, float altura) {
		nomes.add(nome);
		idades.add(idade);
		alturas.add(altura);

	}

	public void removePessoa(String nome) {

		for (int i = 0; i < nomes.size(); i++) {

			// obter item da lista (get)

			if (nomes.get(i).equals(nome)) {
				// remover objetos (remove)
				nomes.remove(i);
				idades.remove(i);
				alturas.remove(i);
				System.out.println("A pessoa removida foi: " + nome);
			}else if (nomes.get(i) != (nome)){
				
				System.out.println("Essa pessoa não existe na agenda");
				
			}
		}

	}

	// informa em que posição da agenda está a pessoa

	public void buscarPessoa(String nome) {

		System.out.println("A posição que a ou o " + nome + " se encontra é a " + nomes.indexOf(nome));

	}

	public void imprimirAgenda() {
	
		for (int i = 0; i < nomes.size(); i++) {

			// obter item da lista (get)
			System.out.println("Nome: "+ nomes.get(i) + " Idade: " + idades.get(i) + " Altura: " + alturas.get(i));

		}
	}

	// imprime os dados da pessoa que está na posição “i” da agenda.*/

	void imprimePessoa(int index) {

		System.out.println("O indice " + index + " se referente a pessoa : ");
		System.out.println("===========================================================================");
		System.out.println("Nome :" + nomes.get(index));
		System.out.println("Idades: " + idades.get(index));
		System.out.println("Alturas: " + alturas.get(index));
		System.out.println("============================================================================");

	}

}
