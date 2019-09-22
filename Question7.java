package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question7{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float compra;
		System.out.println("Digite 	o valor da compra:");
		compra=input.nextFloat();
		System.out.println("Valor das prestações divididas em 5 vezes serão:");
		System.out.println(compra/5);
	}
}  