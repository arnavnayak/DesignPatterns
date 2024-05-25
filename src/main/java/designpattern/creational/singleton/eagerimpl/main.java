package designpattern.creational.singleton.eagerimpl;

public class main {

    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();

        System.out.println(registry);
        System.out.println(registry2);

        System.out.println(registry == registry2);
    }
}
