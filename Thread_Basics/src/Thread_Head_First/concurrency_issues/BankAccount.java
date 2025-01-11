package Thread_Head_First.concurrency_issues;

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

