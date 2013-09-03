import com.declerk.bank.AccountFactory;
import com.declerk.bank.BalanceException;
import com.declerk.bank.Banking;


public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Banking sav = AccountFactory.createAccount("Polo","Savings");
		try {
			sav.summary();
			sav.deposit(50);
			sav.withdraw(30);
			sav.withdraw(2);
			sav.summary();
			sav.deposit(2);
			sav.deposit(5);
			sav.statement();
			System.gc();
			Banking test = AccountFactory.createAccount("John","Checking");
			test.summary();
			test.deposit(30);
			test.withdraw(30);
			test.withdraw(70);
			test.withdraw(70);
			test.withdraw(90);
			test.summary();
			test.statement();
		} catch (BalanceException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
