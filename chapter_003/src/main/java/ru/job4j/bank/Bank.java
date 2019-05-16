package ru.job4j.bank;

import java.util.*;

public class Bank {

    protected Map<User, List<Account>> map = new HashMap<>();

    public void addUser(User user) {
        map.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        map.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : map.entrySet()) {
            if (passport.equals(entry.getKey().getPassport())) {
                entry.getValue().add(account);
                break;
            }
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : map.entrySet()) {
            if (passport.equals(entry.getKey().getPassport())) {
                entry.getValue().remove(account);
                break;
            }
        }
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> result = new ArrayList<>();
        for (Map.Entry<User, List<Account>> entry : map.entrySet()) {
            if (entry.getKey().getPassport().equals(passport) && !entry.getValue().isEmpty()) {
                result = entry.getValue();
                break;
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisites, String dstPassport, String dstRequisites, double amount) {
        boolean result;

        Account giverAccount = findAccount(getUserAccounts(srcPassport), srcRequisites);
        Account receiverAccount = findAccount(getUserAccounts(dstPassport), dstRequisites);

        if (giverAccount == null || receiverAccount == null || giverAccount.getValue() < amount) {
            result = false;
        } else {
            receiverAccount.setValue(receiverAccount.getValue() + amount);
            giverAccount.setValue(giverAccount.getValue() - amount);
            result = true;
        }
        return result;
    }

    private Account findAccount(List<Account> accounts, String requisites) {
        Account result = null;
        for (Account account : accounts) {
            if (account.getRequisites().equals(requisites)) {
                result = account;
                break;
            }
        }
        return result;
    }

    public User getUser(String passport) {
        User user = null;
        for (User u : map.keySet()) {
            if (u.getPassport().equals(passport)) {
                user = u;
            }
        }
        return user;
    }
}
