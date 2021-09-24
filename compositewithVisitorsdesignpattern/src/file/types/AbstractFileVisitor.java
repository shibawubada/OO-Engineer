package file.types;

public interface AbstractFileVisitor {
	public void visit(BinaryFile bf);
	
	public void visit(Folder f);
	
	public void visit(Shortcut s);
	
	public void visit(TextFile tf);
}


