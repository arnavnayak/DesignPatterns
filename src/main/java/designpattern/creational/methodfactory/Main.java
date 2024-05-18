package designpattern.creational.methodfactory;


public class Main {

    public static void main(String[] args) {
        printMessage(new TextMessageCreator());
         printMessage(new JSONMessageCreator());
    }

    private static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.getMessage();
        System.out.println(msg);
    }
}
