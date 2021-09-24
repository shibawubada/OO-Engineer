package file.types;

import file.system.CompositeDemo;

public class TextFile {
	String name;
	public static final String TYPE = ".txt";

	public TextFile(String name){
		this.name = name; 
	}

	public void ls() {
		System.out.println(CompositeDemo.compositeBuilder + name+TYPE);
	}
}
