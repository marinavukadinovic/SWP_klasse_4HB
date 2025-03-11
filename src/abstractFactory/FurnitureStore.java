package abstractFactory;

public abstract class FurnitureStore {

	private FurnitureStore store;
	
	public FurnitureStore(FurnitureStore store) {
		super();
		this.store = store;
	}
	
	public FurnitureStore() {
		super();
	}
	
	public abstract Sofa createSofa();
	
	public abstract Table createTable();
	
	public abstract Chair createChair();
}
