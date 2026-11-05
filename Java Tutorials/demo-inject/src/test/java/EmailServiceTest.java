import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class EmailServiceTest {
    @Test
    @Tag("onecicd")
    public void test_01(){
        System.out.println("execute test 01");
    }

    @Test
    @Tag("onecicd")
    public void test_02(){
        System.out.println("execute test 02");
    }

    @Test
    @Tag("onecicd")
    public void test_03(){
        System.out.println("execute test 03");
    }

    @Test
    public void test_04(){
        System.out.println("execute test 04");
    }
}
