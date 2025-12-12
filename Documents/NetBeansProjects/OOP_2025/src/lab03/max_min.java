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
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0 , min = 0 , round = 1;
        while (true){
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            if (round == 1){
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            round++;
        }
        if (round >1){
           System.out.println("Maximum = " + max);
           System.out.println("Minimum = " + min);
        }else{
            System.out.println("No numbers were entered.");
        }
    }
}
