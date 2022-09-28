/**
 * 
 * @authors Camila De Lima Tronco - RA: 00250537;
 *             Giovanni Tomaz Amorim - RA: 00263194;
 *             Karen Barbosa Da Silva - RA: 00250410;
 * 
 * Obs.: ! Jogo desenvolvido na IDE Eclipse! !
 */


package calculoMedia;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("====\t\tBem vindo(a) ao Medias Calculator\t====");
		System.out.println("============================================================");
		
		Scanner scan = new Scanner(System.in);
		MetodosCalculadora metodosCalc;
		float n1, n2, n3, n4;
		String numDigitado = "";
		
		System.out.print("Digite o valor da A1: ");
		numDigitado = scan.next();
		numDigitado = numDigitado.replace(",", ".");
		n1 = Float.parseFloat(numDigitado);
		
		System.out.print("Digite o valor da A2: ");
		numDigitado = scan.next();
		numDigitado = numDigitado.replace(",", ".");
		n2 = Float.parseFloat(numDigitado);
		
		System.out.print("Digite o valor da A3: ");
		numDigitado = scan.next();
		numDigitado = numDigitado.replace(",", ".");
		n3 = Float.parseFloat(numDigitado);
		
		System.out.print("O aluno realizou a atividade A4? (S/N) ");
		char participacaoN4 = scan.next().charAt(0);
		
		switch(participacaoN4) {
		case 's':
		case 'S':
			System.out.print("Digite o valor da A4: ");
			numDigitado = scan.next();
			numDigitado = numDigitado.replace(",", ".");
			n4 = Float.parseFloat(numDigitado);
			
			metodosCalc = new MetodosCalculadora(n1, n2, n3, n4);
			System.out.println(metodosCalc);
			break;
			
		case 'n':
		case 'N':
			metodosCalc = new MetodosCalculadora(n1, n2, n3);
			System.out.println(metodosCalc);
			break;
		}
		
		scan.close();

	}

}
