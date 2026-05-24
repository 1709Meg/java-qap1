package problem1;

public class TestAccount {
    public static void main(String[] args) {

        Account acct1 = new Account("1", "acct1", 5000);

        Account acct2 = new Account("2", "acct2", 4000);

        System.out.println(acct1.getBalance());
        System.out.println(acct2.getBalance());

        acct1.transferTo(acct2, 1000);

        System.out.println(acct1.getBalance());
        System.out.println(acct2.getBalance());
    }
}
