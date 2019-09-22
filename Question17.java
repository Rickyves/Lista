package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question17{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int brancos,nulos,validos,total;
		float Pbrancos,Pnulos,Pvalidos;
	
		System.out.println("Digite a idade em anos meses e dias:");
		total=input.nextInt();
		brancos=input.nextInt();
		nulos=input.nextInt();
		validos=input.nextInt();
		Pbrancos=brancos*100/total;
		Pnulos=nulos*100/total;
		Pvalidos=validos*100/total;
		System.out.println(Pbrancos);
		System.out.println(Pnulos);
		System.out.println(Pvalidos);
	}
}  