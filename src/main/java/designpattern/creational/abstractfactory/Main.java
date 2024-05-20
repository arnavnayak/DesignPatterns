package designpattern.creational.abstractfactory;

public class Main {

    private ResourceFactory factory;

    public Main(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createCloudServer(Instance.Capacity capacity,int storageInMBs){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageInMBs);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Main awsClient = new Main(new AWSResourceFactory());
        Instance i1 = awsClient.createCloudServer(Instance.Capacity.micro,2048);
        i1.start();
        i1.stop();

        System.out.println("*********************another instance*********************************");
        Main googleClient = new Main(new GoogleCloudResourceFactory());
        i1 = googleClient.createCloudServer(Instance.Capacity.large,12048);
        i1.start();
        i1.stop();
    }
}
