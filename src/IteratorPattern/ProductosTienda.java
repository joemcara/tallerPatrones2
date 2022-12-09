package IteratorPattern;
public class ProductosTienda implements IterableProduct {

	private Producto[] productos;

	@Override
	public UserIterator createIterator() {
		// Pasa a los iteradores
		return new VendedorIter();
	}

}
