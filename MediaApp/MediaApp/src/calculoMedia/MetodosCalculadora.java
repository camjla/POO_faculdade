package calculoMedia;

public class MetodosCalculadora {
	private float nota1 = 0f;
	private float nota2 = 0f;
	private float nota3 = 0f;
	private float nota4 = 0f;
	private final float MEDIA = 6;
	
	public MetodosCalculadora(float n1, float n2, float n3, float n4) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		this.nota4 = n4;
	}
	
	public MetodosCalculadora(float n1, float n2, float n3) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
	}
	
	public float media() {
		return ((this.nota1 + this.nota2 + this.nota3) / 3f) < MEDIA && (this.nota1 < this.nota4 || this.nota2 < this.nota4 || this.nota3 < this.nota4) ?
				(this.nota1 + this.nota2 + this.nota3 + this.nota4 - menor()) / 3f:
				(this.nota1 + this.nota2 + this.nota3) / 3f;
	}
	
	public float menor() {
		
		return this.nota1 < this.nota2 ? 
					this.nota1 < this.nota3 ? this.nota1 : this.nota3 :
					this.nota2 < this.nota3 ? this.nota2 : this.nota3;
	}
	
	public String statusAluno() {
		return media() >= MEDIA ? "Aprovado" : "Reprovado";
	}
	
	@Override
	public String toString() {
		float apresenta1 = this.nota1, apresenta2 = this.nota2, apresenta3 = this.nota3;
		
		if(statusAluno() == "Reprovado" && this.nota1 == menor() && this.nota1 < this.nota4) {
			apresenta1 = this.nota4;
		} else if(statusAluno() == "Reprovado" && this.nota2 == menor() && this.nota2 < this.nota4) {
			apresenta2 = this.nota4;
		} else if (statusAluno() == "Reprovado" && this.nota3 == menor() && this.nota3 < this.nota4){
			apresenta3 = this.nota4;
		}
		
		return "\nNotas Obtidas:\t" + String.format("%.2f", this.nota1) + " - " + String.format("%.2f",this.nota2) + " - "+ String.format("%.2f",this.nota3) + " - " + String.format("%.2f",this.nota4) 
				+ "\nNotas usadas: " +  String.format("%.2f",apresenta1) + " - " + String.format("%.2f",apresenta2) + " - " + String.format("%.2f",apresenta3)
				+ "\nMédia do(a) aluno(a):\t" + String.format("%.2f", media())
				+ "\nSituação:\t"+ statusAluno();
	}
}
