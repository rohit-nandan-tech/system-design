package Builder_Design_Pattern;

import java.util.List;

public class UserBuilder {
        String name;
        String surName;
        String currCompany;
        String collegeName;
        List<String> prevCompany;
        List<String> skills;

        UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        UserBuilder setSurName(String surName){
            this.surName = surName;
            return this;
        }

        UserBuilder setCurrCompany(String currCompany){
            this.currCompany = currCompany;
            return this;
        }

        UserBuilder setCollegeName(String collegeName){
            this.collegeName = collegeName;
            return this;
        }

        UserBuilder setPrevCompanies(List<String> prevCompany){
            this.prevCompany = prevCompany;
            return this;
        }

        UserBuilder setSkills(List<String> skills){
            this.skills =  skills;
            return this;
        }

        User build(){
            return new User(this);
        }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", currCompany='" + currCompany + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", prevCompany=" + prevCompany +
                ", skills=" + skills +
                '}';
    }
}
