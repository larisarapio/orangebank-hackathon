package com.larissasarapio.orangebank_hackathon.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private List<Account> accounts = new ArrayList<>();


    public Object verifyUser(User user) {
        if (user.)
    }
}


