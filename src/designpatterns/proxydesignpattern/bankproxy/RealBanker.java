package proxydesignpattern.bankproxy;

public class RealBanker implements Banker {
    private int balance = 0;

    @Override
    public void deposit(int accountNumber, int amount) {
        balance += amount;
        System.out.println("Deposited amount in account " + accountNumber + ": " + amount);
    }

    @Override
    public int withdraw(int accountNumber, int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in account " + accountNumber);
            return balance;
        }
        balance -= amount;
        System.out.println("Withdrawn amount from account " + accountNumber + ": " + amount);
        return balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
