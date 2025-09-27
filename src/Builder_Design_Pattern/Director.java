package Builder_Design_Pattern;

import java.util.List;

public class Director {
    UserBuilder userBuilder;

    public Director(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    User constructUser(){
        return userBuilder.setName("Rohit").setSurName("Nandan").setCurrCompany("Addverb")
                .setCollegeName("NITJ").setPrevCompanies(List.of("RobotMq","Convegenius, ISRO")).setSkills(List.of("Java","C++")).build();
    }
}
