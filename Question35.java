package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question35{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y,z,maior;
		maior=0;
	
		System.out.println("Digite três números diferentes:");
		x=input.nextFloat();
		y=input.nextFloat();
		z=input.nextFloat();
		if(x>y && x>z) {
			maior=x;
		}
		if(y>x && y>z) {
			maior=y;
		}
		if(z>x && z>y) {
			maior=z;
		}
		System.out.println(maior);
	}
}  