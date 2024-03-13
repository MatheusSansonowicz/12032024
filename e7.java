package aula12032024;

import java.util.Scanner;

public class e7 {
	
public static void main(String[] args) {
	
	//7 - Escreva um programa Java que use uma matriz para armazenar as
	//notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina.
	
		
		Scanner sc = new Scanner(System.in);
		
		int[][] notas = new int[4] [3];
		

		
		for (int j =0; j < notas.length; j++) {
			
			int menor = 9999, maior = -9999;
			for (int i = 0; i < notas[i].length; i++) {
				System.out.println("Digite a nota do aluno " +i +" na materia " +j +" : ");
				notas[j][i] = sc.nextInt();
				if (menor > notas[j][i])
					menor = notas[j][i];
				if (maior < notas[j][i])
					maior = notas[j][i];
		}		
		System.out.println("Menor nota na matéria " +j +" : "+menor);
		System.out.println("Maior nota na matéroa " +j +" : "+maior);
		}
}

}