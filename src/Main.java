//http://www.java-school.net/java/Javabank-Requirements-analysis#comments

public class Main {
    public static void main(String[] args) {
        Bank woori = new Bank();

        woori.addAccount("0001", "이승준");
        woori.addAccount("0002", "이승준");
        woori.addAccount("0003", "이승준");
        woori.addAccount("0004", "김명환");
        woori.addAccount("0005", "김명환");

        //입출금 테스트
        woori.getAccount("0001").deposit(2000);
        woori.getAccount("0001").withdraw(1000);
        woori.getAccount("0001").withdraw(4000);


        //모든 계좌 조회
        System.out.println(woori.getAccounts());

        woori.getTotalAccount();
        System.out.println(woori.findAccounts("이승준"));
        System.out.println(woori.findAccounts("이준"));
        System.out.println(woori.findAccounts("김명환"));


        System.out.println(woori.getAccount("0003"));

        Bank gukmin = new Bank();

        gukmin.getTotalAccount(); //0
        //계좌만들기
        gukmin.addAccount("0001", "이순신");
        gukmin.addAccount("0002", "이순신");
        gukmin.addAccount("0002", "이순신");
        gukmin.addAccount("0003", "이순신");
        gukmin.addAccount("0023", "심란해");
        gukmin.addAccount("0443", "심심해");
        gukmin.getTotalAccount();
        System.out.println(gukmin.findAccounts("이순신"));
        gukmin.findAccounts("이승준");

    }
}
