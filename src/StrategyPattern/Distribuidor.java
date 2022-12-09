package StrategyPattern;
public class Distribuidor {

	private Transporte transporte;
	/**
	 * 
	 * @param t
	 */
	public void setStrategy(Transporte t) {
		this.transporte = t;
	}

	//Método que ejecuta la implementacion de la estrategia
	public void ejecutarEstrategia() {
		//la implementacion del metodo ejecutar se decide en tiempo de ejecución
		transporte.ejecutar();
	}

}