import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 boolean salir=false;
		Ciclo c1 = new Ciclo("Mecanizado" , "Informatica");
		Ciclo c2 = new Ciclo("Matematicas" , "Filosofia");
		Notas n1 = new Notas(1,"Sistemas",5.00);
		Notas n2 = new Notas(2,"Matematica",2.00);
		Notas n3 = new Notas(3,"Filosofia",10.00);
		Notas n4 = new Notas(4,"Cyber Seguridad",7.00);
		Alumno a1 = new Alumno("51625A", "Manuel", "11/02/2001", c1 , n1);
		Alumno a2 = new Alumno("12225B", "Miguel", "02/06/2001", c1 , n2);
		Alumno a3 = new Alumno("61834C", "Mufasa", "15/03/2001", c2 , n3);
		Alumno a4 = new Alumno("38125D", "Martin", "16/08/2001", c2 , n4);
		
		do {
			System.out.println("Elije una opcion");
			System.out.println("1. Ver notas de los alumnos");
			System.out.println("2. Ver notas de los modulos");
			System.out.println("3. Añadir notas");
			System.out.println("4. Salir");
			int opcion = sc.nextInt();
			switch(opcion){
				case 1:
					System.out.println("1: " + "<br>");
					a1.verNotaAlumno();
					a2.verNotaAlumno();
					a3.verNotaAlumno();
					a4.verNotaAlumno();
					break;
				case 2:
					System.out.println("2: " + "<br>");
					a1.verNotaModulo();
					a2.verNotaModulo();
					a3.verNotaModulo();
					a4.verNotaModulo();
					break;
				case 3:
					System.out.println("3:" + "<br>" );
					System.out.println("Nueva nota del Alumno 1");
					double nuevaNota=sc.nextDouble();
					a1.cambiarNota(nuevaNota);
					System.out.println("<br>" );
					
					System.out.println("Nueva nota del Alumno 2");
					double nuevaNota2=sc.nextDouble();
					a2.cambiarNota(nuevaNota);
					System.out.println("<br>" );
					
					System.out.println("Nueva nota del Alumno 3");
					double nuevaNota3=sc.nextDouble();
					a3.cambiarNota(nuevaNota);
					System.out.println("<br>" );
					
					System.out.println("Nueva nota del Alumno 4");
					double nuevaNota4=sc.nextDouble();
					a4.cambiarNota(nuevaNota);
					System.out.println("<br>" );
					break;
				case 4:
					salir=true;
					break;
				default:
					System.out.println("del 1 al 4");
			}
		}
		while(salir==false);
	}
}


