package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hospital hospital = (Hospital) context.getBean("hospital");
        hospital.fetchDeptInfo();
        hospital.fetchDoctor();
        hospital.makeBill();
    }
}
