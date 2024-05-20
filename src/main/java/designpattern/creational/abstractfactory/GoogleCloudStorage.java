package designpattern.creational.abstractfactory;

public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int storageInMBs){
        System.out.println(getId()+" created with storage : "+storageInMBs);
    }
    @Override
    public String getId() {
        return "Google Cloud Storage";
    }
}
