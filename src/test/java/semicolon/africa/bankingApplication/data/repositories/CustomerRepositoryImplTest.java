package semicolon.africa.bankingApplication.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.africa.bankingApplication.data.models.Bvn;
import semicolon.africa.bankingApplication.data.models.Customer;

import static org.junit.jupiter.api.Assertions.*;


class CustomerRepositoryImplTest {
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp(){
        customerRepository = new CustomerRepositoryImpl();
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void save() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Ileya");
        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
    }

    @Test
    void findByCustomerId() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Ileya");
        Customer savedCustomer = customerRepository.save(customer);
        Customer foundCustomer = customerRepository.findByCustomerId("388403284");
        assertEquals(savedCustomer, foundCustomer);
    }

    @Test
    void delete(){
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Ileya");
        customerRepository.save(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));
        customerRepository.delete(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));
    }

    @Test
    void testDelete() {
        var customer = new Customer();  // var is thesame as Customer and Bvn
        var bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Ileya");
        customerRepository.save(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));

        customerRepository.delete(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));
    }


    @Test
    void findALL() {
        Customer customer = new Customer();  // var is thesame as Customer and Bvn
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Ileya");
        customerRepository.save(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));

        customerRepository.delete(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));

    }
}