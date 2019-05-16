package ru.job4j.bank;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class BankTest {

    @Test
    public void addUser() {
        User user = new User("Vasya", "passport");
        Bank bank = new Bank();
        bank.addUser(user);
        assertThat(user, is(bank.getUser(user.getPassport())));
    }

    @Test
    public void deleteUser() {
        User user = new User("Vasya", "passport");
        Bank bank = new Bank();
        bank.addUser(user);
        bank.deleteUser(user);
        assertNull(bank.getUser(user.getPassport()));
    }

    @Test
    public void addAccountToUser() {
        User user = new User("Vasya", "passport");
        Bank bank = new Bank();
        bank.addUser(user);
        Account account = new Account(20000.0d, "requisites");
        List<Account> list = new ArrayList<>();
        list.add(account);
        bank.addAccountToUser(user.getPassport(), account);
        assertThat(list, is(bank.getUserAccounts(user.getPassport())));
    }

    @Test
    public void deleteAccountFromUser() {
        User user = new User("Vasya", "passport");
        Bank bank = new Bank();
        bank.addUser(user);
        Account account = new Account(20000.0d, "requisites");
        List<Account> list = new ArrayList<>();
        bank.addAccountToUser(user.getPassport(), account);
        bank.deleteAccountFromUser(user.getPassport(), account);
        assertThat(bank.getUserAccounts(user.getPassport()), is(list));
    }

    @Test
    public void transferMoney() {
        User user1 = new User("Vasya", "passport1");
        User user2 = new User("Ivan", "passport2");
        Account vasyaAcc = new Account(20000.0d, "requisites1");
        Account ivaAcc = new Account(15000.0d, "requisites2");
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser(user1.getPassport(), vasyaAcc);
        bank.addAccountToUser(user2.getPassport(), ivaAcc);
        boolean result = bank.transferMoney(user1.getPassport(), vasyaAcc.getRequisites(), user2.getPassport(), ivaAcc.getRequisites(), 10000.0d);
        assertTrue(result);
    }
}