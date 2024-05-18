package designpattern.creational.builderpattern.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {//abstract builder class - provides interface for creating parts if the final product
                                    //all the below methods returns reference to the builder itself which helps in achieving method chaining

    //methods to build the "parts" of the final product
    UserDTOBuilder withFirstName(String fName);

    UserDTOBuilder withLastName(String lName);

    UserDTOBuilder withBirthdate(LocalDate birthdayDate);

    UserDTOBuilder withAddress(Address address);

    //method to "assemble" the final product
    UserWebDTO build();

    //method to fetch already built object
    UserWebDTO getUserDTO();

}
