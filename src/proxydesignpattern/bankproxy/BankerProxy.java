package proxydesignpattern.bankproxy;

public class BankerProxy implements Banker {
    private RealBanker realBanker;

    private void initializeBanker() {
        if (realBanker == null) {
            realBanker = new RealBanker();
        }
    }

    @Override
    public void deposit(int accountNumber, int amount) {
        initializeBanker();
        realBanker.deposit(accountNumber, amount);
    }

    @Override
    public int withdraw(int accountNumber, int amount) {
        initializeBanker();
        return realBanker.withdraw(accountNumber, amount);
    }

    @Override
    public int getBalance() {
        initializeBanker();
        return realBanker.getBalance();
    }
}
