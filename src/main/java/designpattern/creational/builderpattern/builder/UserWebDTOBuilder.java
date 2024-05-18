package designpattern.creational.builderpattern.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{ // it is the concrete builder which implements the UserDTOBuilder the abstract builder
                                                            //it construct the parts and assembles final product also keep track of product created

    String firstName;
    String lastName;
    String age;
    String fullAddress;
    UserWebDTO userWebDTO;
    @Override
    public UserDTOBuilder withFirstName(String fName) {
        firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthdate(LocalDate birthdayDate) {
        Period ageInYears =  Period.between(birthdayDate,LocalDate.now());
        age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        fullAddress = address.getHouseNumber() + " , " +address.getStreet()+" ,\n" + address.getCity()+" , "+address.getState()+" ,\n"+address.getZipcode();
        return this;
    }

    @Override
    public UserWebDTO build() {
        userWebDTO = new UserWebDTO(firstName+" "+lastName,fullAddress,age);
        return userWebDTO;
    }

    @Override
    public UserWebDTO getUserDTO() {
        return userWebDTO;
    }


}
