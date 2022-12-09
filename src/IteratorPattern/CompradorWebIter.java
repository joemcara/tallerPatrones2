package IteratorPattern;
public class CompradorWebIter implements UserIterator {

	private ProductosDisponibles productosDisponibles;

	@Override
	public Producto next() {
		//recorre
		return new Producto();
	}

	@Override
	public boolean hasMore() {
		// comprueba
		return false;
	}

}
