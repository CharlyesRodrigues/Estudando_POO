package Exercicio4_Agenda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
         String nome;
		Agenda pessoas = new Agenda();

		Scanner leitor = new Scanner(System.in);

		int opcao;
		System.out.println("Criando um agenda de 10 pessoas ");
		do {

			System.out.println("Escolha a opção Desejada ");

			System.out.println(
					"[1- ARMAZENAR PESSOA -- [2-REMOVER PESSOA] -- [3-BUSCAR PESSSOA] -- [4-IMPRIMIR AGENDA] -- [5-IMPRIMIR PESSOA ] "
							+ "[6- SAIR]");

			opcao = leitor.nextInt();

			if (opcao == 1) {

				System.out.println("Nome a ser inserido :");
				leitor.nextLine();
				String nova = leitor.nextLine();
                 nome = nova.toUpperCase();
				System.out.println("Qual é a sua idade ?");
				int idade = leitor.nextInt();
				
				System.out.println("Qual é a sua altura ?");

				float altura = leitor.nextFloat();

				pessoas.armazenarPessoa(nome, idade, altura);
				

				System.out.println("Pessoa salva na Agenda");

			} else if (opcao == 2) {
				leitor.nextLine();
				System.out.println("Qual pessoa vc quer remover ?");

				
				String nova = leitor.nextLine();
                nome = nova.toUpperCase();
				
				pessoas.removePessoa(nome);

				
				System.out.println("=======================================================");

			} else if (opcao == 3) {
				leitor.nextLine();

				System.out.println("Qual pessoa você quer buscar ?");

				String nova = leitor.nextLine();
                nome = nova.toUpperCase();
				pessoas.buscarPessoa(nome);
				

			} else if (opcao == 4) {
				leitor.nextLine();
				pessoas.imprimirAgenda();

			} else if (opcao == 5) {
				leitor.nextLine();

				System.out.println("Qual é o indice da pessoa que gostaria de saber ?");
				int x = leitor.nextInt();
				pessoas.imprimePessoa(x);
			}
		} while (opcao != 6);

		leitor.close();
	}

}
