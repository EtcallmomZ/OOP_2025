/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author eiwei
 */
public class CircleArea {
    public static void main (String [] args)
    {
      Scanner input = new Scanner(System.in);
      double radius = input.nextDouble();
      double area = Math.PI*Math.pow(radius,2);
      System.out.println(area);
}
}
