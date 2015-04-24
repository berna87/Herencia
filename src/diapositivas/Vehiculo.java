package diapositivas;

import java.time.LocalDate;
//clase padre
public class Vehiculo {
	private int numeroDeRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroDePasajeros;
	public Vehiculo(int numeroDeRuedas, int numeroDePasajeros) {
		this.numeroDeRuedas = numeroDeRuedas;
		this.fechaCompra = LocalDate.now();
		this.numeroDePasajeros = numeroDePasajeros;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public int getNumeroDePasajeros() {
		return numeroDePasajeros;
	}
	@Override
	public String toString() {
		return "[numeroDeRuedas=" + numeroDeRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroDePasajeros=" + numeroDePasajeros + "]";
	}
}

//clase hijo que hereda de vehiculo
class Coche extends Vehiculo{
	private boolean diesel;
	private boolean descapotable;
	public Coche(int numeroDePasajeros, boolean diesel, boolean descapotable) {
		super(4, numeroDePasajeros);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				+ ", Vehiculo " + super.toString() + "]";
	}
}

//clase hijo que hereda de vehiculo
class Motocicleta extends Vehiculo{
	private int cilindrada;

	public Motocicleta(int cilindrada) {
		super(2, 2);
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + " "
				+ super.toString() + "]";
	}
}

