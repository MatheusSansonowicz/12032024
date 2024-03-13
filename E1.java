package aula12032024;

import java.util.Scanner;

public class E1 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
}

}
