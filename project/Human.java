

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Human {
    String surname;
    String name;
    String middle_name;
    String date_of_birth;
    int phone;
    char gender;

    public Human(String surname, String name, String middle_name, String date_of_birth, int phone, char gender) {
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.date_of_birth = date_of_birth;
        this.phone = phone;
        this.gender = gender;
    }



    @Override
    public String toString() {
        return String.format("<s%> <s%> <s%> <s%> <s%> <s%>",surname,name,middle_name,date_of_birth,phone,gender);
    }

    
    
}
