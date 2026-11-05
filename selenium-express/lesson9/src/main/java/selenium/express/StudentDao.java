package selenium.express;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
    @Value("${db.driver}")
    String mySQLDriver;

    @Value("${db.url}")
    String url;

    @Value("${db.user}")
    String user;

    @Value("${db.passwd}")
    String password;

    public void connectDB(){
        System.out.println("connect mysql...with user " + user);
    }


}
