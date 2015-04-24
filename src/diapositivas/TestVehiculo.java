package diapositivas;

public class TestVehiculo {

	public static void main(String[] args) {
		Coche c1 = new Coche(7, true, false);
		c1.setPropietario("Pepe");
		System.out.println(c1);
		Coche c2 = new Coche(5, false, true);
		c2.setPropietario("Juan");
		System.out.println(c2);
		Motocicleta m1 = new Motocicleta(50);
		m1.setPropietario("Maria");
		System.out.println(m1);
		Motocicleta m2 = new Motocicleta(125);
		m2.setPropietario("Pedro");
		System.out.println(m2);
	}

}
