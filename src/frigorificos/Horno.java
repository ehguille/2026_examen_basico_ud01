package hornos;

/**
 * Horno con una marca, una temperatura y su propia resistencia.
 * El usuario solo se comunica con el horno; el horno se comunica con la resistencia.
 */
public class Horno {

    private static final int TEMPERATURA_INICIAL = 20;
    private static final int GRADOS_POR_CALENTAMIENTO = 10;
    private static final int MINUTOS_POR_CALENTAMIENTO = 5;
    private static final int GRADOS_PERDIDOS_POR_MINUTO = 15;

    private String marca;
    private int temperatura;
    private Resistencia resistencia;

    public Horno(String marca) {
        this.marca = marca;
        this.temperatura = TEMPERATURA_INICIAL;
        this.resistencia = new Resistencia();
        System.out.println("Se crea un horno " + marca + " a " + temperatura + " grados");
    }

    public Horno(String marca, int potencia) {
        this.marca = marca;
        this.temperatura = TEMPERATURA_INICIAL;
        this.resistencia = new Resistencia(potencia);
        System.out.println("Se crea un horno " + marca + " a " + temperatura + " grados");
    }

    public void calentar() {
        temperatura += GRADOS_POR_CALENTAMIENTO;
        System.out.println("El horno " + marca + " calienta hasta " + temperatura + " grados");
        resistencia.funcionar(MINUTOS_POR_CALENTAMIENTO);
    }

    public void calentar(int veces) {
        System.out.println("El horno " + marca + " va a calentar " + veces + " veces");
        for (int i = 0; i < veces; i++) {
            calentar();
        }
    }

    public void abrirPuerta(int minutos) {
        temperatura -= GRADOS_PERDIDOS_POR_MINUTO * minutos;
        System.out.println("Se abre la puerta del horno " + marca + " " + minutos
                + " minutos: baja a " + temperatura + " grados");
    }

    public void reiniciar() {
        temperatura = TEMPERATURA_INICIAL;
        System.out.println("El horno " + marca + " se reinicia a " + temperatura + " grados");
    }

    public double getConsumo() {
        return resistencia.getConsumo();
    }

    @Override
    public String toString() {
        return marca + " - " + temperatura + " grados - " + resistencia
                + " - consumo " + getConsumo() + " kWh";
    }
}