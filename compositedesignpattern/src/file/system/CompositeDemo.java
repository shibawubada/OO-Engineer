package file.system;

import file.types.BinaryFile;
import file.types.Folder;
import file.types.Shortcut;
import file.types.TextFile;

public class CompositeDemo {

    public static StringBuilder compositeBuilder = new StringBuilder();

	public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder bin = new Folder("bin");
        Folder usr = new Folder("usr");
        Folder tmp = new Folder("tmp");
        root.add(bin);
        root.add(usr);
        root.add(tmp);
        
        Folder subdir1 = new Folder("subdir1");
        BinaryFile file2 = new BinaryFile("file2");
        BinaryFile file3 = new BinaryFile("file3");
        subdir1.add(file2);
        subdir1.add(file3);
        bin.add(subdir1);
        
        Folder subdir2 = new Folder("subdir2");
        BinaryFile file4 = new BinaryFile("file4");
        subdir2.add(file4);
        bin.add(subdir2);

        BinaryFile file1 = new BinaryFile("file1");
        bin.add(file1);
        
        TextFile file1t = new TextFile("file1");
        usr.add(file1t);
        
        Shortcut file1s = new Shortcut("file1", file1t);
        TextFile file2t = new TextFile("file2");
        TextFile file3t = new TextFile("file3");
        TextFile file4t = new TextFile("file4");
        tmp.add(file1s);
        tmp.add(file2t);
        tmp.add(file3t);
        tmp.add(file4t);
        
        root.ls();
    }
}
