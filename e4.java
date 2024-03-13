package aula12032024;

import java.util.Scanner;

public class e4 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println("Os pares são: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2==0)
				System.out.println(numeros[i]);
		}
		System.out.println();
		
		System.out.println("Os impares são: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2!=0)
				System.out.println(numeros[i]);
		}
		
}

}
