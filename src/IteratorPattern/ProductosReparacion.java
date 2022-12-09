package IteratorPattern;
public class ProductosReparacion implements IterableProduct {

	private Producto[] productos;

	@Override
	public UserIterator createIterator() {
		// Pasa a los iteradores
		return new MantenimientoIter();
	}

}
