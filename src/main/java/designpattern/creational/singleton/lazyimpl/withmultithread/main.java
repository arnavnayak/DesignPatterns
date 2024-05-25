package designpattern.creational.singleton.lazyimpl.withmultithread;

public class main {

    public static void main(String[] args) {
        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();

        System.out.println(lazyRegistryWithDCL);
        System.out.println(lazyRegistryWithDCL2);

        System.out.println(lazyRegistryWithDCL == lazyRegistryWithDCL2);
    }
}
