package exercicios;
import java.util.Scanner;
public class quadradodeA {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i< TAM; i++) {
		System.out.println("insira o "+(i+1)+" valor");
		a[i] = in.nextInt();
		b[i] = a[i]*a[i];
		}
		 for (i = 0; i < TAM; i++) {
	     System.out.println("O quadrado de " + a[i] + " é: " + b[i]);
	}
}
}
