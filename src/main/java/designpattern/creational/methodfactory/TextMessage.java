package designpattern.creational.methodfactory;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "some text message";
    }
}
