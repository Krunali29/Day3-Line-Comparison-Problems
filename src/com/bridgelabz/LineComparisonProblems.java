package com.bridgelabz;
//Welcome to Line Comparison Computation Program
//UC 4 Add Compare To Method By Using OOPS Concept
import java.util.Scanner;
import java.lang.Math;
public class LineComparisonProblems
{
    public static void compareLine()
    {
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        double x4;
        double y4;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter x1");
        x1 = reader.nextDouble();
        System.out.println("Enter y1");
        y1 = reader.nextDouble();
        System.out.println("Enter x2");
        x2 = reader.nextDouble();
        System.out.println("Enter y2");
        y2 = reader.nextDouble();
        System.out.println("Enter x3");
        x3 = reader.nextDouble();
        System.out.println("Enter y3");
        y3 = reader.nextDouble();
        System.out.println("Enter x4");
        x4 = reader.nextDouble();
        System.out.println("Enter y4");
        y4 = reader.nextDouble();

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        String str1 = Double.toString(length1);
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        String str2 = Double.toString(length2);

        System.out.println(str2.compareTo(str1));
    }
    public static void main(String[] args)
    {
        compareLine();
    }
}
