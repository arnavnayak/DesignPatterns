package designpattern.creational.abstractfactory;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity){
        System.out.println("Google compute engine Instance created with capacity : "+capacity.name());
    }
    @Override
    public void start() {
        System.out.println("Google compute engine Instance started");
    }

    @Override
    public void stop() {
        System.out.println("Google compute engine Instance stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("attached "+storage.getId() + " to Google compute engine Instance");
    }
}
