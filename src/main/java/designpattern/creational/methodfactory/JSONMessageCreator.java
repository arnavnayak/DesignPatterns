package designpattern.creational.methodfactory;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
