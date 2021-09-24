package file.types;

import java.util.ArrayList;

public class FindVisitor implements AbstractFileVisitor{
	private String matchstring;
	public ArrayList<AbstractFile> result;
	public FindVisitor(String matchstring) {
		this.matchstring  = matchstring;
		result = new ArrayList<AbstractFile>();
	}
	@Override
	public void visit(BinaryFile bf) {
		if(bf.name.contains(matchstring))
			result.add(bf);
	}
	@Override
	public void visit(TextFile tf) {
		if(tf.name.contains(matchstring))
			result.add(tf);
	}
	@Override
	public void visit(Folder f) {
//		f.getIncludedFiles().forEach(af ->{
//			af.accept(this);
//		});
	}
	@Override
	public void visit(Shortcut s) {}
}

