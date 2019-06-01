package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        CustomerDaoImpl dao = (CustomerDaoImpl) context.getBean("customerDaoImpl");
        List<Customer> customers = dao.findAll();

        for (Customer customer : customers){
            System.out.println(customer);
        }

//        Customer customer = new Customer(5, "nowy użytkownik",52);
//        dao.insert();

//        dao.delete(5);



    }
}
