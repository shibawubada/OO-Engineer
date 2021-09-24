package file.types;

public abstract class AbstractFile {
	String name;

	public abstract void ls();
	public abstract String getType();	
	public void add(AbstractFile f) {}
	public abstract void accept(AbstractFileVisitor afv);
}

