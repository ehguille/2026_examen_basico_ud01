package hornos;

/**
 * Resistencia de un horno: tiene una potencia y acumula minutos de funcionamiento.
 */
public class Resistencia {

    private static final int POTENCIA_POR_DEFECTO = 1200;
    private static final int MINUTOS_POR_KWH = 60000;

    private int potencia;
    private int minutosFuncionamiento;

    public Resistencia() {
        this(POTENCIA_POR_DEFECTO);
    }

    public Resistencia(int potencia) {
        this.potencia = potencia;
        this.minutosFuncionamiento = 0;
        System.out.println("Se crea una resistencia de " + potencia + " W");
    }

    public void funcionar(int minutos) {
        minutosFuncionamiento += minutos;
        System.out.println("La resistencia funciona " + minutos + " minutos (total: "
                + minutosFuncionamiento + " minutos)");
    }

    public double getConsumo() {
        return (double) potencia * minutosFuncionamiento / MINUTOS_POR_KWH;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "resistencia de " + potencia + " W";
    }
}