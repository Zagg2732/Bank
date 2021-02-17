//http://www.java-school.net/java/Javabank-Requirements-analysis#comments

public class Main {
    public static void main(String[] args) {
        Bank woori = new Bank();

        woori.addAccount("10071", "백");
        woori.addAccount("890113", "택");
        woori.addAccount("0113", "택");
        woori.addAccount("987654321", "두팔");

        woori.getAccounts();
        System.out.println();

        System.out.println(woori.getAccount("890113"));
        System.out.println();
        woori.getAccount("890113").deposit(200000);
        System.out.println();
        System.out.println(woori.getAccount("890113"));


        System.out.println();
        woori.getAccount("890113").deposit(200000);
        System.out.println(woori.getAccount("890113"));

        System.out.println();
        System.out.println(woori.getAccount("10071"));
        System.out.println();

        System.out.println(woori.findAccounts("택"));
        System.out.println();

        woori.getAccount("890113").withdraw(5500);
        System.out.println();
        System.out.println(woori.getAccount("890113"));

        woori.getAccount("890113").getTransactions();

    }
}
