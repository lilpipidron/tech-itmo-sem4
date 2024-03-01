package ru.itmo.accounts;

import ru.itmo.clients.Client;
import ru.itmo.exceptions.TransactionException;

import java.math.BigDecimal;
import java.util.UUID;

public class CreditAccount extends Account {
    public CreditAccount(UUID accountId, Client client) {
        super(accountId, client);
    }

    @Override
    public void withdraw(BigDecimal amount) throws TransactionException {
        super.withdraw(amount);
        balance = balance.subtract(amount);
    }
}
