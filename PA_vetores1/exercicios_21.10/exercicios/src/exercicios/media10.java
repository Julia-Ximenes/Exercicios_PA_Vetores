package exercicios;

import java.util. Scanner;

public class media10 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System. in);
		final int TAM=10;
		int a[], atu = 0, i;
		float media, soma = 0;
		a = new int [TAM];
		
		
			for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			atu = a[i];
			soma = (soma+atu);
			}
			media = soma/TAM;
		System.out.println("a soma �: "+soma);
		System.out.println("a m�dia �: "+media);
		}

	}
