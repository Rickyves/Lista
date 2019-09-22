package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question14{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int x;
	
		System.out.println("Digite um número:");
		x=input.nextInt();
		System.out.println(x-1);
		System.out.println(x);
		System.out.println(x+1);
	}
}  