package file.types;

import file.system.CompositeDemo;

public class Shortcut {
	public Object link;
	String name;
	public static final String TYPE = ".shortcut";

	public Shortcut(String name, Object link) {
		this.name = name;
		this.link = link;
	}

	public void ls() {
		String linkType = "";
		if(link instanceof TextFile)
			linkType = TextFile.TYPE;
		else if(link instanceof BinaryFile) 
			linkType = BinaryFile.TYPE;
		else if(link instanceof Folder)
			linkType = Folder.TYPE;
		//...
		System.out.println(CompositeDemo.compositeBuilder + name+linkType+TYPE);
	}
}
