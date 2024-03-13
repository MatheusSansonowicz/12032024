package aula12032024;

import java.util.Scanner;

public class e6 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int menor = 9999, maior = -9999;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if (menor > numeros[i])
				menor = numeros[i];
			if (maior < numeros[i])
				maior = numeros[i];
		}		
		System.out.println("Menor: "+menor);
		System.out.println("Maior: "+maior);
}

}