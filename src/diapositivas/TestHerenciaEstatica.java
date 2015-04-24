package diapositivas;

public class TestHerenciaEstatica {

	public static void main(String[] args) {
		int valor = EstaticaHija.getValor();
		System.out.println("Valor de la clase EstaticaHija : "+valor);
		valor = EstaticaPadre.getValor();
		System.out.println("Valor de la clase EstaticaPadre : "+valor);
	}

}

class EstaticaPadre{
	//protected me permite visibilidad en las clases hijas
	protected static int valor=0;
	public static int getValor(){
		return ++valor;
	}
}

class EstaticaHija extends EstaticaPadre{
	public static int getValor(){
		return valor+2;
	}
}