package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question15{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y;
	
		System.out.println("Digite a base e altura do retângulo:");
		x=input.nextInt();
		y=input.nextInt();
		System.out.println("Área do retângulo:");
		System.out.println(x*y);
	}
}  