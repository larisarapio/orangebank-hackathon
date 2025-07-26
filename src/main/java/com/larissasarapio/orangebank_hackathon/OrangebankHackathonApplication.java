package com.larissasarapio.orangebank_hackathon;

import com.larissasarapio.orangebank_hackathon.domain.Account;
import com.larissasarapio.orangebank_hackathon.domain.CheckingAccount;
import com.larissasarapio.orangebank_hackathon.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class OrangebankHackathonApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangebankHackathonApplication.class, args);

		User user = new User("001", "Larissa", "000.000.001.22", "larissa@ymail.com", "12345", new ArrayList<>());
		CheckingAccount account = new CheckingAccount("12345", 1000.0f, new ArrayList<>());
		user.getAccounts().add(account);
		account.withdraw(100);
		System.out.println("Seu saldo atual é: " + account.getBalance());
		//conta 1

		User user1 = new User("001", "Larissa", "000.000.001.22", "larissa@ymail.com", "12345", new ArrayList<>());
		CheckingAccount account1 = new CheckingAccount("12345", 1000.0f, new ArrayList<>());
		user.getAccounts().add(account);
		account.withdraw(100);
		System.out.println("Seu saldo atual é: " + account.getBalance());
		//conta 2


		//ajustar exceção personalizada.

	}

}
