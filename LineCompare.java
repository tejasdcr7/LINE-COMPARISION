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


double length= Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println(length);

    }
}
