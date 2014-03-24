import java.util.Scanner;
public class sopa {

	public static void main(String[] args) 
	{
		Scanner mi_escaner = new Scanner (System.in);
		System.out.print("-------------------------Ficha Persona------------------");
		System.out.print("\n");
		System.out.print("\n Primera vez que esta llenando la ficha?  ");
		String popo=mi_escaner.next();
		System.out.print("\n");
		System.out.println("Nombre de Personaje  :");
		String nombre = mi_escaner.next();
		System.out.print("\n");
		System.out.println("Edad");
		int edad = mi_escaner.nextInt();
		System.out.print("\n");
		System.out.println("sexo   :");
		String sexo = mi_escaner.next();
		System.out.print("\n");
		System.out.println("Casado  :");
		boolean casado = mi_escaner.nextBoolean();
		System.out.println("Ficha personal");
		System.out.println("Su nombre: "+ nombre);
		System.out.println("Su edad: "+edad);
		System.out.println("Sexo: " +sexo);
		System.out.println("Casado: "+casado);
		System.out.print("\n--------------------------------------------------------");
	}
}	
	