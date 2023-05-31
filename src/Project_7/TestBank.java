/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_7;

/**
 *
 * @author ACER
 */
public class TestBank {
    public static void main(String[] args) {
        // Account a1 =new Account("Adhit",12345,500000);
        Account a2 = new Account();
        Account a3 = new Account();
        
        a2.setAccountName("Adhit");
        a2.setAccountNum(2101092035);
        a2.setBalance(50000);
        
        a3.setAccountName("Kurniawan");
        a3.setAccountNum(12345987);
        a3.setBalance(100000);
        
        a2.print();
        a3.print();
        
        
    }
}
