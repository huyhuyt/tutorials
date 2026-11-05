package selenium.express;

public class Vodaphone implements Sim{
    @Override
    public void calling(){
        System.out.println("calling from vodaphone");
    }
    @Override
    public void data(){
        System.out.println("browse internet from vodaphone");
    }
    
}
