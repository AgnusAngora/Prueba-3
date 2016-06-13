package cl.curso.java.prueba_tres.jzarate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */

public class TarjetaBip {
	/**
	 * atributos
	 */
	private int numeroTarjeta;
	private int saldo;
	private ArrayList<Viaje> viajes;
	/**
	 * getters and setters
	 */

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta
	 *            the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the viajes
	 */
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * @param viajes
	 *            the viajes to set
	 */
	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}

	/**
	 * constructor default
	 */
	public TarjetaBip() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, ArrayList<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	/**
	 * Metodos
	 * 
	 * @param monto
	 */
	public void recargar(int monto) {
		setSaldo(getSaldo() + monto);
	}

	public synchronized void pagarViaje(int valorViaje) {
		if (getSaldo() < valorViaje) {
			throw new SinSaldoException("Tarjeta sin saldo suficiente.");
		} else {
			if (getSaldo() > valorViaje || getSaldo() == valorViaje) {
				setSaldo(getSaldo() - valorViaje);
				Date fecha = new Date();
				this.viajes.add(new Viaje(fecha, getSaldo(), valorViaje));
			}
		}
	}

	public void imprimir() {
		Collections.sort(this.getViajes(), new Comparator<Viaje>() {

			public int compare(Viaje o1, Viaje o2) {
				return o1.getFecha().compareTo(o2.getFecha());
			}
		});
		for (Viaje viajes : viajes) {
			viajes.toString();
		}
	}
}
