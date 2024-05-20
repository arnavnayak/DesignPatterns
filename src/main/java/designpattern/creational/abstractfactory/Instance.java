package designpattern.creational.abstractfactory;

public interface Instance {

    enum Capacity{micro,small,large}
    public void start();

    public void stop();

    public void attachStorage(Storage storage);
}
