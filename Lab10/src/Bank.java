/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */
public class Bank{
    private Account acct[];
    private int numAcct;
    
    public Bank (){
        acct = new Account[10];
    }
    
    public void addAccount(Account ac){
        // if statement is checking that array not full
        if (numAcct < this.acct.length) {
            this.acct[numAcct] = ac; // put object into index(numAcct)of array(acct)
            numAcct++; // increase index of array
        }
        
    }

    public Account getAcct(int index) {
        return acct[index]; // return object of index(numAcct) in array (acct)
    }

    public int getNumAcct() {
        return this.numAcct;
    }
    
    
}
