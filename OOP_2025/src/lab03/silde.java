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
public class silde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int round = sc.nextInt();
        String result = "";
        for (int i = 1 ; i <= round ; i++){
            if ( i % 5 == 0) {
                result += "/";
            }else{
                result += "|";
            }
        }
        System.out.println(result);
    }
}
