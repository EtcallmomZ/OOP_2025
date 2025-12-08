package lab01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */
public class SolutionFinder {
    public static void main (String [] args) {
        double a = 4 , b = 8 ,c =3;
        double myFact = Math.pow(b,2) - (4*a*c);
        double x_1 = (-b + Math.sqrt(myFact)) / (2*a);
        double x_2 = (-b - Math.sqrt(myFact)) / (2*a);
        System.out.println(x_1);
        System.out.println(x_2);
    }
}