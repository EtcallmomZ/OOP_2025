/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;
import java.util.*;
/**
 *
 * @author eiwei
 */
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int workDays = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int absentDays = sc.nextInt();
        System.out.print("Please insert body weight : ");
        int bodyWeight = sc.nextInt();
        int salary = 0;
        int Bonus = 0;
        if (age >= 21 & age <= 30 ){
            salary = (workDays * 300) - (absentDays *50);
        }else if (age >= 31 & age <= 40){
            salary = (workDays * 500) - (absentDays *50);
        }else if (age >= 41 & age <= 51){
            salary = (workDays * 1000) - (absentDays *25);
        }else if (age >= 51 & age<=60){
            salary = (workDays * 3000);
        }
        if (bodyWeight >= 10 & bodyWeight <= 60){
           Bonus = salary + 5000;
        }else if (bodyWeight >= 61 & bodyWeight <= 90){
            Bonus = salary + (5000-((bodyWeight-60)*10));
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + Bonus + " Baht");
        
    }
}