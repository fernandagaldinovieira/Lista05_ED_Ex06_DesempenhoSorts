package view;

import controller.Desempenho;

public class Principal {

	public static void main(String[] args) {
		int tamanho = 1500;
		int[] vetDes = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			vetDes[i] = (int)((Math.random() * 1500) + 1);
		}
		
		Desempenho desempenho = new Desempenho();
		desempenho.Ordenacao(vetDes);
	}
}
