package composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    List<FileSystem> children = new ArrayList<>();
    String name;
    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem){
        children.add(fileSystem);
        System.out.println("New File is added");
    }

    public void remove (FileSystem fileSystem){
        children.remove(fileSystem);
        System.out.println("Removed one file");
    }

    @Override
    public void showDetail() {
        System.out.println("Name: " + name);
    }
}
