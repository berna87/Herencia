package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}

class Profesor extends Persona{
	private String asignatura;
	public Profesor(String nombre, int edad, String asignatura) {
		super(nombre, edad);
		this.asignatura = asignatura;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + " "
				+ super.toString() + "]";
	}
}

class ProfesorTitular extends Profesor{
	private int aniosExperiencia;

	public ProfesorTitular(String nombre, int edad, String asignatura,
			int aniosExperiencia) {
		super(nombre, edad, asignatura);
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [aniosExperiencia=" + aniosExperiencia
				+ " " + super.toString() + "]";
	}
}

class ProfesorInterino  extends Profesor{
	private int tiempoContrato;

	public ProfesorInterino(String nombre, int edad, String asignatura,
			int tiempoContrato) {
		super(nombre, edad, asignatura);
		this.tiempoContrato = tiempoContrato;
	}

	public int getTiempoContrato() {
		return tiempoContrato;
	}

	public void setTiempoContrato(int tiempoContrato) {
		this.tiempoContrato = tiempoContrato;
	}

	@Override
	public String toString() {
		return "ProfesiorInterino [tiempoContrato=" + tiempoContrato
				+ " " + super.toString() + "]";
	}
	
}

class ListinProfesores{
	private List<Profesor> lista;

	public ListinProfesores() {
		this.lista = new ArrayList<Profesor>();
	}
	public void addProfesor(Profesor p){
		lista.add(p);	
	}
	public List<Profesor> getListin(){
		return this.lista;
	}
	
}

class TestHerencia4{
	public static void main(String[] args) {
		Profesor p1= new Profesor("Juan", 30, "Lengua");
		Profesor p2= new Profesor("Pedro", 40, "Matematicas");
		Profesor p3= new Profesor("Manolo", 35, "Ingles");
		ProfesorTitular pt = new ProfesorTitular("Jose", 50, "Historia", 25);
		ProfesorInterino pi = new ProfesorInterino("Ana", 25, "Frances", 1);
		ListinProfesores l = new ListinProfesores();
		l.addProfesor(p1); l.addProfesor(p2); l.addProfesor(p3);
		l.addProfesor(pi); l.addProfesor(pt);
		for (Profesor p : l.getListin()) {
			System.out.println(p);
		}
		
	}
	
	
}

