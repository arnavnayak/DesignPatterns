package designpattern.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        SwordsMan swordsMan1 = new SwordsMan();
        swordsMan1.move(20,30);
        swordsMan1.attack();
        SwordsMan swordsMan2 = null;
        try {
             swordsMan2 = (SwordsMan) swordsMan1.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        SwordsMan swordsMan3 = (SwordsMan) swordsMan1.clone();
        swordsMan3.move(50,60);
        swordsMan3.attack();



        General general = new General();
        try {
            general.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("swordsMan1 : "+swordsMan1 + "position : "+swordsMan1.getPosition());
        System.out.println("cloned swordsMan2 : "+swordsMan2 + "position : "+swordsMan2.getPosition());
        System.out.println("cloned swordsMan3 : "+swordsMan3 + "position : "+swordsMan3.getPosition());
        swordsMan3.reset();
        swordsMan3.initialize();
        System.out.println("cloned swordsMan3 : "+swordsMan3 + "position : "+swordsMan3.getPosition());
    }
}
