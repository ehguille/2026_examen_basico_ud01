package frigorificos;

/**
 * Compresor de un frigorífico. Guarda su potencia y las horas
 * que ha estado funcionando.
 */
public class Compresor {

	private int potencia;
	private int horasFuncionamiento;

	/**
	 * Crea un compresor con la potencia por defecto (150 W).
	 */
	public Compresor() {
		potencia = 150;
		horasFuncionamiento = 0;
		System.out.println("Se crea un compresor de " + potencia + " W.");
	}

	/**
	 * Crea un compresor con la potencia indicada.
	 * @param potencia potencia en vatios
	 */
	public Compresor(int potencia) {
		this.potencia = potencia;
		horasFuncionamiento = 0;
		System.out.println("Se crea un compresor de " + potencia + " W.");
	}

	/**
	 * El compresor funciona el número de horas indicado.
	 * @param horas horas de funcionamiento
	 */
	public void funcionar(int horas) {
		horasFuncionamiento = horasFuncionamiento + horas;
		System.out.println("El compresor funciona " + horas + " h. Lleva " + horasFuncionamiento + " h en total.");
	}

	public int getPotencia() {
		return potencia;
	}

	public int getHorasFuncionamiento() {
		return horasFuncionamiento;
	}

}
