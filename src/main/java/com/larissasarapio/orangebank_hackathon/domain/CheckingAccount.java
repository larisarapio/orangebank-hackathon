package com.larissasarapio.orangebank_hackathon.domain;

import com.larissasarapio.orangebank_hackathon.domain.Transaction.Transaction;
import com.larissasarapio.orangebank_hackathon.domain.Transaction.TransactionEnum;

import java.time.LocalDateTime;
import java.util.List;

public class CheckingAccount extends Account {

    public CheckingAccount(String number, float balance, List<Transaction> transactions) {
        super(number, balance, transactions);
    }

    public void withdraw(float amount) {
        this.debit(amount);

        Transaction transaction = new Transaction(
                LocalDateTime.now(),
                amount,
                TransactionEnum.INTERNAL,
                this,
                null
        );
        System.out.println("Suas transação foi concuida, aqui os dados: " + transaction);
    }

    public void deposit(float amount) {
        this.credit(amount);

        Transaction transaction = new Transaction(
                LocalDateTime.now(),
                amount,
                TransactionEnum.INTERNAL,
                this,
                null
        );

        System.out.println("Seu deposito foi concuida, aqui os dados: " + transaction);
    }

    public void transferToOtherUser(CheckingAccount destination,float amount){}
}
