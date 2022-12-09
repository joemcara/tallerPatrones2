package IteratorPattern;
public class VendedorIter implements UserIterator {

	private ProductosTienda productosTienda;

	@Override
	public Producto next() {
		// Recorre
		return new Producto();
	}

	@Override
	public boolean hasMore() {
		// Compruba si hay elementos
		return false;
	}

}
