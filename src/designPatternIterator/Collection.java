package designPatternIterator;

public interface Collection {

	public Iterator createIterator();
//Creates Iterator
	
	public void addItem(String str);
//Adds a new Item to the Collection
}
