package com.line.sc;
import java.util.Scanner;

public class LineCompare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x1 co-ordinate");
        int x1 =sc.nextInt();
        System.out.println("enter y1 co-ordinate");
        int y1 =sc.nextInt();
        System.out.println("enter x2 co-ordinate");
        int x2 =sc.nextInt();
        System.out.println("enter y2 co-ordinate");
        int y2 =sc.nextInt();


double line1= Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println(line1);

        System.out.println("enter x3 co-ordinate");
        int x3 =sc.nextInt();
        System.out.println("enter y3 co-ordinate");
        int y3 =sc.nextInt();
        System.out.println("enter x4 co-ordinate");
        int x4 =sc.nextInt();
        System.out.println("enter y4 co-ordinate");
        int y4 =sc.nextInt();

        double line2= Math.sqrt(x4-x3)*(x4-x3)+(y4-y3)*(y4-y3);
        System.out.println(line2);

        if (line1==line2)
            System.out.println("both lines are equal");

        else if (line1>line2)
            System.out.println("line 1 is greater than line 2");

            else
                System.out.println("line 1 is lesser than line 2");

            }

        }


