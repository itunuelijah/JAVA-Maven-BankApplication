package semicolon.africa.bankingApplication.data.models;

import lombok.*;

import java.math.BigDecimal;

@Data // for all just like .*
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Account {

    private final BigDecimal balance = BigDecimal.ZERO;
    //@Getter if you want to use them one by one
    private String customerId;
//    @Getter
//    @Setter
    private String number;
    private AccountType type;
}
