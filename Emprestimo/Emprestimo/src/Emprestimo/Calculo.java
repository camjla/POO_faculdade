/**
 * s
 * @authors    Camila De Lima Tronco  - RA: 00250537;
 *             Giovanni Tomaz Amorim  - RA: 00263194;
 *             Karen Barbosa Da Silva - RA: 00250410;
 * 
 * Obs.: ! Programa desenvolvido na IDE Eclipse!!
 */

package Emprestimo;

public class Calculo {
	private double valor, tx_anual, tx_mensal;
	private int tempo, n;

	public Calculo(double valor, double tx_anual, int tempo) {
		this.valor = valor;
		this.tx_anual = tx_anual;
		this.tempo = tempo;
		this.tx_mensal = (tx_anual / 100) / 12;
		this.n = tempo * 12;
	}

	public double Parcela() {
		double prestacao = 0;
		if (tx_anual != 0) {
			prestacao = valor * (tx_mensal * Math.pow((1 + tx_mensal), n)) / (Math.pow((1 + tx_mensal), n) - 1);
		} else {
			prestacao = valor / n;
		}
		return prestacao;
	}
	
	
}
