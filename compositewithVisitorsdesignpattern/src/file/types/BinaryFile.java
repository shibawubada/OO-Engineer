package file.types;

import file.system.CompositeDemo;

public class BinaryFile extends AbstractFile{
	public static final String TYPE = ".exe";
	
	public BinaryFile(String name){
	      this.name = name; 
    }
	
	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public void ls() {
	   System.out.println(CompositeDemo.compositeBuilder + name+TYPE);
	}

	@Override
	public void accept(AbstractFileVisitor afv) {
		afv.visit(this);
		
	}
}
