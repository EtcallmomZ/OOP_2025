/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;
import java.util.*;
/**
 *
 * @author eiwei
 */
public class seller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items : ");
        int item = sc.nextInt();
        int result = 0;
        for (int i = 1 ; i<=item; i++){
            System.out.print("Enter price for item " + i + ": ");
            int money = sc.nextInt();
            result += money;
        }
        System.out.println("Total = " + result);
        System.out.print("Enter amount paid: ");
        int paid = sc.nextInt();
        int change = paid - result;
        System.out.println("Change = " + change);
    }
}
