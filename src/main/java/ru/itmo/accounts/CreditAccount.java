package ru.itmo.accounts;

import ru.itmo.clients.Client;
import ru.itmo.clients.ClientStatus;
import ru.itmo.exceptions.TransactionException;

import java.math.BigDecimal;
import java.util.UUID;

public class CreditAccount extends Account {
    public CreditAccount(UUID accountId, Client client) {
        super(accountId, client);
    }

    @Override
    public void withdraw(BigDecimal amount) throws TransactionException {
        if (client.getStatus() == ClientStatus.Dubious && client.getBank().getAccountRestrictions().compareTo(amount) < 0)
            throw new TransactionException("The withdrawal amount exceeds the allowable amount for a doubtful account");
        if (amount.compareTo(new BigDecimal(0)) < 0)
            throw new TransactionException("You cannot withdrawal less than 0 into your account");
        balance = balance.subtract(amount);
    }
}
