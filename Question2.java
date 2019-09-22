package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question2{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y;
	
		System.out.println("Digite a distância total percorrida:");
		x=input.nextInt();
		System.out.println("Digite o total de combustivel gasto:");
		y=input.nextInt();
		System.out.println(x/y);
	}
}  