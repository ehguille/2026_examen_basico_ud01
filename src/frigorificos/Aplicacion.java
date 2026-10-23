package frigorificos;

import java.util.Scanner;

/**
 * Clase principal: pide los datos del frigorífico al usuario
 * y ejecuta la secuencia del enunciado.
 */
public class Aplicacion {

	public Aplicacion() {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Introduce la marca de tu frigorífico:");
		String marca = s.nextLine();
		System.out.println("Introduce la potencia del compresor (W):");
		int potencia = s.nextInt();
		s.close();

		// 1. Crear los dos frigoríficos
		Frigorifico miFrigorifico = new Frigorifico(marca, potencia);
		Frigorifico bosch = new Frigorifico("Bosch");

		// 2. Operaciones sobre el frigorífico del usuario
		miFrigorifico.enfriar(3);
		miFrigorifico.abrirPuerta(3);
		miFrigorifico.enfriar();

		// 3. Operaciones sobre el Bosch
		bosch.abrirPuerta(10);
		bosch.enfriar(4);

		// 4. Imprimir los dos frigoríficos
		System.out.println(miFrigorifico);
		System.out.println(bosch);

		// 5. Recalibrar el Bosch e imprimirlo
		bosch.recalibrar();
		System.out.println(bosch);*/
		
	    Scanner teclado = new Scanner(System.in);
	    
        System.out.print("Marca del horno: ");
        String marca = teclado.nextLine();
        System.out.print("Potencia de la resistencia (W): ");
        int potencia = teclado.nextInt();
 
        Horno hornoUsuario = new Horno(marca, potencia);
        Horno hornoSiemens = new Horno("Siemens");
 
        hornoUsuario.calentar(4);
        hornoUsuario.abrirPuerta(2);
        hornoUsuario.calentar();
 
        hornoSiemens.calentar(6);
        hornoSiemens.abrirPuerta(2);
 
        System.out.println(hornoUsuario);
        System.out.println(hornoSiemens);
 
        hornoSiemens.reiniciar();
        System.out.println(hornoSiemens);
 
        teclado.close();
	}

/*	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
	}*/

}
