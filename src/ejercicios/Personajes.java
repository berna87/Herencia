package ejercicios;

public class Personajes {
	private String nombre;
	private int nivelEnergia;
	public Personajes(String nombre, int nivelEnergia) {
		this.nombre = nombre;
		this.nivelEnergia = nivelEnergia;
	}
	public void alimentarse(int energia){
		nivelEnergia += energia;	
	}
	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", nivelEnergia="
				+ nivelEnergia + "]";
	}
}

class Guerrero extends Personajes{
	private String arma;
	public Guerrero(String nombre, int nivelEnergia, String arma) {
		super(nombre, nivelEnergia);
		this.arma = arma;
	}
	public String combatir(int energia){
		alimentarse(-energia);
		return "Arma usada: "+this.arma+"\n Energia usada: "+energia;
	}
	@Override
	public String toString() {
		return "Guerrero [arma=" + arma + " " + super.toString()
				+ "]";
	}
}
class Mago extends Personajes{
	private String poder;

	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
	public String encantar(){
		alimentarse(-2);
		return poder;
	}
	@Override
	public String toString() {
		return "Mago [poder=" + poder + " " + super.toString()
				+ "]";
	}
}

class TestVideojuego{
	public static void main(String[] args) {
		Guerrero g = new Guerrero("Conan", 50, "Espada");
		System.out.println(g.combatir(10));
		System.out.println(g);
		Mago m = new Mago("Saruman", "Fuego");
		System.out.println(m.encantar());
		System.out.println(m);
		
	}
}