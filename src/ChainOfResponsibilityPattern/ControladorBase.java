package ChainOfResponsibilityPattern;
public abstract class ControladorBase implements Controlador {

	private Controlador next;

	/**
	 * 
	 * @param c
	 */
	public void setNext(Controlador c) {
	}

	/**
	 * 
	 * @param request
	 */
	public void controlar(String request) {
		if(next!=null){
			next.controlar("NuevoRequest");
		}
	}

}