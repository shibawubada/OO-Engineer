package file.types;

import java.util.ArrayList;

import file.system.CompositeDemo;

public class Folder {
	String name;
	public static final String TYPE = "/";
	private ArrayList<Object> includedFiles = new ArrayList<Object>();

	public Folder(String name) {
		this.name = name;  
	}

	public Object find(String name) {
		Object ans = null;
		for(Object o:includedFiles) {
			String name1 = null;
			if(o instanceof BinaryFile) 
				name1 = ((BinaryFile) o).name;
			else if(o instanceof TextFile)
				name1 = ((TextFile) o).name;
			else if(o instanceof Shortcut)
				name1 = ((Shortcut) o).name;
			else if(o instanceof Folder)
				name1 = ((Folder) o).name;

			if(name1.equals(name)) {
				ans = o;
				break;
			}
		}
		return ans;
	}

	public void add(Object e) { 

		if(!includedFiles.contains(e)) {
			includedFiles.add(e);
		}
	}

	public void ls() {
		System.out.println(CompositeDemo.compositeBuilder + name+TYPE);
		CompositeDemo.compositeBuilder.append("   ");
		for (Object obj : includedFiles) {
			// Recover the type of this object
			String name = obj.getClass().getSimpleName();
			if (name.equals("BinaryFile")) {
				((BinaryFile)obj).ls();
			} 
			else if (name.equals("TextFile")) {
				((TextFile)obj).ls();
			}
			else if (name.equals("Shortcut")) {
				((Shortcut)obj).ls();
			}
			else if (name.equals("Folder")) {
				((Folder)obj).ls();
			}
		}
		CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
	}

}
