package semicolon.africa.bankingApplication.services;

import semicolon.africa.bankingApplication.data.models.Account;
import semicolon.africa.bankingApplication.data.repositories.CustomerRepository;
import semicolon.africa.bankingApplication.data.repositories.CustomerRepositoryImpl;

public class CustomerServiceImply implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public Account creatAccount(String firstName, String lastName) {
        return null;
    }

    @Override
    public Account creatAccount(String firstName, String lastName, String bvn) {
        return null;
    }
}
