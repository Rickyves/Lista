package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question20{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Double CarrosVendidos,VendasTotal,SalarioFixo,ValorPorCarro,SalarioTotal,percent;
		System.out.println("Digite 	o salaro fixo:");
		SalarioFixo=input.nextDouble();
		System.out.println("Digite 	a quantidade de carros vendidos:");
		CarrosVendidos=input.nextDouble();
		System.out.println("Digite 	o valor por carro:");
		ValorPorCarro=input.nextDouble();
		ValorPorCarro=ValorPorCarro*CarrosVendidos;
		System.out.println("Digite 	o total de vendas:");
		VendasTotal=input.nextDouble();
		percent=VendasTotal*0.05;
		SalarioTotal=SalarioFixo+ValorPorCarro+percent;
		System.out.println(SalarioTotal);
	}
} 