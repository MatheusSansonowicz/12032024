package aula12032024;

import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		/*for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite adicione um elemento ao vetor: ");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("O elemento de indice " +i +" e " +numeros[i]);
		}
		
		numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite adicione um elemento ao vetor: ");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("O elemento de indice " +i +" e " +numeros[i]);
		}
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		numeros = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite adicione um elemento ao vetor: ");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("O elemento de indice " +i +" e " +numeros[i]);
		}
		*/
		
		int [][] matriz = new int [3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o elemento [" +i +"] [ " +j + "] :");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int[] linha : matriz) {
			
			for(int elemento : linha) {
				
				System.out.println(elemento);
			}
		}
		
		/*for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}*/
		
	}
}
