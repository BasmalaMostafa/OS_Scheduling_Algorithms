package com.company;

import java.util.ArrayList;


public class SSTF {
    int []requests;
    int numOfReq;
    int initial;
    ArrayList<Integer>mechanism=new ArrayList<>();
    ArrayList<Integer>work=new ArrayList<>();
    int sum;

    public SSTF(int num,int []req,int initial){
        this.numOfReq=num;
        this.requests=new int[numOfReq+1];
        this.initial=initial;
        this.requests[0]=this.initial;
        for (int i=1;i<numOfReq+1;i++){
            this.requests[i]=req[i-1];
        }
        sum=0;
    }
    public void mechanism(){
        int mini;
        int index=0;
        mechanism.add(initial);
        while (mechanism.size()!=numOfReq+1){
            work=new ArrayList<>();
                for (int m=0;m<requests.length;m++){
                    if(!mechanism.contains(requests[m])) {
                        work.add(requests[m] - initial) ;
                    }
                }

            mini=Math.abs(work.get(0));
            for (int j=0;j<work.size();j++){
                if(mini>Math.abs(work.get(j))){
                    mini=Math.abs(work.get(j));
                    index=j;
                }
            }
            if(mini==Math.abs(work.get(0))){
               index=0;
            }
            initial=work.get(index)+initial;
                mechanism.add(initial);
        }

        System.out.print("\n"+"[");
        for (int i=0;i<mechanism.size();i++){
            if(i+1!=mechanism.size()){
                sum+=Math.abs(mechanism.get(i+1)-mechanism.get(i));
            }
            System.out.print(mechanism.get(i));
            System.out.print(",");
        }
        System.out.print("]"+"\n");
        System.out.println("The total head movements="+sum);

    }

}
