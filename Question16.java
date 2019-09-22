package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question16{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int anos,meses,dias,idade;
	
		System.out.println("Digite a idade em anos meses e dias:");
		anos=input.nextInt();
		meses=input.nextInt();
		dias=input.nextInt();
		idade=(anos*365)+(meses*30)+dias;
		System.out.println(idade);
	}
}  