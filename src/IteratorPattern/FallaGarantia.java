package IteratorPattern;
public class FallaGarantia implements IterableProduct {

	private Producto[] productos;

	@Override
	public UserIterator createIterator() {
		// Crea el iterator
		return new ProveedorIter();
	}

}
