
public class Alumno {

	private String dni; 
	private String nombre; 
	private String fecha;
	Ciclo ciclo;
	Notas nota;
	
	
	public Alumno(String dni, String nombre, String fecha, Ciclo ciclo, Notas nota) {
		this.dni=dni;
		this.nombre=nombre;
		this.fecha=fecha;
		this.ciclo=ciclo;
		this.nota=nota;
		}
	
	public String toString() {
		return("DNI: " + dni + ", nombre : " + nombre + " , fecha de nacimiento: " + fecha + " , ciclo: " + ciclo + ", nota: " + nota);
	}

	
	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public Notas getNota() {
		return nota;
	}

	public void setNota(Notas nota) {
		this.nota = nota;
	}
	
	public void verNotaAlumno() {
		System.out.println("Alumno: " + nombre + " DNI: " + dni + "<br>" + "Nota: " + nota.getNota() + " .");
	}
	
	public void verNotaModulo() {
		System.out.println("Modulo: " + nota.getModulo() + " Nota: " + nota.getNota());
	}
	
	public void cambiarNota(double cambiaNota) {
		nota.setNota(cambiaNota);
		System.out.println("La actual nota del alumno: " + nombre + " DNI :" + dni + "es : " + nota.getNota());
	}
	
	
	
}
