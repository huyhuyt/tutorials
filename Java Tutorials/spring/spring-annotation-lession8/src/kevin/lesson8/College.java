package kevin.lesson8;

import lombok.Setter;

//import org.springframework.stereotype.Component;

//@Component("collegeBean")
@Setter
public class College {
    private Principal principal;

    private Teacher teacher ;
    
    public College(){}
    /* public College(Principal principal){
        this.principal = principal;
    } */
    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("testing this class methods");
       
    }
    
}
