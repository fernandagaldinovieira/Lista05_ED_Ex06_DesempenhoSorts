package controller;

import br.edu.fateczl.sorts.Sorts;

public class Desempenho {

	public Desempenho() {
		super();
	}
	
	public void Ordenacao(int[] vetor) {
		Sorts sorts = new Sorts();
		
		int inicio = 0;
		int fim = vetor.length - 1;
		
		double TempoInicial = System.nanoTime();
		sorts.bubbleSort(vetor);
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("Tempo Total para ordenação do vetor com Bubble Sort = " + TempoTotal + "s.");
		
		TempoInicial = System.nanoTime();
		sorts.mergeSort(vetor, inicio, fim);
		TempoFinal = System.nanoTime();
		TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("Tempo Total para ordenação do vetor com Merge Sort = " + TempoTotal + "s.");
		
		TempoInicial = System.nanoTime();
		sorts.quickSort(vetor, inicio, fim);
		TempoFinal = System.nanoTime();
		TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("Tempo Total para ordenação do vetor com Quick Sort = " + TempoTotal + "s.");
	}

}
