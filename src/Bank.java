import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bank {
    private ArrayList<Account> accounts; //계좌를 담을 배열
    private int totalAccount = 0;   //총 계좌수

    Bank() {    //Bank가 생성될때
        this.accounts = new ArrayList<Account>();
    }

    //HashMap 활용
    HashMap<Account, String> map = new HashMap<Account, String>();  //계좌가 key이고 이름이 value인 HashMap 생성
    HashMap<String , Account> map2 = new HashMap<String, Account>(); //이름이 key이고 계좌가 value인 HashMap 생성

    public ArrayList<Account> findAccounts(String name) {
        if (map.containsValue(name)) {  //만약 파라미터로 받은 name이 HashMap 의 value에 속하면
            System.out.println("= 해당 소유자명의 계좌정보 =");
            ArrayList<Account> myAccounts = new ArrayList<Account>();   //해당되는 Account를 넣을 배열
            //key가 이름이라 이에 해당하는 value값이 여러개일경우 다 반환해야하기 때문에 배열을 써야한다.
            //key로 get하면 Account가 value로 온다.
            for(Map.Entry<Account, String> my : map.entrySet()) {
                if (my.getValue().equals(name)) {
                    myAccounts.add(my.getKey());
                }
            }
            return myAccounts;
        } else {
            System.out.println("이름에 해당하는 계좌를 찾지못했습니다. 다시 확인해주세요");
            return null;
        }
    }
    //수정!!  accountNo가 없다면 , 없다고 출력
    public Account getAccount(String accountNo) {
        for(Map.Entry<String, Account> my : map2.entrySet()) {
            if (my.getKey().equals(accountNo)) {
                System.out.println("= 해당 계좌번호의 계좌정보 =");
                return my.getValue();
            }
        }
        return null;
    }

    public void getAccounts() {
        System.out.println("=은행에 등록된 모든 계좌를 조회합니다.=");

        Iterator it = accounts.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }


    public void addAccount(String accountNo, String name) {
        accounts.add(new Account(accountNo, name));
        //HashMap에 계좌번호와 value(Account)주소를 지정한후에 totalAccount 증가
        map2.put(accountNo, accounts.get(totalAccount));
        map.put(accounts.get(totalAccount), name);
        totalAccount++;
    }

    public int getTotalAccount() { ;
        return totalAccount;
    }


}
