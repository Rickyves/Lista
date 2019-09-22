package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question9{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Double custo,Pvenda,ValorComImpostos;
		System.out.println("Digite 	o custo de fábrica:");
		custo=input.nextDouble();
		ValorComImpostos=custo*1.45;
		Pvenda=ValorComImpostos*1.28;
		System.out.println("Valor ao consumidor:");
		System.out.println(Pvenda);
	}
} 