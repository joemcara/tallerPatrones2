package IteratorPattern;
public class ProveedorIter implements UserIterator {

	private FallaGarantia colFallaGarantia;

	@Override
	public Producto next() {
		// Recorre
		return new Producto();
	}

	@Override
	public boolean hasMore() {
		// Comprueba que hay elementos
		return false;
	}

}
