package hornos;

import java.util.Scanner;

public class Principal {
	
	public Principal() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Marca?");
		String marca=s.nextLine();
		System.out.println("Potencia?");
		int potencia=s.nextInt();
		
		Horno h1=new Horno(marca,potencia);
		Horno h2=new Horno("Siemens");
		
		h1.calentar(4);
		h1.abrirPuerta(2);
		h1.calentar();
		
		h2.calentar(6);
		h2.abrirPuerta(2);
		
		System.out.println(h1);
		System.out.println(h2);
		
		h2.reiniciarse();
		System.out.println(h2);
	}
	
	public static void main(String[] args ) {
		Principal p=new Principal();
	}

}
