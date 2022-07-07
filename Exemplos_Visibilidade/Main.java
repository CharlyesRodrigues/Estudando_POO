package Exemplos_Visibilidade;


public class Main {

	public static void main(String[] args) {
	


	     // Exemplo com método construtor 
	     Canetas_Visibilidade c2 = new Canetas_Visibilidade("Bic ","Amarela",0.5f, 30, false);
	     
	 	// Ao colocar o método como private há erro assim como nos atributos
			//c2.destamparar();
			//c2.tampar();
	     
	     c2.rabiscar();
	
         c2.imprimir();	
         System.out.println();

            //Exemplo com método modifcador set(setters)
         Canetas_Visibilidade c3 = new Canetas_Visibilidade();
  	    c3.setModelo("Faber");
  	    c3.setPonta(0.75f);
  	    c3.setCarga(20);
	    c3.rabiscar();
  	   c3.imprimir();	
  	  System.out.println();
  	 Canetas_Visibilidade c4 = new Canetas_Visibilidade("Anabelle","Preta",1.0f, 95, true);
  	 c4.imprimir();
	}


}
