package file.types;

import file.system.CompositeDemo;

public class Shortcut extends AbstractFile{
	//models a link (shortcut) to an Entry not in the present folder/level
public AbstractFile link;

public static final String TYPE = ".shortcut";


	public Shortcut(String name, AbstractFile link) {
		this.name = name;
		this.link = link;
	}
	
	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public void ls() {
		System.out.println(CompositeDemo.compositeBuilder + name+link.getType()+TYPE);
	}
}
