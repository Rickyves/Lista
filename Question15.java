package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question15{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y;
	
		System.out.println("Digite a base e altura do ret�ngulo:");
		x=input.nextInt();
		y=input.nextInt();
		System.out.println("�rea do ret�ngulo:");
		System.out.println(x*y);
	}
}  