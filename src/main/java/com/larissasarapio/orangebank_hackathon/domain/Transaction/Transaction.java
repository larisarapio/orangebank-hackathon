package com.larissasarapio.orangebank_hackathon.domain.Transaction;

import com.larissasarapio.orangebank_hackathon.domain.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private LocalDateTime dateTime;
    private float amount;
    private TransactionEnum type;
    private Account source;
    private Account destination;

}
