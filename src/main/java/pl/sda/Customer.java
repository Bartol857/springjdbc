package pl.sda;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Customer {

    private int custId;
    private String name;
    private int age;

    public Customer(){

    }

    public Customer(int custId, String name, int age) {
        this.custId = custId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", name='" + name + '\'' + ", age=" + age +'}';
    }
}
