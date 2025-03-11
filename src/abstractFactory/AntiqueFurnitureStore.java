package abstractFactory;

public class AntiqueFurnitureStore extends FurnitureStore {

	public AntiqueFurnitureStore(FurnitureStore store){
		super();
	}

	public Sofa createSofa() {
		return new AntiqueSofa();

	}

	public Table createTable() {
		return new AntiqueTable();
	}

	public Chair createChair() {
		return new AntiqueTable();
	}
}
