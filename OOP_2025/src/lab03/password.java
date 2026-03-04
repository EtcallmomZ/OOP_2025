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
public class password {
    public static void main(String[] args) {
        String password = "PASS2025";
        String user;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter password: ");
            user = sc.nextLine();
            if (password.equals(user)){
                System.out.println("Access granted.");
                break;
            }else{
                System.out.println("Try again.");
            }
        }
            
    }
}
