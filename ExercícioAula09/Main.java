package ExercícioAula09;

public class Main {

	public static void main(String[] args) {
	      
			
    
	        Pessoa[] leitores = new Pessoa[3];
	        Livro[] livros = new Livro[3];
	
	  leitores[0]= new Pessoa ("Julia",45,"Feminino");
	  leitores[1] = new Pessoa (" Daniela ", 18 ," Feminino ");
	  leitores[2] = new Pessoa(" Carlos ", 34 ," Masculino");
            // Escolhi a forma de cima para instaciar o objeto leitores e assim passar os 
	  // parâmetros contidos no método contrutor da classe Pessoa.
	  //   O modelo abaixo tem a mesma finalidade do modelo escolhido acima.;
            
	       
	  /* leitores[0].setNome("Julia"); nessas  3 linha  pode-se ver os métodos modificadores setters
	     leitores[0].setIdade(45);
	     leitores[0].setSexo("Feminino");*/
	  
	//=======================================================================================================  
	  
        // Na parte de baixo foi instânciado o objeto livros na classe Livro e na última linha do parâmetro
	  // foi passado os parâmetros do livro, aonde o objeto leitores da classe Pessoa, foi acrescentado.
      livros[0] = new Livro("Quem mecheu no meu queijo", "Spencer Johson", 200, leitores[0]);
      livros[1] = new Livro("O caso da Borboleta Atíria", "Lucia Machado", 200, leitores[1]);
      livros[2] = new Livro("Qasdsdssa", "ssd", 200, leitores[2]);
      
      
      livros[0].abrir();
      livros[0].folhear(50);      
      livros[0].voltarpagina();
      livros[0].detalhar();
      livros[1].detalhar();
      livros[2].detalhar();
      
      
      // Após instânciar o objeto leitores da classe Pessoa, eu fiz a chamada do método para imprimir as 
     // informações dos leitores.
       leitores[0].imprimir();
       leitores[1].imprimir();
       leitores[2].imprimir();
     
           
           
    
	}

}
