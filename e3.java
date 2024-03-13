package aula12032024;

import java.util.Scanner;

public class e3 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorSoma = new int[20];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero para o vetor a: ");
			vetorA[i] = sc.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite um numero para o vetor b: ");
			vetorB[i] = sc.nextInt();
		}
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetorB[i] + vetorA[i];
			System.out.println("O resultado das somas das " +i +" posicoes eh: "+vetorSoma[i]);
		}
		
}

}