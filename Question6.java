package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question6{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float Deposito;
		double ValorFinal;
		System.out.println("Digite 	o valor do deposito:");
		Deposito=input.nextFloat();
		ValorFinal=Deposito*1.07;
		System.out.println("Valor final com juros de um mês:");
		System.out.println(ValorFinal);
	}
}  