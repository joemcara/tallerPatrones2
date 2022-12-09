package IteratorPattern;
public class ProductosDisponibles implements IterableProduct {

	private Producto[] productos;

	@Override
	public UserIterator createIterator() {
		// Pasa a los iteradores
		return new CompradorWebIter();
	}

}
