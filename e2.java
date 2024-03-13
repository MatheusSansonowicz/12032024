package aula12032024;

import java.util.Scanner;

public class e2 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int par = 0, impar = 0;
		
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2==0)
				par++;
			else
				impar++;
		}
		System.out.println("O total de pares eh: "+par);
		System.out.println("O total de impares eh: "+impar);
}

}
