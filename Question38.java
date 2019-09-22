package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question38{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y,z;	
		System.out.println("Digite três números diferentes:");
		x=input.nextFloat();
		y=input.nextFloat();
		z=input.nextFloat();
		if(x+y<z && x+z<y && z+y<x) {
	
	
			System.out.println("Triangulo");
				
		}
		else {
			System.out.println("Não triangulo");
		}

	}
}  