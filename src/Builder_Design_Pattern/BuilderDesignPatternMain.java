package Builder_Design_Pattern;

public class BuilderDesignPatternMain {
    public static void main(String[]args){
        UserBuilder userBuilder = new UserBuilder();
        Director director = new Director(userBuilder);
        User user = director.constructUser();

        System.out.println(user.toString());

    }
}
