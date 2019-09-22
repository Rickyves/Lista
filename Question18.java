package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question18{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float salario,reajuste,percent;
		System.out.println("Digite 	o salário:");
		salario=input.nextFloat();
		System.out.println("Digite 	o percentual do reajuste:");
		percent=input.nextFloat();
		reajuste=(salario*percent/100)+salario;
		System.out.println(reajuste);
	}
} 