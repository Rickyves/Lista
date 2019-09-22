package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question39{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int gols1,gols2;	
		String nome1,nome2;
		System.out.println("Digite o nome do primeiro time:");
		nome1=input.next();
		System.out.println("Digite a quantidade de gols:");
		gols1=input.nextInt();
		System.out.println("Digite o nome do segundo time:");
		nome2=input.next();
		System.out.println("Digite a quantidade de gols:");
		gols2=input.nextInt();
	if(gols1>gols2) {
		System.out.println(nome1);
		System.out.println(gols1);
	}
	if(gols1==gols2) {
		System.out.println("Empate");
	}
	if(gols1<gols2) {
		System.out.println(nome2);
		System.out.println(gols2);
	}

	}
}  