import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String transactionDate;
    private String getTransactionTime;
    private String kind;
    private long amount;
    private long balance;

    //거래내역
    public Transaction(String kind, long amount, long balance) {

        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {

        Date histroy = new Date();
        SimpleDateFormat transactionHistory = new SimpleDateFormat("yyyy년 MMMdd일 HH시 MM분");
        this.transactionDate = transactionHistory.format(histroy);

        return "거래 금액:"+amount+", 잔액:"+this.balance+"원/"+transactionDate;
    }
}