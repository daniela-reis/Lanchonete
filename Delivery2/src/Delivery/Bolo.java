package Delivery;

public class Bolo extends Lanche {
	private final int tempoPreparo = 10;
	private String massa;
	private String recheio;
	private String cobertura;
	
	public void setBolo(String massa, String recheio, String cobertura) {
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + tempoPreparo;
	}

}
