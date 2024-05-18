package designpattern.creational.methodfactory;

public abstract class Message {

    public abstract String getContent();
    public void encryptMessage(){
        //some encryption logic
    }
    public void setHeaders(){
        //some header setting up
    }

}
