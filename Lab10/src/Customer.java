/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */
import java.util.ArrayList;
public class Customer{
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    
    
    public Customer(){
        this.firstName = "";
        this.lastName = "";
        this.acct = null;
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public boolean equals(Customer c){
        return (this.firstName.equals(c.getFirstName())) && (this.lastName.equals(c.getLastName()));
    }

    @Override
    public String toString() {
        if (acct == null) {
            return firstName +" " + lastName + " doesn’t have account.";
        }
        else{
            return firstName + " " + lastName + " have" + this.numOfAccount + " account(s)";
        }
    }

    
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount ++;
    }
    
    public Account getAccount(int index) {
        return (Account)this.acct.get(index);
    }

    public int getNumOfAccount() {
        return this.acct.size();
    }
    
    
    
    
    
}
