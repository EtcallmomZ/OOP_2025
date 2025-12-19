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
public class alpha_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        String sum = "";
        while (true){
            System.out.print("Enter a character: ");
            char alpha = sc.next().charAt(0);
            
            if (alpha == 'z'){
                break;
            }
            if (alpha >= 'a' & alpha <= 'y'){
                sum += alpha;
                if ("aeiou".indexOf(alpha) == -1){
                    result += alpha;
                }
            }
           else{
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
           }
            
        }
        System.out.println("All characters entered: " + sum);
        System.out.println("Consonants only: " + result);
}
