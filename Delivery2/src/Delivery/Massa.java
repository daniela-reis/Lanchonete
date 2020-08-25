package Delivery;

public class Massa extends Lanche {
	private final int tempoPreparo = 30;
	private String molho;
	private String massa;
	
	public void setMassa(String massa, String molho) {
		this.massa = massa;
		this.molho = molho;
	}
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + tempoPreparo;
	}
}
