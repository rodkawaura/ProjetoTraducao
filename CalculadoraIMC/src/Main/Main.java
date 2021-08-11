package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite sua altura em m: ");
		Double altura = read.nextDouble();
		
		System.out.print("Digite seu peso em kg: ");
		Double peso = read.nextDouble();
		
		Double imc = peso/(altura*altura);
		System.out.print("seu IMC é: "+ imc);
				
	}

}
