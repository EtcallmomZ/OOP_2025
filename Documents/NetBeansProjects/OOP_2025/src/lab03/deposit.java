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
public class deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0 ,count = 0;
        while (money < 1000){
            System.out.print("Enter deposit amount: ");
            int d = sc.nextInt();
            money += d;
            count += 1;
        }
        System.out.println("Target reached!");
        System.out.println("Total amount saved = " + money);
        System.out.println("Number of deposits = " + count);
    }
}
