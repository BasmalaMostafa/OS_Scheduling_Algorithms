package com.company;

public class FCFS {
    int initial;
    int numOfReq;
    int []requests;
    int sum;

    public FCFS(int init,int numOfReq,int []req){
        this.initial=init;
        this.numOfReq=numOfReq;
        this.requests=new int[numOfReq+1];
        this.requests[0]=this.initial;
        for (int i=1;i<numOfReq+1;i++){
            this.requests[i]=req[i-1];
        }
        sum=0;
    }
    public void mechanism(){
        System.out.print("\n"+"[");
        for(int i=0;i<requests.length;i++){
            if(i+1!=requests.length){
                sum+=Math.abs(requests[i+1]-requests[i]);
            }
            System.out.print(requests[i]);
            System.out.print(",");
        }
        System.out.print("]"+"\n");
        System.out.println("The total head movements="+sum);
    }
}
