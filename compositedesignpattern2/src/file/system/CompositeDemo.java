package file.system;

import file.types.AbstractFile;
import file.types.BinaryFile;
import file.types.Folder;
import file.types.Shortcut;
import file.types.TextFile;

public class CompositeDemo {

    public static StringBuilder compositeBuilder = new StringBuilder();

	public static void main(String[] args) {
        AbstractFile root = new Folder("root");
        AbstractFile bin = new Folder("bin");
        AbstractFile usr = new Folder("usr");
        AbstractFile tmp = new Folder("tmp");
        root.add(bin);
        root.add(usr);
        root.add(tmp);
        
        AbstractFile subdir1 = new Folder("subdir1");
        AbstractFile file2 = new BinaryFile("file2");
        AbstractFile file3 = new BinaryFile("file3");
        subdir1.add(file2);
        subdir1.add(file3);
        bin.add(subdir1);
        
        AbstractFile subdir2 = new Folder("subdir2");
        AbstractFile file4 = new BinaryFile("file4");
        subdir2.add(file4);
        bin.add(subdir2);

        AbstractFile file1 = new BinaryFile("file1");
        bin.add(file1);
        
        AbstractFile file1t = new TextFile("file1");
        usr.add(file1t);
        
        AbstractFile file1s = new Shortcut("file1", file1t);
        AbstractFile file2t = new TextFile("file2");
        AbstractFile file3t = new TextFile("file3");
        AbstractFile file4t = new TextFile("file4");
        tmp.add(file1s);
        tmp.add(file2t);
        tmp.add(file3t);
        tmp.add(file4t);
        
        root.ls();
    }
}
