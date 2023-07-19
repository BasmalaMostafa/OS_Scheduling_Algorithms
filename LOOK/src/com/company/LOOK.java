package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LOOK {
    int initial;
    int numOfReq;
    int []requests;
    String direction;
    ArrayList<Integer>before=new ArrayList<>();
    ArrayList<Integer>after=new ArrayList<>();
    int sum;

    public LOOK(int init,int num,int []req,String dir){
        this.initial=init;
        this.numOfReq=num;
        this.requests=new int[numOfReq+1];
        this.requests[0]=this.initial;
        for (int i=1;i<numOfReq+1;i++){
            this.requests[i]=req[i-1];
        }
        this.direction=dir;
        sum=0;
    }
    public boolean isZeroDirection(){
        boolean status=true;
        if(this.direction.equals("2WZero")){
            status=true;
        }else if(this.direction.equals("other")){
            status=false;
        }
        return status;
    }
    public void mechanism(){
        for (int i=1;i<requests.length;i++){
            if(requests[i]<initial){
                before.add(requests[i]);
            }else {
                after.add(requests[i]);
            }
        }
        Collections.sort(before,Collections.reverseOrder());

        Collections.sort(after);
        if(isZeroDirection()){
            for (int i=1,j=0;j<before.size();i++,j++){
                requests[i]=before.get(j);
            }
            for (int i=before.size()+1,j=0;j<after.size();i++,j++){
                requests[i]=after.get(j);
            }

            System.out.print("\n"+"[");
            for (int i=0;i<requests.length;i++){
                if(i+1!=requests.length){
                    sum+=Math.abs(requests[i+1]-requests[i]);
                }
                System.out.print(requests[i]);
                System.out.print(",");
            }
            System.out.print("]"+"\n");
            System.out.println("The total head movements="+sum);

        }else {
            for (int i=1,j=0;j<after.size();i++,j++){
                requests[i]=after.get(j);
            }
            for (int i=after.size()+1,j=0;j<before.size();i++,j++){
                requests[i]=before.get(j);
            }

            System.out.print("\n"+"[");
            for (int i=0;i<requests.length;i++){
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
}
