package hornos;

public class Resistencia {
	
	private double potencia;
	private int minutos;
	
	public Resistencia() {
		minutos=0;
		potencia=1200;
	}
	
	public Resistencia(double potencia) {
		minutos=0;
		this.potencia=potencia;
	}
	
	public void funcionar(int minutos) {
		this.minutos=this.minutos+minutos;
	}
	
	public double devolverConsumo() {
		return potencia*minutos/60000;
	}
	
	public double getPotencia() {
		return potencia;
	}

}
