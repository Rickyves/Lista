package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question5{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float r,d;
		System.out.println("Digite a quantidade em reais desejada para conversão:");
		r=input.nextFloat();
		System.out.println("Digite o valor do dolar:");
		d=input.nextFloat();
				System.out.println(r*d);
	}
}  