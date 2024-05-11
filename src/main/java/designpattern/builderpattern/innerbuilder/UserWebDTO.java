package designpattern.builderpattern.innerbuilder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTO {// this is our product class, that is the final complex object that we want to create
                            //this has inner builder which gives the functionality of conrete builder that is
                            //constructing parts and assembling final product also to keep track of product created.

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

//    public UserWebDTO(String name, String address, String age) {  //commented because we are doing it by defining setters in build we can also do using const.
//        this.name = name;
//        this.address = address;
//        this.age = age;
//    }
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'';
    }

    //inner builder
    public static class UserWebDTOBuilder{
        private String firstName;
        private String lastName;
        private String age;
        private String fullAddress;
        private UserWebDTO userWebDTO;
        public UserWebDTOBuilder withFirstName(String fName){
            firstName = fName;
            return this;
        }

        public UserWebDTOBuilder withLastName(String lName){
            lastName = lName;
            return this;
        }

        public UserWebDTOBuilder withBirthdate(LocalDate birthDate){
            age = Integer.toString(Period.between(birthDate,LocalDate.now()).getYears());
            return this;
        }

        public UserWebDTOBuilder withAddress(Address address){
            fullAddress = address.getHouseNumber() + " , " +address.getStreet()+" ,\n" + address.getCity()+" , "+address.getState()+" ,\n"+address.getZipcode();
            return this;
        }

        public UserWebDTO build(){
//            userWebDTO = new UserWebDTO(firstName+" "+lastName,fullAddress,age); // to do through const open this
            this.userWebDTO = new UserWebDTO();
            userWebDTO.setName(firstName+" "+lastName);
            userWebDTO.setAddress(fullAddress);
            userWebDTO.setAge(age);
            return userWebDTO;
        }

        public UserWebDTO getUserDto(){
            return userWebDTO;
        }
    }
}
