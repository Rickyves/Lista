package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question29{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float Horas,ValorPorHora,HoraExtra;
		double Total;
		System.out.println("Digite as horas trabalhadas:");
		Horas=input.nextFloat();
		System.out.println("Digite 	o valor por por hora");
		ValorPorHora=input.nextFloat();
		System.out.println("Digite 	as horas extras");
		HoraExtra=input.nextFloat();
		if(Horas>40) {
		Total=(Horas*ValorPorHora)+(HoraExtra*ValorPorHora*1.50);
		System.out.println(Total);
		}
		else {
			Total=(Horas*ValorPorHora);
			System.out.println(Total);
		}
	}
}  