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
            if ("aeiou".indexOf(alpha) == -1 & Character.isDigit(alpha) == false){
                result += alpha;
            }
            if (Character.isDigit(alpha)){
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }else{
                sum += alpha;
            }
            
        }
        System.out.println("All characters entered: " + sum);
        System.out.println("Consonants only: " + result);
        
        
    }
}
