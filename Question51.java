package Lista;

import java.util.Scanner;

public class Question51 {
	private static Scanner input;
	    public static void main(String[] args) {
	        int num1,num2;
	        System.out.println("Digite dois numeros:");
			num1=input.nextInt(); 
			num2=input.nextInt(); 
			if(num2==0) {
				while (num2==0) {
					System.out.println("Digite um número diferente de 0");
					num2=input.nextInt(); 
			}
			}
	            System.out.println(num1/num2);
	    
	    }
	} 