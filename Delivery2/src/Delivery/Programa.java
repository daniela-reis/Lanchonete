package Delivery;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Bem vindo(a) ao delivery\n\n");
		System.out.println("Selecione o seu lanche");
		System.out.println("[1] Sanduiche [2] Massa [3] Bolo");
		
		opcao = teclado.nextInt();
		
		while (opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Op��o inv�lida, por favor tente novamente\n\n");
			System.out.println("Selecione o seu lanche");
			System.out.println("[1] Sanduiche [2] Massa [3] Bolo");
			opcao = teclado.nextInt(); 
		}
		
		if(opcao == 1) {
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
		}
		
		if(opcao == 2) {
			lanche = new Massa();
			menuMassa((Massa) lanche);
		}
		
		if(opcao == 3) {
			lanche = new Bolo();
			menuBolo((Bolo) lanche);
		}
	}
	
	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String [10];
		String ingrediente = "";
		double preco = 21.90;
		int i = 0;
		int distancia;		
		
		System.out.println("Voc� selecionou a op��o sandu�che");
		
		System.out.println("Escolha os ingredientes desejados. Digite 0 para finalizar a sele��o");
		
		
		while(i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe a sua dist�ncia (km): ");
		distancia = teclado.nextInt();
		lanche.setPreco(preco);
		System.out.println("O valor do seu pedido � de: " + preco + " E o tempo estimado de entrega � de: " + lanche.calculaTempo(distancia) + " minutos");
		
	}
	
	public static void menuMassa(Massa lanche) {		
		String massa = "";
		String molho = "";
		int escolhaMassa;
		int escolhaMolho;
		int distancia;
		double preco = 25.50;
		
		System.out.println("Voc� selecionou a op��o massa");
		System.out.println("Selecione [1] Macarr�o [2] Pizza [3] Lasanha");
		
		
		escolhaMassa = teclado.nextInt();
		
		while (escolhaMassa != 1 && escolhaMassa != 2 && escolhaMassa != 3) {
			System.out.println("Op��o inv�lida, por favor tente novamente\n\n");
			System.out.println("Selecione a op��o de massa");
			System.out.println("[1] Macarr�o [2] Pizza [3] Lasanha");
			escolhaMassa = teclado.nextInt(); 
		}
		
		if(escolhaMassa == 1) {
			massa = "Macarr�o";
		}
		
		if(escolhaMassa == 2) {
			massa = "Pizza";
		}
		
		if(escolhaMassa == 3) {
			massa = "Lasanha";
		}	
				
		System.out.println("Escolha o molho desejado [1] Vermelho [2] Bolonhesa [3] Bechamel [4] Alfredo");
		
		escolhaMolho = teclado.nextInt();
		
		while (escolhaMolho != 1 && escolhaMolho != 2 && escolhaMolho != 3 && escolhaMolho != 4) {
			System.out.println("Op��o inv�lida, por favor tente novamente\n\n");
			System.out.println("Selecione a op��o de molho");
			System.out.println("[1] Vermelho [2] Bolonhesa [3] Bechamel [4] Alfredo");
			escolhaMolho = teclado.nextInt(); 
		}
		
		if(escolhaMolho == 1) {
			molho = "Vermelho";
		}
		
		if(escolhaMolho == 2) {
			molho = "Bolonhesa";
		}
		
		if(escolhaMassa == 3) {
			molho = "Bechamel";
		}
		
		if(escolhaMassa == 4) {
			molho = "Alfredo";
		}
		
		lanche.setMassa(massa, molho);
		System.out.println("Informe a sua dist�ncia (km): ");
		distancia = teclado.nextInt();
		lanche.setPreco(preco);
		System.out.println("O valor do seu pedido � de: " + preco + " E o tempo estimado de entrega � de: "  + lanche.calculaTempo(distancia) + " minutos");
				
		
	}
	
	public static void menuBolo(Bolo lanche) {
		
		String massa = "";
		String recheio = "";
		String cobertura = "";
		int escolhaMassa;
		int escolhaRecheio;
		int escolhaCobertura;
		int distancia;
		double preco = 30.50;
		
		
		System.out.println("Voc� selecionou a op��o Bolo");
		System.out.println("Selecione [1] Cenoura [2] Chocolate [3] Laranja [4] Fub�");
		
		escolhaMassa = teclado.nextInt();
		
		while (escolhaMassa != 1 && escolhaMassa != 2 && escolhaMassa != 3 && escolhaMassa != 4) {
			System.out.println("Op��o inv�lida, por favor tente novamente\n\n");
			System.out.println("Selecione a op��o de massa");
			System.out.println("[1] Cenoura [2] Chocolate [3] Laranja [4] Fub�");
			escolhaMassa = teclado.nextInt(); 
		}
		
		if(escolhaMassa == 1) {
			massa = "Cenoura";
		}
		
		if(escolhaMassa == 2) {
			massa = "Chocolate";
		}
		
		if(escolhaMassa == 3) {
			massa = "Laranja";
		}
		
		if(escolhaMassa == 4) {
			massa = "Fub�";
		}
				
		System.out.println("Escolha o recheio desejado [1] Brigadeiro [2] Prest�gio [3] Doce de Leite [4] Goiabada");
		
		escolhaRecheio = teclado.nextInt();
		
		while (escolhaRecheio != 1 && escolhaRecheio != 2 && escolhaRecheio != 3 && escolhaRecheio != 4) {
			System.out.println("Op��o inv�lida, por favor tente novamente\n\n");
			System.out.println("Selecione a op��o de recheio");
			System.out.println("[1] Brigadeiro [2] Prest�gio [3] Doce de Leite [4] Goiabada");
			escolhaRecheio = teclado.nextInt(); 
		}
		
		if(escolhaRecheio == 1) {
			recheio = "Brigadeiro";
		}
		
		if(escolhaRecheio == 2) {
			recheio = "Prest�gio";
		}
		
		if(escolhaRecheio == 3) {
			recheio = "Doce de Leite";
		}
		
		if(escolhaRecheio == 4) {
			recheio = "Goiabada";
		}
		
System.out.println("Escolha a cobertura desejada [1] Brigadeiro [2] Ganache [3] Doce de Leite [4] Goiabada");
		
		escolhaCobertura = teclado.nextInt();
		
		while (escolhaCobertura != 1 && escolhaCobertura != 2 && escolhaCobertura != 3 && escolhaCobertura != 4) {
			System.out.println("Op��o inv�lida, por favor tente novamente\n\n");
			System.out.println("Selecione a op��o de recheio");
			System.out.println("[1] Brigadeiro [2] Ganache [3] Doce de Leite [4] Goiabada");
			escolhaCobertura = teclado.nextInt(); 
		}
		
		if(escolhaCobertura == 1) {
			recheio = "Brigadeiro";
		}
		
		if(escolhaCobertura == 2) {
			recheio = "Ganache";
		}
		
		if(escolhaCobertura == 3) {
			recheio = "Doce de Leite";
		}
		
		if(escolhaCobertura == 4) {
			recheio = "Goiabada";
		}
		
		lanche.setBolo(massa, recheio, cobertura);
		System.out.println("Informe a sua dist�ncia (km): ");
		distancia = teclado.nextInt();
		lanche.setPreco(preco);
		System.out.println("O valor do seu pedido � de: " + preco + " E o tempo estimado de entrega � de: " + lanche.calculaTempo(distancia) + " minutos");
		
				
	}

}
