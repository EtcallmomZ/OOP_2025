/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07_2;

/**
 *
 * @author eiwei
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public Vehicle(){
        
    }
    
    public Vehicle(double fuel){
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public void addFuel(double fuel){
    }
    
    public abstract void honk();
    
    
}
