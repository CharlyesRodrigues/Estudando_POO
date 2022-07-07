package aula5_Banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner  leitor = new Scanner(System.in);
		
		
		Conta_Banco dono1 = new Conta_Banco();
		
	
		int opcao;
		
		do {
		
		System.out.println("Escolha a opcao");
		System.out.println("[1 -ABRIR CONTA  [2-FECHAR CONTA] [3-DEPOSITAR] [4-SACAR] [5-PAGAR MENSALDADE] [6-SAIR] ");
		 opcao = leitor.nextInt();
		
	
		if(opcao == 1) {
          
			if(dono1.isStatus()) {
        	  
        	  System.out.println("Conta já esta aberta");
          }else {
			System.out.println("ABRINDO CONTA");
			System.out.println("Que tipo de conta você quer abrir ?");
			leitor.nextLine();
		 	
		    String x = leitor.nextLine();
		    dono1.setTipo(x);
		   
		    System.out.println("Qual o nome do Dono da Conta: ?");
		    	
		    String nomeDono = leitor.nextLine();
		    dono1.setNomeDono(nomeDono);
		   
		    System.out.println("Qual o número da conta ?");
		    	
		    int numConta = leitor.nextInt();
		    dono1.setNumConta(numConta);
		    
		    dono1.abrirConta();
		    dono1.status();
          }
		    
		}else if(opcao == 2) {
			
			dono1.fecharConta();
			
			dono1.status();
		}else if(opcao == 3) {
			System.out.println("Quanto vc quer depositar ?");
			float x = leitor.nextFloat();
			dono1.depositar(x);
			dono1.status();
		}else if(opcao == 4) {
			System.out.println("Quanto você quer sacar ?");
						
			float x = leitor.nextFloat();
			
			dono1.sacar(x);
			
			dono1.status();
		}else if(opcao == 5) {
			
			dono1.pagarMensalidade();
			dono1.status();
		}else if(opcao == 6) {
			
			System.out.println("FIM DE PROGRAMA");
		}else {
			
			System.out.println("OPÇÃO INVÁLIDA");
		}
		
		//dono1.status();
		
		} while(opcao != 6);
		
			
	}

}		

