package chap1_3;

public class BankAccount {
    // 속성
    private String accountNumber;
    private String owner;
    private double balance;

    // 생성자
    public BankAccount(String accountNumber, String owner, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
    }

    // 돈을 입금하는 메서드
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔고: " + balance + "원");
    }

    // 돈을 인출하는 메서드
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 인출되었습니다. 현재 잔고: " + balance + "원");
        } else {
            System.out.println("잔액 부족. 현재 잔고: " + balance + "원");
        }
    }

    // 현재 잔고를 출력하는 메서드
    public void displayBalance() {
        System.out.println("현재 잔고: " + balance + "원");
    }

    // main 메서드
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123-456-789", "홍길동", 100000);
        account.displayBalance();
        account.deposit(50000);
        account.withdraw(30000);
        account.withdraw(150000);
        account.displayBalance();
    }
}