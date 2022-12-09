package IteratorPattern;
public class CompradorWebIter implements UserIterator {

	private ProductosDisponibles productosDisponibles;

	@Override
	public Producto next() {
		// TODO Auto-generated method stub
		return new Producto();
	}

	@Override
	public boolean hasMore() {
		// TODO Auto-generated method stub
		return false;
	}

}