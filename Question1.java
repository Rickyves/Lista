package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question1{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y;
	
		System.out.println("Digite dois números:");
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}
}  