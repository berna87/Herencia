package ejercicios;

public class InformaticoAbs {
	private String empresa;
	private double sueldo;  //sueldo por hora
	public InformaticoAbs(String empresa) {
		this.empresa = empresa;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "InformaticoAbs [empresa=" + empresa + ", sueldo=" + sueldo
				+ "]";
	}
}

class Analista extends InformaticoAbs{
	private String especialidad;

	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	public double pagarSueldo(double horas){
		return getSueldo()*horas+100;
	}
	@Override
	public String toString() {
		return "Analista [especialidad=" + especialidad + " "
				+ super.toString() + "]";
	}
	

}

class Programador extends InformaticoAbs{
	private String lenguaje;

	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	public double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
}

class PruebaInformaticos{
	public static void main(String[] args) {
		Analista a = new Analista("Ejemplo S.A", "Videojuegos");
		a.setSueldo(8.5);
		System.out.println(a+" ganaria con 10 horas: "+a.pagarSueldo(10));
		Programador p = new Programador("Programing S.L", "Java");
		p.setSueldo(7);
		System.out.println(p+" ganaria con 10 horas: "+p.pagarSueldo(10));
	}
}
