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
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int student = sc.nextInt();
        int E=0 ,G = 0,F = 0,P = 0;
        for (int i = 1; i <= student;i++){
            System.out.print("Enter score for student " + i + ": ");
            int score = sc.nextInt();
            if (score >= 80) {
                System.out.println("Excellent");
                E+=1;
            }else if (score>= 60 & score<=79){
                System.out.println("Good");
                G += 1;
            }else if(score >= 50 & score <= 59){
                System.out.println("Fair");
                F += 1;
            }else{
                System.out.println("Poor");
                P += 1;
            }
        }
        System.out.println("Summary:");
        System.out.println("Excellent: " + E);
        System.out.println("Good: " + G);
        System.out.println("Fair: " + F);
        System.out.println("Poor: " + P);
    }
}
