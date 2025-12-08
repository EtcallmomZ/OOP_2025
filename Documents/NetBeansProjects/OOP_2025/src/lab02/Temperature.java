/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;
import java.util.*;
/**
 *
 * @author eiwei
 */
public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°C) : ");
        double temp = sc.nextDouble();
        System.out.print("Enter humidity (%) : ");
        int percent = sc.nextInt();
       
        if (temp > 37.5){
            System.out.println("Warning: High temperature!");
        }else{
            System.out.println("Temperature normal.");
        }
        
        if (percent > 80){
            System.out.println("Humidity is too high.");
        }else{
            System.out.println("Humidity is acceptable.");
        }
    }
}