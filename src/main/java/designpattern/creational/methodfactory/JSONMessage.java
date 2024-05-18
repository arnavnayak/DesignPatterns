package designpattern.creational.methodfactory;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "{\"json\":jsonValue}";
    }
}
