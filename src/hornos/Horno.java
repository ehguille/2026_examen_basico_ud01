package hornos;

public class Horno {
	
	private String marca;
	private int temperatura;
	private Resistencia resistencia;
	
	public Horno(String marca) {
		this.marca=marca;
		temperatura=20;
		resistencia=new Resistencia();
	}
	
	public Horno(String marca, int potencia) {
		this.marca=marca;
		temperatura=20;
		resistencia=new Resistencia(potencia);
	}
	
	public void calentar() {
		temperatura=temperatura+10;
		resistencia.funcionar(5);
	}
	
	public void calentar(int numeroVeces) {
		temperatura=temperatura+10*numeroVeces;
		resistencia.funcionar(5*numeroVeces);
	}
	
	public void abrirPuerta(int minutos) {
		temperatura=temperatura-15*minutos;
	}
	
	public void reiniciarse() {
		temperatura=20;
	}
	
	public String toString() {
		return marca+" - "+temperatura+" grados - resistencia de "+resistencia.getPotencia()+"W - consumo de "+resistencia.devolverConsumo()+" kwh.";
	}

}
