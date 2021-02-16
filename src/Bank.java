import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int totalAccount = 0;

    //HashMap 활용
    HashMap<Account, String> map = new HashMap<Account, String>();
    HashMap<String , Account> map2 = new HashMap<String, Account>();

    public ArrayList<Account> findAccounts(String name) {
        if (map.containsValue(name)) {
            System.out.println("= 해당 소유자명의 계좌정보 =");
            ArrayList<Account> myAccounts = new ArrayList<Account>();
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

    public Account getAccount(String accountNo) {
        for(Map.Entry<String, Account> my : map2.entrySet()) {
            if (my.getKey().equals(accountNo)) {
                return my.getValue();
            }
        }
        return null;
    }

    public ArrayList<Account> getAccounts() {
        System.out.println("=은행에 등록된 모든 계좌를 조회합니다.=");
        return accounts;
    }


    public void addAccount(String accountNo, String name) {
        accounts.add(new Account(accountNo, name));
        //HashMap에 계좌번호와 value(Account)주소를 지정한후에 totalAccount 증가
        map2.put(accountNo, accounts.get(totalAccount));
        map.put(accounts.get(totalAccount), name);
        totalAccount++;
    }

    public int getTotalAccount() {
        System.out.print("해당 은행의 전체 계좌 수 : " + totalAccount + "\n");
        return totalAccount;
    }


}
