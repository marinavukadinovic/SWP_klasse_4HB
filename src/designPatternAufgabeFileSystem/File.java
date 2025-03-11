package designPatternAufgabeFileSystem;

public abstract class File {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.getName());
	}
	
	public void add (File f) {
		
	}
	
	public void remove (File f) {
		
	}
}
