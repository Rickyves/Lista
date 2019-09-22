package Lista;
//This is my first program using the java language
import java.util.Scanner;
public class Question43{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int m1,m2,h1,h2,MuMaior,MuMenor,HoMaior,HoMenor;
	
		System.out.println("Digite a idade de duas mulheres");
		m1=input.nextInt();
		m2=input.nextInt();
		System.out.println("Digite a idade de dois homens");
		h1=input.nextInt();
		h2=input.nextInt();
		if(m1>m2) {
			MuMaior=m1;
			MuMenor=m2;
			}
			else {
				MuMaior=m2;
				MuMenor=m1;
			}
	if(h1>h2) {
		HoMaior=h1;
		HoMenor=h2;
		}
		else {
			HoMaior=h2;
			HoMenor=h1;
		}
	System.out.println(HoMaior+MuMenor);
	System.out.println(HoMenor+MuMaior);
	}
	}