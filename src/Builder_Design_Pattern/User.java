package Builder_Design_Pattern;

import java.util.List;

public class User {
    String name;
    String surName;
    String currCompany;
    String collegeName;
    List<String> prevCompany;
    List<String> skills;

    User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.surName = userBuilder.surName;
        this.currCompany = userBuilder.currCompany;
        this.collegeName = userBuilder.collegeName;
        this.prevCompany = userBuilder.prevCompany;
        this.skills =userBuilder.skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", currCompany='" + currCompany + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", prevCompany=" + prevCompany +
                ", skills=" + skills +
                '}';
    }
}
