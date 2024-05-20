package designpattern.creational.abstractfactory;

public class AWSResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int storageInMBs) {
        Storage awsStorage = new S3Storage(storageInMBs);
        awsStorage.getId();
        return awsStorage;
    }
}
