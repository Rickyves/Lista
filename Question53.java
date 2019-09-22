package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question53{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		double percent=0,litros = 0,preco=0;
		char Combustivel;
		System.out.println("Digite qual tipo de combustível deseja:");
		Combustivel=input.next().charAt(0);
		if(Combustivel=='A') {
			System.out.println("Digite a quantidade em livros:");
			litros=input.nextInt();
			if(litros<=20) {
				percent=2.90*0.03;
				percent=2.90-percent;
				preco=(litros*percent);
				System.out.println(preco);
			}
			else {
				percent=2.90*0.05;
				percent=2.90-percent;
				preco=(litros*percent);
				System.out.println(preco);
			}
		}
		else {
			System.out.println("Digite a quantidade em litros:");
			litros=input.nextInt();
			if(litros<=20) {
				percent=3.30*0.04;
				percent=3.30-percent;
				preco=(litros*percent);
				System.out.println(preco);
			}
			else {
				percent=3.30*0.06;
				percent=3.30-percent;
				preco=(litros*percent);
				System.out.println(preco);
			}
		}
	}
} 
