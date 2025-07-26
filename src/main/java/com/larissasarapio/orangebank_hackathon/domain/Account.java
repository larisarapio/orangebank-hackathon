package com.larissasarapio.orangebank_hackathon.domain;

import com.larissasarapio.orangebank_hackathon.domain.Transaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Account {
    private String number;
    private float balance;
    private List<Transaction> transactions;


    public void debit(float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Saldo insuficiente.");
        }
        balance -= amount;
    }

    public void credit(float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "  Número conta: '" + number + '\'' +
                ", Saldo: " + balance +
                ", Transações: " + transactions +
                '}';
    }
}
