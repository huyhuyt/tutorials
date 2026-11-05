package selenium.express;

public class Airtel implements Sim{
    @Override
    public void calling(){
        System.out.println("calling from airtel");
    }
    @Override
    public void data(){
        System.out.println("browsing internet use data from airtel");
    }

    Airtel(){
        System.out.println("airTell object is created");
    }
}
