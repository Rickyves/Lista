package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question8{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float custo,Pvenda,percent;
		System.out.println("Digite 	o custo do produto:");
		custo=input.nextFloat();
		System.out.println("Digite 	o percentual para venda:");
		percent=input.nextFloat();
		Pvenda=(custo*percent/100)+custo;
		System.out.println(Pvenda);
	}
}  