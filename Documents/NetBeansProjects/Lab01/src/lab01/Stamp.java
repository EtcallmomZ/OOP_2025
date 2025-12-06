package lab01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author eiwei
 */
public class Stamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int stamp = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Total price : ");
        var num = sc.nextDouble();
        double result = num / stamp;
        int myInt = (int)result;
        System.out.print("You got " + myInt + " stamp(s)");
    }
    
}
