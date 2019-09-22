package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question36{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y,z,maior,medio;
		maior=0;
		medio=0;
	
		System.out.println("Digite três números diferentes:");
		x=input.nextFloat();
		y=input.nextFloat();
		z=input.nextFloat();
		if(x>y && x>z) {
			maior=x;
			if(y>z) {
				medio=y;
			}
			else {
				medio=z;
			}
		}
		if(y>x && y>z) {
			maior=y;
			if(x>z) {
				medio=x;
			}
			else {
				medio=z;
			}
		}
		if(z>x && z>y) {
			maior=z;
			if(x>y) {
				medio=x;
			}
			else {
				medio=y;
			}
		}
		System.out.println(maior+medio);
	}
}  