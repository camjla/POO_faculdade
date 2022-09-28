/**
 * s
 * @authors    Camila De Lima Tronco  - RA: 00250537;
 *             Giovanni Tomaz Amorim  - RA: 00263194;
 *             Karen Barbosa Da Silva - RA: 00250410;
 * 
 * Obs.: ! Programa desenvolvido na IDE Eclipse!!
 */

package Emprestimo;

import java.lang.Math;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Calculadora de empréstimo\n\n\n");

		System.out.print("Preencha o valor do empréstimo: ");
		double valor = input.nextDouble();
		System.out.print("Preencha a taxa anual dos juros: ");
		double tx_anual = input.nextDouble();
		System.out.print("Preencha em quantos anos irá pagar as prestações: ");
		int tempo = input.nextInt();

		Calculo calculo = new Calculo(valor, tx_anual, tempo);

		double prestacao = calculo.Parcela();
		System.out.print("Resultado: " + prestacao);

	}

}
