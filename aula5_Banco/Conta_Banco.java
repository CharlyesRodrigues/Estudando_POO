package aula5_Banco;

import java.util.Scanner;

public class Conta_Banco {
	Scanner  leitor = new Scanner(System.in);
	public int numConta;
	protected String tipo ;
	private String nomeDono;
	private float saldo;
	private boolean status ;
	
	
	
	
public Conta_Banco(Scanner leitor, int numConta, String tipo, String nomeDono, float saldo, boolean status) {
		
		this.leitor = leitor;
		this.numConta = numConta;
		this.tipo = tipo;
		this.nomeDono = nomeDono;
		this.saldo = 0;
		this.status = status;
	}
	

	public Conta_Banco() {
		
		this.saldo = 0;
		this.status = false;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
	    
		this.tipo = tipo;
	
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void abrirConta() {
	      	    
	
	 if(tipo.equals("cc" ) | tipo.equals("CC" ) | tipo.equals("Cc" ) | tipo.equals("cC" )) {  
		   this.status = true;
	    	this.setTipo("Conta Corrente");
		  this.setSaldo(50);
	  
	  }else  if(tipo.equals("cp" ) | tipo.equals("CP" ) | tipo.equals("Cp" ) | tipo.equals("cP" )) {
		  this.tipo = "Conta Poupança";
		  this.saldo = 150;
		  this.status = true;
	  }else if( isStatus() == true) {
		  
		  System.out.println("Conta já esta aberta");
	  }
	  
	  
	  
	}
    public void fecharConta() {
		this.getSaldo();
	if	(this.getSaldo() == 0) {		
		System.out.println("Seu Saldo é :" + getSaldo() + "\nFECHANDO CONTA");
	   this.status = false;
	   this.numConta = 0;
	   this.tipo = "";
	   this.nomeDono = "";
	
	}else if	(this.getSaldo() > 0) {
		
		System.out.println("Seu Saldo é :" + getSaldo() + "\n NÃO É POSSÍVEL FECHAR A CONTA ,POIS AINDA HÁ SALDO");
	  }
	}
    public void depositar(float x) {
		      			
	this.saldo = this.getSaldo() + x;
	}

    public void sacar(float x) {
		
       		
		 if(x > this.getSaldo()) {
			 System.out.println("Operação negada, pois valor é maior que saldo");
			 
		 } else if(x <= this.getSaldo() ) {
			 
			this.saldo = this.getSaldo() - x ;
						
		 
		 			 
		 }else if (x ==this.getSaldo()) {
			 
			 System.out.println("Conta zerada");
		 }
		
	}

    public void pagarMensalidade() {
	
	 if (this.tipo == "Conta Corrente" && this.saldo >= 20) {
		 System.out.println("Descontando mensalidade de R$ 20,00");
		 this.saldo = this.getSaldo() - 20;
		 
	 }else if (this.tipo == "Conta Corrente" &&  this.saldo < 20 && this.saldo > 0) {
		 System.out.println("A mensalidade da Conta Corrente é R$ 20,00.Não foi possível pagar,pois o saldo é menor");
		
		 
	 }else if (this.tipo == "Conta Poupança" &&  this.saldo >= 50 ){
		 
		 System.out.println("Descontando mensalidade de R$ 50,00");
		 this.saldo = this.getSaldo() - 50;
		 
		 
	 
	 }else if (this.tipo == "Conta Poupança" && this.saldo < 50 && this.saldo > 0){
		 System.out.println("A mensalidade da Conta Corrente é R$ 50,00.Não foi possível pagar,pois o saldo é menor");
		 
	 }else if (this.tipo == "Conta Corrente" && this.saldo == 0){
		 System.out.println("Saldo nulo. Não tem como pagar a mensalidade.");
		
		 
	 }else if (this.tipo == "Conta Poupança" && this.saldo == 0){
		 System.out.println("Saldo nulo. Não tem como pagar a mensalidade.");
		
		 
	 }
}
    
    public void status() {
    	
    	
    System.out.println("\nStatus: " + this.isStatus() + "\nNúmero da conta : " + this.numConta + "\nTipo : " + this.tipo + "\nNome do Dono da Conta : " + this.getNomeDono()
    + "\nSaldo: " + this.getSaldo() );
    }
}
