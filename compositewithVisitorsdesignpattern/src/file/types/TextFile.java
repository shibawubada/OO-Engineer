package file.types;


import file.system.CompositeDemo;

public class TextFile extends AbstractFile{
	public static final String TYPE = ".txt";
	
    public TextFile(String name){
      this.name = name;  // stores the name in the class Entry part of this object
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
