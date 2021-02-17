import java.util.Calendar;

public class Transaction {
    private String transactionDate;
    private String getTransactionTime;
    private String kind;
    private long amount;
    private long balance;

    //거래내역
    public Transaction(String kind, long amount) {
        this.transactionDate = "날짜 : " + Calendar.DATE;
        this.getTransactionTime = "시간 : " + Calendar.AM_PM;
        this.kind = kind;
        this.amount = amount;
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "거래내역 {" +
                "거래일 = '" + transactionDate + '\'' +
                ", 거래시간 = '" + getTransactionTime + '\'' +
                ", 구분 = '" + kind + '\'' +
                ", 금액 = " + amount +
                ", 잔고 =" + balance +
                '}';
    }
}
