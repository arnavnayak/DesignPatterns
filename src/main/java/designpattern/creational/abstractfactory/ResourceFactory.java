package designpattern.creational.abstractfactory;

public interface ResourceFactory {

    public Instance createInstance(Instance.Capacity capacity);

    public Storage createStorage(int storageInMBs);
}
