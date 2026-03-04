/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */

public class collectionAPI{
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    
    
    public collectionAPI(){
        this.firstName = "";
        this.lastName = "";
        this.acct = null;
    }
    
    public collectionAPI(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
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
        // if statement is checking that array not full
        if (numOfAccount < this.acct.length) {
            this.acct[numOfAccount] = acct; // put object into index(numOfAccount)of array(acct)
            numOfAccount++; // increase index of array
        }
    }
    
    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return this.numOfAccount;
    }
    
    
    
    
    
}
