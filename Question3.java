package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question3{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float salario,vendas;
		double SalarioFinal;
		String nome;
		System.out.println("Digite 	o seu nome:");
		nome=input.next();
		System.out.println("Digite 	o seu salaro fixo:");
		salario=input.nextFloat();
		System.out.println("Digite 	o seu total de vendas efetuadas:");
		vendas=input.nextFloat();
		System.out.println(nome);
		System.out.println(salario);
		SalarioFinal=salario+vendas*0.15;
		System.out.println(SalarioFinal);
	}
}  