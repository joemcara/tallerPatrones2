package ChainOfResponsibilityPattern;
public interface Controlador {

	/**
	 * 
	 * @param c
	 */
	void setNext(Controlador c);

	/**
	 * 
	 * @param request
	 */
	void controlar(String request);

}