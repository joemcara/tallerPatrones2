package ChainOfResponsibilityPattern;
public class Tecnico extends ControladorBase {

	/**
	 * 
	 * @param request
	 */
	public void controlar(String request) {
		/*
		 * Constata que el tipo de fallo se
		 * encuentre dentro de lo cubierto
		 * por la garantía
		 */
		super.controlar("Siguiente request");
	}

}