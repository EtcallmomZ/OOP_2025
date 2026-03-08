/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */

import java.io.*; 
public class student implements Serializable{
    private String name;
    private int ID;
    private int money;
    
    public student(){
        this.name = "";
        this.ID = 0;
        this.money = 0;
        
    }
    
    public student(String name,int ID , int money){
        this.name = name;
        this.ID = ID;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
}
