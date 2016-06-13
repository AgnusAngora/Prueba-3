package cl.curso.java.prueba_tres.jzarate;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class PagarViaje extends Thread {

	/**
	 * atributos
	 */
	private TarjetaBip tarjetaBip;
	private int valorViaje;

	/**
	 * getters and setters
	 */

	/**
	 * @return the tarjetaBip
	 */
	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}

	/**
	 * @param tarjetaBip
	 *            the tarjetaBip to set
	 */
	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
	}

	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}

	/**
	 * @param valorViaje
	 *            the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	/**
	 * constructores
	 */
	public PagarViaje() {
		super();
	}

	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}

	@Override
	public void run() {
		try {
			sleep(1000);
			this.tarjetaBip.pagarViaje(valorViaje);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}