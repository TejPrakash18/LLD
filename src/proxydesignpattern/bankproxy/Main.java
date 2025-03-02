package proxydesignpattern.bankproxy;

public class Main {
    public static void main(String[] args) {
        Banker banker = new BankerProxy();

        banker.deposit(902744010, 1200);
        System.out.println("Balance after deposit: " + banker.getBalance());

        int remainingBalance = banker.withdraw(902744010, 100);
        System.out.println("Remaining balance: " + remainingBalance);
    }
}
