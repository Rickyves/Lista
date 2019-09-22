package Lista;
import java.util.Scanner;
public class Question55{
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int codigo,senha;
		System.out.println("Digite o codigo:");
		codigo=input.nextInt();
		if(codigo==1234) {
			System.out.println("Digite a senha:");
			senha=input.nextInt();
			if(senha==9999) {
				System.out.println("Acesso Permitido");
			}
			else {
				System.out.println("Senha incorreta");
			}
		}
		else {
			System.out.println("Usuário invalido");
		}
	}
}  