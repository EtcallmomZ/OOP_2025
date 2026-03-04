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
public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int digit = sc.nextInt();
        sc.nextLine();
        String result = "";
        for (int i = 1; i<= digit; i++){
            System.out.print("Enter digit " + i + ": ");
            String num = sc.nextLine();
            result += num;
          }
         System.out.println("Final Code = " + result);
}
}