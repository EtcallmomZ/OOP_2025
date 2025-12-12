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
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0 , even = 0;
        while (true){
            int number = sc.nextInt();
            if (number == -1){
                break;
            }
            if (number%2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
