package mySpringDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{

    String qualification;
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public void assist(){
        System.out.println("Doc is assisting");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
