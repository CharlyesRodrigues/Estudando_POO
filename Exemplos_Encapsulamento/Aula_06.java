package Exemplos_Encapsulamento;

public class Aula_06 {

	public static void main(String[] args) {
		Controle_Remoto c = new Controle_Remoto();
		
		// Ao abrir o menu, ele me mostra como est� o aparelho que foi acessado(Exemplo: televis�o)
		// ou seja, se est� ligado, se est� tocando ou se t�m volume.
		c.abrirMenu();
	
		System.out.println();
		//c.ligar();
		
		c.maisVolume();
		c.play();
		c.pause();
		
		System.out.println();
		c.abrirMenu();

	}

}
