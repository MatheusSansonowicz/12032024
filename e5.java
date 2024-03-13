package aula12032024;

import java.util.Scanner;

public class e5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[30];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0)
				System.out.println(i);
		}
		
		
}
}
