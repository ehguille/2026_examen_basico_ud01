package frigorificos;

/**
 * Frigorífico con una marca, una temperatura y su propio compresor.
 * El usuario solo se comunica con el frigorífico; este se comunica
 * con el compresor.
 */
public class Frigorifico {

	private String marca;
	private int temperatura;
	private Compresor compresor;

	/**
	 * Crea un frigorífico con un compresor por defecto (150 W).
	 * @param marca marca del frigorífico
	 */
	public Frigorifico(String marca) {
		this.marca = marca;
		temperatura = 5;
		compresor = new Compresor();
		System.out.println("Se crea un frigorífico " + marca + " a " + temperatura + " grados.");
	}

	/**
	 * Crea un frigorífico con un compresor de la potencia indicada.
	 * @param marca marca del frigorífico
	 * @param potencia potencia del compresor en vatios
	 */
	public Frigorifico(String marca, int potencia) {
		this.marca = marca;
		temperatura = 5;
		compresor = new Compresor(potencia);
		System.out.println("Se crea un frigorífico " + marca + " a " + temperatura + " grados.");
	}

	/**
	 * Baja la temperatura 1 grado; el compresor funciona 1 hora.
	 */
	public void enfriar() {
		temperatura = temperatura - 1;
		compresor.funcionar(1);
		System.out.println(marca + " enfría 1 grado. Temperatura: " + temperatura + " grados.");
	}

	/**
	 * Baja la temperatura los grados indicados; el compresor funciona
	 * una hora por cada grado.
	 * @param grados grados que baja la temperatura
	 */
	public void enfriar(int grados) {
		temperatura = temperatura - grados;
		compresor.funcionar(grados);
		System.out.println(marca + " enfría " + grados + " grados. Temperatura: " + temperatura + " grados.");
	}

	/**
	 * Abre la puerta: la temperatura sube 1 grado por minuto.
	 * @param minutos minutos con la puerta abierta
	 */
	public void abrirPuerta(int minutos) {
		temperatura = temperatura + minutos;
		System.out.println(marca + " tiene la puerta abierta " + minutos + " minutos. Temperatura: " + temperatura + " grados.");
	}

	/**
	 * Devuelve la temperatura a 5 grados.
	 */
	public void recalibrar() {
		temperatura = 5;
		System.out.println(marca + " se recalibra. Temperatura: " + temperatura + " grados.");
	}

	/**
	 * Calcula el consumo en kWh: potencia × horas / 1000.
	 * Se divide entre 1000.0 para no perder los decimales.
	 * @return consumo en kWh
	 */
	public double getConsumo() {
		double consumo = compresor.getPotencia() * compresor.getHorasFuncionamiento() / 1000.0;
		return consumo;
	}

	public String toString() {
		String resultado = marca + " - " + temperatura + " grados - compresor de " + compresor.getPotencia()
				+ " W - consumo " + getConsumo() + " kWh";
		return resultado;
	}

}
