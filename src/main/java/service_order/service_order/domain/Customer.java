package service_order.service_order.domain;

public class Customer extends Person {

    public Customer() {
    }

    public Customer(Integer id, String name, String cpf, String phone) {
        super(id, name, cpf, phone);
    }
    
}
