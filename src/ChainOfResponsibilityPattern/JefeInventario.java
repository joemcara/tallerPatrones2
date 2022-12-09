package ChainOfResponsibilityPattern;
public class JefeInventario extends ControladorBase {

	/**
	 * 
	 * @param request
	 */
	public void controlar(String request) {
		/*
		 * Certifica la existencia del producto
		 * en bodega para resposición
		 */
		
		//if(verifica que el precio de venta sea > 1000){
			super.controlar("siguiente request");
		//}
			
	}

}