package composite_design_pattern;

public class File implements FileSystem{
    public String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetail() {
        System.out.println("Name: " +  name);
    }
}
