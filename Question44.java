package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question44{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int morangos,ma�as,totalkg;
		double totalma�as,totalmorangos,totalcompra,percent;
			System.out.println("Digite a quantidade desejada de morangos em kg:");
			morangos=input.nextInt(); 
			System.out.println("Digite a quantidade desejada de morangos em kg:");
			ma�as=input.nextInt(); 
			if(morangos<=5)
			{
				totalmorangos=morangos*2.50;
			}
			else {
				totalmorangos=morangos*2.20;
			}
			if(ma�as<=5) {
				totalma�as=ma�as*1.80;
			}
			else {
				totalma�as=ma�as*1.50;
			}
			totalcompra=totalma�as+totalmorangos;
			totalkg=morangos+ma�as;
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
