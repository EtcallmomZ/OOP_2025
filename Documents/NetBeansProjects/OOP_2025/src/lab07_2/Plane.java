/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07_2;

/**
 *
 * @author eiwei
 */
public class Plane extends Vehicle implements Flyable{
    private String airline;
    private String boeing;
    private static final int MAX_FLYER =2;
    
    public Plane(){
    }
    
    public Plane(double fuel,String airline,String boeing){
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }
    
    public void fly(){
    }
    
    @Override
    public void honk(){
    }
    
    public void landing(){
    }
    
    public void startEngine(){
    }
    
    @Override
    public void stopEngine(){
    }
    
    public void takeOff(){
    }
    
    
    
    
    
}
