package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question26{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y;
	
		System.out.println("Digite dois números diferentes:");
		x=input.nextInt();
		y=input.nextInt();
		if(x>y) {
		System.out.println(x);
		}
		else {
			System.out.println(y);
		}
	}
}  