package vehicle.types;

public abstract class AbstractFile {
	String name;
	
	public abstract void ls();
	public abstract String getPath();
	public void add(AbstractFile f) {}

}
