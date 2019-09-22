package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question54{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y,media;
	
		System.out.println("Digite dois números:");
		x=input.nextFloat();
		y=input.nextFloat();
		media=x+y/2;
		if(media>=6) {
			System.out.println(media+" APROVADO");
		}
		else {
			System.out.println(media+" REPROVADO");
		}
	}
}  