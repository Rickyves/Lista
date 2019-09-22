package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question23{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int x;
		double ValorTotal;
	
		System.out.println("Digite a quantidade de maçãs");
		x=input.nextInt();
		if(x<12) {
			ValorTotal=x*1.30;
		}
		else {
			ValorTotal=x*1.00;
		}
		System.out.println(ValorTotal);
	}
}  