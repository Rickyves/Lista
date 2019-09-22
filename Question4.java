package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question4{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float c,conv;
	
		System.out.println("Digite a temperatura em Celsius:");
		c=input.nextInt();
		conv=(9*c+160)/5;
				System.out.println(conv);
	}
}  