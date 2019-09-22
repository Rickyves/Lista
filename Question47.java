package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question47{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		double quantidade,preco,percent,total;
		String produto;
		System.out.println("Digite o nome do produto:");
		produto=input.next(); 
			System.out.println("Digite a quantidade adiquirida do produto:");
			quantidade=input.nextInt(); 
			System.out.println("Digite o preço por unidade:");
			preco=input.nextInt(); 
			total=quantidade*preco;
			if(quantidade<=5) {
				percent=total*0.02;
				total=total-percent;
				System.out.println(produto);
				System.out.println(total);
			}
			if(quantidade>5||quantidade<=10) {
				percent=total*0.03;
				total=total-percent;
				System.out.println(produto);
				System.out.println(total);
			}
			if(quantidade>10) {
				percent=total*0.05;
				total=total-percent;
				System.out.println(produto);
				System.out.println(total);
			}
	}
} 
