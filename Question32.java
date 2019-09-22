package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question32{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Double 	Nconta,saldo,debito,credito,SaldoAtual;
		System.out.println("Digite 	número da sua conta:");
		Nconta=input.nextDouble();
		System.out.println("Digite o saldo:");
		saldo=input.nextDouble();
		System.out.println("Digite o débito:");
		debito=input.nextDouble();
		System.out.println("Digite o crédito:");
		credito=input.nextDouble();
		SaldoAtual=saldo-debito+credito;
		if(SaldoAtual<0) {
			System.out.println(Nconta);
			System.out.println("Negativado");
			System.out.println(SaldoAtual);
			
		}
		else {
			System.out.println(Nconta);
			System.out.println("Saldo Positivo");
			System.out.println(SaldoAtual);
			
		}
	}
}