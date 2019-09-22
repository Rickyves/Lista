package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question34{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x;
		System.out.println("Digite um número:");
		x=input.nextFloat();
		if(x<0) {
			System.out.println("Negativo");
		}
		if(x==0) {
			System.out.println("Zero");
		}
		if(x>0) {
			System.out.println("Positivo");
		}
	}
}