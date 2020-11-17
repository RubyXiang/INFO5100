import java.util.Random;

public class BankAccount {
    /**
     * Write a BankAccount class which implements:
     * deposit(int amount)
     * withdraw(int amount)
     * getBalance()
     * Write a main function to simulate the bank system.
     * Use multi threading to randomly deposit or withdraw random amount.
     */

    private int balance = 10000;

    public synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit：" + amount);
    }

    public synchronized void withdraw(int amount) {

        if (balance - amount < 0) {
            System.out.println("Balance Is Not Enough!");
        }
        balance = balance - amount;
        System.out.println("Withdraw：" + amount);

    }

    public synchronized int getBalance() {
        return this.balance;
    }

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        Random random = new Random();
        int operateTimes = 4;
        for (int i = 0; i < operateTimes; i++) {

            Thread thread1 = new Thread(() -> {
                bankAccount.deposit(random.nextInt(bankAccount.balance));
                System.out.println("After deposit Balance: " + bankAccount.getBalance());

            });

            Thread thread2 = new Thread(() -> {
                bankAccount.withdraw(random.nextInt(bankAccount.balance));
                System.out.println("After withdraw Balance: " + bankAccount.getBalance());
            });
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        }
    }
}
