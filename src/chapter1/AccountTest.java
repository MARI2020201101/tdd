package chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    private Account account;

    @Test
    public void testAccount() throws Exception{
        setup();
    }

    @Before
    public void setup() {
        account = new Account(10000);
    }

    @Test
    public void testGetBalance(){
        int balance = account.getBalance();
        assertEquals(10000,balance);

        Account account2 = new Account(0);
        int balance2 = account2.getBalance();
        assertEquals(0,balance2);
    }
    @Test
    public void testWithdraw(){
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }
    @Test
    public void testDeposit(){
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }


}
