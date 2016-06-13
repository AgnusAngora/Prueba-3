package cl.curso.java.prueba_tres.jzarate;

import java.util.Date;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Viaje implements Comparable<Viaje> {

	/**
	 * atributos
	 */
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;

	/**
	 * getters and setters
	 */

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	/**
	 * @param saldoTarjeta
	 *            the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
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

	public Viaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	/**
	 * metodos
	 */
	public int compareTo(Viaje viaje) {
		return viaje.getFecha().compareTo(getFecha());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fecha del viaje: " + getFecha() + " Saldo de la Tarjeta: " + getSaldoTarjeta() + " Valor del viaje: "
				+ getValorViaje();
	}

}
