package exercicios;

import java.util. Scanner;

public class inversaoDiversao {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System. in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];

		
		
			for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			b[i] = a[i];
			}
			
			System.out.println("A =");
			for(i=0; i<TAM; i++) {
			System.out.print(a[i]+ " ");
			}
			
			System.out.println("\nB =");
			for(i=9; i>-1; i--) {
			System.out.print(b[i]+ " ");
			}
			in.close();
	}
}