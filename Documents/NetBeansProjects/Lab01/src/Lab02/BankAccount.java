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
public class BankAccount {
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Input your money : ");
         double money = sc.nextDouble();
         System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
         char type = sc.next().charAt(0);
         double percent;
         if (type == 'A' | type == 'C'){
             percent = money * 0.015;
             money += percent;
         }else if (type == 'B'){
             percent = money * 0.02;
             money += percent;
         }else if (type == 'X'){
             percent = money * 0.05;
             money += percent;
         }
        int result = (int)money;
        System.out.println("Your total money in one year = " + result);
}
}
