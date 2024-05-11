package designpattern.builderpattern.innerbuilder;

import java.time.LocalDate;
import java.time.Month;

public class Main { // its the client/director which uses builder to construct an object involving multiple steps or a complex object
                    // knows the steps and their sequence to build the product.

    public static void main(String[] args) {
        User user = createUserData();
        UserWebDTO.UserWebDTOBuilder builder = new UserWebDTO.UserWebDTOBuilder();
        UserWebDTO userWebDto = director(user, builder);
        System.out.println(userWebDto);
    }

    private static UserWebDTO director(User user, UserWebDTO.UserWebDTOBuilder builder) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthdate(user.getBirthday())
                .build();
    }

    //director


    //some example data
    private static User createUserData(){
        User user = new User();
        LocalDate birthDate = LocalDate.of(1995, Month.MARCH,18);
        Address address = new Address();
        address.setHouseNumber("No. 18");
        address.setStreet("1st cross , 3rd Main , Krishnaraju layout , JP nagar");
        address.setCity("Bengaluru");
        address.setState("Karnataka");
        address.setZipcode("560065");
        user.setFirstName("Arnav");
        user.setLastName("Nayak");
        user.setBirthday(birthDate);
        user.setAddress(address);
        return user;
    }
}
