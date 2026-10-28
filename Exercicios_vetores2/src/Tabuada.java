import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System. in);
		final int N=5;
		final int MULTI =11;
		int a[],b[], i, m;
		
		a = new int [N];
		b = new int [MULTI];
		
		for(i=0; i<N; i++) {
			System.out.println("Insira o "+(i+1)+ "o valor");
			a[i] = ler.nextInt();

			for(m=1; m<MULTI; m++) {
				b[m] = a[i]*m;
				System.out.println(a[i]+" x "+m+" = "+b[m]);
				
			}
			System.out.println();
		}
		
		
	}

}
