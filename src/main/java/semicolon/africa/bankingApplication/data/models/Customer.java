package semicolon.africa.bankingApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    private final List<Account> accounts = new ArrayList<>();
    private String bvn;
    private String firstName;
    private String lastName;

    public void add(Customer customer) {
    }

    public void remove(Customer customer) {
    }
}
