package semicolon.africa.bankingApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Bank {
    private final String id;
    private List<Account> accounts = new ArrayList<>();
    private String name;
}
