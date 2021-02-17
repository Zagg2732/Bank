//http://www.java-school.net/java/Javabank-Requirements-analysis#comments
/*
= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]

5500원 인출하셨습니다.
현재 잔액은 394500원 입니다.

= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 394500]

= 거래 내역 =
[거래금액:200000, 잔액:200000원 /2020년08월26일11시53분]
[거래금액:200000, 잔액:400000원 /2020년08월26일11시53분]
[거래금액:5500, 잔액:394500원 /2020년08월26일11시53분]

 */

public class Main {
    public static void main(String[] args) {
        Bank woori = new Bank();

        woori.addAccount("10071", "백");
        woori.addAccount("890113", "택");
        woori.addAccount("0113", "택");
        woori.addAccount("987654321", "두팔");

        System.out.println(woori.getAccounts());
        System.out.println(woori.getAccount("890113"));

        woori.getAccount("890113").deposit(200000);
        woori.getAccount("890113").deposit(200000);

        System.out.println(woori.getAccount("890113"));

        System.out.println(woori.findAccounts("택"));
        woori.getAccount("890113");
        woori.getAccount("890113").withdraw(5500);

        System.out.println(woori.getAccount("890113").getTransactions());

    }
}
