
public class Notas {

	private int evaluacion;
	private String modulo;
	private double nota;
	
	public Notas(int eva, String mod, double nota) {
		this.evaluacion=eva;
		this.modulo=mod;
		this.nota=nota;	
	}
	
	public String toString() {
		return "La nota es : " + nota + " de la evaliacion " + evaluacion + " en el modulo" +  modulo;
	}
	
	public String getModulo() {
		return modulo;
	}
	
	public void setModulo(String modulo) {
		this.modulo=modulo;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
