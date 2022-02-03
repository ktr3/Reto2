

public class variante2 extends variante1{
	{
	    private String Genero;
	    public Alumno(String Genero, String identificacion, String nombre, String correo) {
	        super(identificacion, nombre, correo);
	        this.Genero = Genero;
	    }   
	    public String getGenero() {
	        return Genero;
	    }
	    public void setGenero(String Genero) {
	        this.Genero = Genero;
	    }
	    @Override
	    public String toString() {
	        return this.getNombre();
	    }  
	}
}
