package semicolon.africa.bankingApplication.data.repositories;

import semicolon.africa.bankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    List<Customer> customers = new ArrayList <>();

    @Override
    public Customer save(Customer customer) {
        customer.add(customer);
        return findByCustomerId(customer.getBvn());
    }

    @Override
    public Customer findByCustomerId(String id) {
        for (Customer customer : customers) {
            if(customer.getBvn().equalsIgnoreCase(id)){
            return customer;
        }
    }
    return null;
}
    @Override
    public void delete(Customer customer) {
    customer.remove(customer);
    }

    @Override
    public void delete(String id) {
     Customer customer = findByCustomerId(id);
     delete(customer);
    }

    @Override
    public List<Customer> findALL() {
        return customers;
    }
}
