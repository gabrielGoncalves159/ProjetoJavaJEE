package Modelo;

import java.util.ArrayList;
import Modelo.Carro;
import Visualizacao.EntradaSaida;

public class Fabrica {

	public static void venderCarro() {

	}

	public static void fabricarCarro() {
		
		int qtdeCarros = EntradaSaida.solicitaQtdeCarros();
		
		ArrayList<Carro> carrosFabricados = new ArrayList<Carro>();
		
		for(int i=0; i<qtdeCarros; i++) {
			Carro carro = new Carro();
			carro.setModelo(null);
			carro.setMarca(null);
			carro.setCor(null);
			carro.setAno(0);
			carrosFabricados.add(carro);
			
			System.out.println("Marca: " + carro.getMarca() + "\n");
			System.out.println("Modelo: " + carro.getModelo() + "\n");
			System.out.println("Modelo: " + carro.getCor() + "\n");
			System.out.println("Modelo: " + carro.getAno() + "\n");
		}
	}
}
