package chapter1;

public class AccountTest {

    public static void testAccount() throws Exception{
        Account account = new Account();
    }
    public static void main(String[] args) {
        try {
            testAccount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
