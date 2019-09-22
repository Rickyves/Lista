package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question10{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y,z;
	
		System.out.println("Digite dois números:");
		x=input.nextInt();
		y=input.nextInt();
		z=x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);
	}
}  