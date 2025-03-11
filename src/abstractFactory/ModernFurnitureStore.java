package abstractFactory;

public class ModernFurnitureStore {

	public ModernFurnitureStore(FurnitureStore store) {
		super();
	}
	
	public Sofa createSofa() {
		return new ModernSofa();	
		
	}
	
	public Table createTable() {
		return new ModernTable();
	}
	
	public Chair createChair() {
		return new ModernChair();
	}
}