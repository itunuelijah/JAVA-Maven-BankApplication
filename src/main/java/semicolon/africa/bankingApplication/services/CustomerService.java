package semicolon.africa.bankingApplication.services;

import semicolon.africa.bankingApplication.data.models.Account;

public interface CustomerService {
    Account creatAccount(String firstName, String lastName);

    Account creatAccount(String firstName, String lastName, String bvn);
}
