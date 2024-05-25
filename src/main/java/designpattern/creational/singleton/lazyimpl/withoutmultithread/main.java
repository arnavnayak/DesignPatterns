package designpattern.creational.singleton.lazyimpl.withoutmultithread;

public class main {

    public static void main(String[] args) {

        LazyRegistryIODH lazySihngleton;  // doesnot creates objects unless getInstance is called
        System.out.println("done");

        LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();

        System.out.println(lazyRegistryIODH);
        System.out.println(lazyRegistryIODH2);

        System.out.println(lazyRegistryIODH == lazyRegistryIODH2);
    }
}
