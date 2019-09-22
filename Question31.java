package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question31{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Double VendasTotal,SalarioFixo,Total,percent;
		System.out.println("Digite 	o salaro fixo:");
		SalarioFixo=input.nextDouble();
		System.out.println("Digite 	a quantidade total de vendas:");
		VendasTotal=input.nextDouble();
		if(VendasTotal<=1500) {
			percent=VendasTotal*0.03;
			Total=percent+SalarioFixo;
			System.out.println(Total);
		}
		else {
			percent=VendasTotal*0.05;
			Total=percent+SalarioFixo;	
			System.out.println(Total);
		}
	}
}