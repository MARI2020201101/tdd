package chapter1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testAccount() throws Exception{
        Account account = new Account(10000);
    }
    @Test
    public void testGetBalance(){
        Account account = new Account(10000);
        int balance = account.getBalance();
        assertEquals(10000,balance);

        Account account2 = new Account(0);
        int balance2 = account2.getBalance();
        assertEquals(0,balance2);
    }
    @Test
    public void testWithdraw(){
        Account account = new Account(1000);
        account.withdraw(100);
        assertEquals(900, account.getBalance());
    }
    @Test
    public void testDeposit(){
        Account account = new Account(1000);
        account.deposit(100);
        assertEquals(1100, account.getBalance());
    }


}
