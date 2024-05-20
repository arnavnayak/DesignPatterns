package designpattern.creational.abstractfactory;

public class S3Storage implements Storage{

    public S3Storage(int storageInMBs){
        System.out.println(getId()+" created with storage : "+storageInMBs);
    }
    @Override
    public String getId() {
        return "S3 Storage";
    }
}
