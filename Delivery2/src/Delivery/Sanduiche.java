package Delivery;

public class Sanduiche extends Lanche {
	private final int tempoPreparo = 15;
	private String[] ingredientes;
	private double preco = 21.90;

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + tempoPreparo;
	}
	
	public double getPreco() {
		return preco;
	}

}
