package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question44{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int morangos,maças,totalkg;
		double totalmaças,totalmorangos,totalcompra,percent;
			System.out.println("Digite a quantidade desejada de morangos em kg:");
			morangos=input.nextInt(); 
			System.out.println("Digite a quantidade desejada de morangos em kg:");
			maças=input.nextInt(); 
			if(morangos<=5)
			{
				totalmorangos=morangos*2.50;
			}
			else {
				totalmorangos=morangos*2.20;
			}
			if(maças<=5) {
				totalmaças=maças*1.80;
			}
			else {
				totalmaças=maças*1.50;
			}
			totalcompra=totalmaças+totalmorangos;
			totalkg=morangos+maças;
			if(totalcompra>25.00 || totalkg>8) {
				percent=totalcompra*0.10;
				totalcompra=totalcompra-percent;
				System.out.println(totalcompra);
		}
			else {
				System.out.println(totalcompra);
			}
	}
} 
