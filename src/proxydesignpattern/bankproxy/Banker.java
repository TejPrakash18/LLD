package proxydesignpattern.bankproxy;

public interface Banker {
    void deposit(int accountNumber, int amount);
    int withdraw(int accountNumber, int amount);
    int getBalance();
}
