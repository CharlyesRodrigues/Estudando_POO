package Exemplos_Encapsulamento;

public class Aula_06 {

	public static void main(String[] args) {
		Controle_Remoto c = new Controle_Remoto();
		
		// Ao abrir o menu, ele me mostra como está o aparelho que foi acessado(Exemplo: televisão)
		// ou seja, se está ligado, se está tocando ou se têm volume.
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
