package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question40{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y;
	
		System.out.println("Digite dois n�meros diferentes:");
		x=input.nextInt();
		y=input.nextInt();
		if(x>y) {
		System.out.println("Primeiro � maior");
		}
		if(x==y) {
			System.out.println("N�meros iguais");
		}
		if(x<y) {
			System.out.println("Segundo � maior");
			}
	}
}  