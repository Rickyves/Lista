package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question48{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int codigo,nascimento,AnoIngresso,TempoTrabalho,IdadeEmpregado;

		System.out.println("Digite o código do empregado::");
		codigo=input.nextInt(); 
		System.out.println("Digite o ano de nascimento:");
		nascimento=input.nextInt(); 
		System.out.println("Digite o ano de ingresso:");
		AnoIngresso=input.nextInt(); 
		IdadeEmpregado=2019-nascimento;
		TempoTrabalho=2019-AnoIngresso;
				if(IdadeEmpregado>=65 || TempoTrabalho>=30) {
					System.out.println(codigo);
					System.out.println(IdadeEmpregado);
					System.out.println(TempoTrabalho);
					System.out.println(IdadeEmpregado);
					System.out.println("Requerer Aposentadoria");
				}
				else {
					System.out.println(" Não Requerer");
				}
		if(IdadeEmpregado>=60 && TempoTrabalho>=25) {
			System.out.println(codigo);
			System.out.println(IdadeEmpregado);
			System.out.println(TempoTrabalho);
			System.out.println(IdadeEmpregado);
			System.out.println("Requerer Aposentadoria");
		}
		else {
			System.out.println(" Não Requerer");
		}
	}
} 
