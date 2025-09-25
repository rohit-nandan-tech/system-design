package composite_design_pattern;

public class CompositeDesignPattern {
    public static void main(String [] args){
        FileSystem file1 = new File("file1");
        FileSystem file2 = new File("file2");


        Folder folder = new Folder("folder");

        folder.add(file1);
        folder.add(file2);

        folder.remove(file1);

        
        folder.showDetail();
    }
}
