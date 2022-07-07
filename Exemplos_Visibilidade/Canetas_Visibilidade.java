package Exemplos_Visibilidade;

public class Canetas_Visibilidade {

	
	public  String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada  ;
	
	
		
	public Canetas_Visibilidade(String modelo, String cor, float ponta, int carga, boolean tampada) {
		
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
public Canetas_Visibilidade() {
		
		this.tampar();
		this.cor = "Azul";
	}
	
	
	

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public void rabiscar() {
		if(tampada == true) {
			
			System.out.println("Erro caneta tampada, por isso n�o � poss�vel rabiscar");
		}else if(tampada == false) {
			
			System.out.println("Come�ando a rabiscar");
		}
		
	}

  

  public void escrever() {
	  if(tampada == true) {
			
			System.out.println("Erro caneta esta tampada, por isso n�o � poss�vel escrever");
		}else if(tampada == false) {
			
			System.out.println("Come�ando a a escrever");
		}
		
	}
/* Esse m�todo a baixo n�o � necess�rio quando se tem os atributos tampada  definido como protected ou private
  
  private void destamparar() {
		tampada = false;
		
	}
  */
private void tampar() {
	  
	  tampada = true;
  }
  
  
@Override
public String toString() {
	return "Canetas [modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada="
			+ tampada + "]";
}

  public void imprimir() {
 
System.out.println("Caneta : " + this.getModelo() + "\nCor :" + this.cor + "\nPonta : " + this.getPonta() + "\nCarga :" + carga + 
		"\nEsta tampada ? " + this.tampada);

	  }
	
	
}
