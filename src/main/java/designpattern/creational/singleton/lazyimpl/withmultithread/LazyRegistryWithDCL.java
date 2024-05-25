package designpattern.creational.singleton.lazyimpl.withmultithread;
// Lazy initiation with Double check lock(DCL)
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){

    }

    private static volatile LazyRegistryWithDCL INSTANCE;  // to indicate the threads that they should not use the cached version of INSTANCE value
                                                            // volatile forces value read or write from main memory instead of cache
    public static  LazyRegistryWithDCL getInstance(){
        if(INSTANCE == null){
            synchronized (LazyRegistryWithDCL.class) { //we  need to make sure it is thread safe hence synchronized
                if(INSTANCE==null) {  //double check locking for second instance is really null then only create another
                     INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
