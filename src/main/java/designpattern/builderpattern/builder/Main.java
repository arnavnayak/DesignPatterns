package designpattern.builderpattern.builder;

import java.time.LocalDate;
import java.time.Month;

public class Main { // its the client/director which uses builder to construct an object involving multiple steps or a complex object
                    // knows the steps and their sequence to build the product.

    public static void main(String[] args) {

        User user = createUserData();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserWebDTO userWebDTO = builder(user,builder);
        System.out.println(userWebDTO);
    }

    //director
    private static UserWebDTO builder(User user,UserDTOBuilder builder){
        return builder.withAddress(user.getAddress())
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthdate(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

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
