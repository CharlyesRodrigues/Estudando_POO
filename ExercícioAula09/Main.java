package Exerc�cioAula09;

public class Main {

	public static void main(String[] args) {
	      
			
    
	        Pessoa[] leitores = new Pessoa[3];
	        Livro[] livros = new Livro[3];
	
	  leitores[0]= new Pessoa ("Julia",45,"Feminino");
	  leitores[1] = new Pessoa (" Daniela ", 18 ," Feminino ");
	  leitores[2] = new Pessoa(" Carlos ", 34 ," Masculino");
            // Escolhi a forma de cima para instaciar o objeto leitores e assim passar os 
	  // par�metros contidos no m�todo contrutor da classe Pessoa.
	  //   O modelo abaixo tem a mesma finalidade do modelo escolhido acima.;
            
	       
	  /* leitores[0].setNome("Julia"); nessas  3 linha  pode-se ver os m�todos modificadores setters
	     leitores[0].setIdade(45);
	     leitores[0].setSexo("Feminino");*/
	  
	//=======================================================================================================  
	  
        // Na parte de baixo foi inst�nciado o objeto livros na classe Livro e na �ltima linha do par�metro
	  // foi passado os par�metros do livro, aonde o objeto leitores da classe Pessoa, foi acrescentado.
      livros[0] = new Livro("Quem mecheu no meu queijo", "Spencer Johson", 200, leitores[0]);
      livros[1] = new Livro("O caso da Borboleta At�ria", "Lucia Machado", 200, leitores[1]);
      livros[2] = new Livro("Qasdsdssa", "ssd", 200, leitores[2]);
      
      
      livros[0].abrir();
      livros[0].folhear(50);      
      livros[0].voltarpagina();
      livros[0].detalhar();
      livros[1].detalhar();
      livros[2].detalhar();
      
      
      // Ap�s inst�nciar o objeto leitores da classe Pessoa, eu fiz a chamada do m�todo para imprimir as 
     // informa��es dos leitores.
       leitores[0].imprimir();
       leitores[1].imprimir();
       leitores[2].imprimir();
     
           
           
    
	}

}
