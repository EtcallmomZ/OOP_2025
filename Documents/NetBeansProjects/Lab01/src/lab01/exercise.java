package lab01;

import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */
public class exercise {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your exercise time 1 : ");
        int myNum_1 = sc.nextInt();
        System.out.print("Enter your exercise time 2 : ");
        int myNum_2 = sc.nextInt();
        int result = myNum_1 + myNum_2;
        int miniute = result / 60;
        int hour = miniute / 3600;
        int sec = result % 60;
        System.out.print("It is " + hour +  " hours " + miniute + " minutes " + sec + " seconds. ");
        
     
     
} }
