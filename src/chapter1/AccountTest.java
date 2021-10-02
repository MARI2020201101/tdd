package chapter1;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testAccount() throws Exception{
        Account account = new Account(10000);
    }
    @Test
    public void testGetBalance(){
        Account account = new Account(10000);
        int balance = account.getBalance();
        Assert.assertEquals(balance,10000);
    }


    /*public static void main(String[] args) {
        try {
            testAccount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
