package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question37{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float x,y,z,maior,medio,menor;
		maior=0;
		medio=0;
		menor=0;
	
		System.out.println("Digite três números diferentes:");
		x=input.nextFloat();
		y=input.nextFloat();
		z=input.nextFloat();
		if(x>y && x>z) {
			maior=x;
			if(y>z) {
				medio=y;
				menor=z;
			}
			else {
				medio=z;
				menor=y;
			}
		}
		if(y>x && y>z) {
			maior=y;
			if(x>z) {
				medio=x;
				menor=z;
			}
			else {
				medio=z;
				menor=x;
			}
		}
		if(z>x && z>y) {
			maior=z;
			if(x>y) {
				medio=x;
				menor=y;
			}
			else {
				medio=y;
				menor=x;
			}
		}
		System.out.println(menor);
		System.out.println(medio);
		System.out.println(maior);
	}
}  