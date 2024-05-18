package designpattern.creational.methodfactory;
public abstract class MessageCreator {


    public Message getMessage(){
        Message message = createMessage();
        message.encryptMessage();
        message.setHeaders();
        return message;
    }
    //factory method
    public abstract Message createMessage();
}
