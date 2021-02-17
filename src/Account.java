import java.util.ArrayList;

public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private ArrayList<Transaction> transactions; //거래내역


    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
        this.transactions = new ArrayList<Transaction>();
    }

    //잔고return
    public long getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    //입금기능. 입출금시 Transaction 리스트에 기록이 들어가야함
    public void deposit(long amount) {
        this.balance += amount;
        transactions.add(new Transaction("입금", amount, balance));
        System.out.printf("%d원 입금하셨습니다.\n현재 잔액은 %d원 입니다.\n", amount, balance);
    }

    //출금기능. 입출금시 Transaction 리스트에 기록이 들어가야함
    public void withdraw(long amount) {
        //잔액보다 많이 출금할경우 출금막음
        if (this.balance < amount) {
            System.out.printf("잔액이 모자라 출금할 수 없습니다. 잔액 : %d원, 출금시도금액 : %d원\n", balance, amount);
            return;
        }
        this.balance -= amount;
        transactions.add(new Transaction("출금", amount, balance));
        System.out.printf("%d원 인출하셨습니다.\n현재 잔액은 %d원 입니다.\n", amount, balance);
    }

    @Override
    public String toString() {
        return "[계좌번호 = '" + accountNo + '\'' +
                ", 이름 = '" + name + '\'' +
                ", 잔액 =" + balance +
                "]";
    }
}
