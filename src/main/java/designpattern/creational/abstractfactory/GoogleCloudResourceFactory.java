package designpattern.creational.abstractfactory;

public class GoogleCloudResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int storageInMBs) {
        Storage googleStorage = new GoogleCloudStorage(storageInMBs);
        googleStorage.getId();
        return googleStorage;
    }
}
