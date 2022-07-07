
package Exemplos_Encapsulamento;

public class Controle_Remoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Métodos especiais

	public Controle_Remoto() {

		this.volume = 50;
		this.ligado = true;
		this.tocando = true;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// Métodos abstratos

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0);
	}

	@Override
	public void abrirMenu() {

		System.out.println("Esta ligado ? " + this.getLigado());
		System.out.println("Esta tocando ? " + this.getTocando());
		System.out.print("Volume " + this.getVolume());
		for (int i = 1; i <= getVolume(); i += 10) {

			System.out.print(" º ");

		}

	}

	@Override
	public void fecharmenu() {
		System.out.println("Fechando o Menu...");

	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			setVolume(getVolume() + 5);

		} else {

			System.out.println("Impossível aumentar a TV,pois esta desligada");
		}

	}

	@Override
	public void menosVolume() {

		if (this.getLigado() == true) {

			setVolume(getVolume() - 5);

		} else {

			System.out.println("Impossível aumentar a TV,pois esta desligada");
		}

	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() == true && this.getVolume() > 0) {

			this.setVolume(0);

		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);

		}

	}

	@Override
	public void play() {

		if (this.getLigado() == true && this.getTocando() == false) {

			this.setTocando(true);

		}
	}

	@Override
	public void pause() {
		if (this.getLigado() == true && this.getTocando() == true) {

			this.setTocando(false);

		}

	}

}
