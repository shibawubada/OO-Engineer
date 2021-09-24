package file.types;

import file.system.CompositeDemo;

public class BinaryFile {
	String name;
	public static final String TYPE = ".exe";
	
	public BinaryFile(String name){
	      this.name = name; 
    }
	
	public void ls() {
	   System.out.println(CompositeDemo.compositeBuilder + name+TYPE);
	}
}
