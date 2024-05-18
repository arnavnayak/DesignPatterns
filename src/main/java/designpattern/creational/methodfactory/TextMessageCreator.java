package designpattern.creational.methodfactory;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
