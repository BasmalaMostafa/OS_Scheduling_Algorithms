package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int initial;
        int numOFReq;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the initial head start cylinder ,please:");
        initial=input.nextInt();       //53
        System.out.println("Enter the num of requests ,please:");
        numOFReq=input.nextInt();      //8
        int []LOOK=new int[numOFReq];
        System.out.println("Enter the requests separated by space ,please:");
        for (int i=0;i<numOFReq;i++){
            LOOK[i]=input.nextInt();          //98 183 37 122 14 124 65 67
        }
        String direction="";
        System.out.println("Enter the direction (2WZero/other),please:");
        direction=input.next();
        LOOK obj=new LOOK(initial,numOFReq,LOOK,direction);
        System.out.println("the mechanism of the LOOK is:");
        obj.mechanism();
        int choice=0;
        while (true) {
        System.out.println("\n"+"1-Enter other direction if U want");
        System.out.println("2-Exit");
        choice=input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the direction (2WZero/other),please:");
                direction = input.next();
                obj = new LOOK(initial, numOFReq, LOOK, direction);
                System.out.println("the mechanism of this direction is:");
                obj.mechanism();
            } else if (choice == 2) {
                System.exit(0);
            }
        }

    }
}
