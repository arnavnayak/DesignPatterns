package designpattern.creational.abstractfactory;

public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity){
        System.out.println("Ec2Instance created with capacity : "+capacity);
    }
    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("attached "+storage.getId() + " to Ec2Instance");
    }
}
