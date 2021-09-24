package file.types;

import java.util.ArrayList;

import file.system.CompositeDemo;

public class Folder extends AbstractFile{
	public static final String TYPE = "/";

    private ArrayList<AbstractFile> includedFiles = new ArrayList<AbstractFile>();

	public Folder(String name) {
		this.name = name;  
		includedFiles = new ArrayList<AbstractFile>();  
	}

	public AbstractFile find(String name) {
		AbstractFile ans = null;
		for(AbstractFile af:includedFiles) {
			if(af.name.equals(name)) {
				ans = af;
				break;
			}
		}
		return ans;
	}

	public void add(AbstractFile e) { 		
		if(!includedFiles.contains(e)) {
			includedFiles.add(e);
		}
	}
	
	public ArrayList<AbstractFile> getIncludedFiles() { 		
		return includedFiles;
		
	}


	@Override
	 public void ls() {
	        System.out.println(CompositeDemo.compositeBuilder + name+TYPE);
	        CompositeDemo.compositeBuilder.append("   ");
	        for (AbstractFile as : includedFiles) {
	        		as.ls();
	        }
	        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
	    }

	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public void accept(AbstractFileVisitor afv) {
		afv.visit(this);	
//		includedFiles.forEach(af ->{
//			af.accept(afv);
//		});		
	}

}
