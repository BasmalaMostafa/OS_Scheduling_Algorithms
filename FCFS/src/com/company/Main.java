package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int initial;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the initial head start cylinder ,please:");
        initial=input.nextInt();       //53
        int numOFReq;
        System.out.println("Enter the num of requests ,please:");
        numOFReq=input.nextInt();      //8
        int []FCFS=new int[numOFReq];
        System.out.println("Enter the requests separated by space ,please:");
        for (int i=0;i<numOFReq;i++){
            FCFS[i]=input.nextInt();          //98 183 37 122 14 124 65 67
        }
        FCFS obj=new FCFS(initial,numOFReq,FCFS);
        System.out.println("the mechanism of the FCFS is:");
        obj.mechanism();

    }
}
