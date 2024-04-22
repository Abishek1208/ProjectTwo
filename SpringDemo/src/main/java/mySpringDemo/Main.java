package mySpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        Doctor doc1 = context.getBean(Doctor.class);
        doc1.setQualification("MBBS");
        System.out.println(doc1);

        Doctor doc2 = context.getBean(Doctor.class);
        System.out.println(doc2);
    }
}