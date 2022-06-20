package com.uas.prakrplbo;

public class MathExpression {

    public int TriplePythagoras(int x, int y, int z){
        if(((x*x)+(y*y))==(z*z)){
            return 1;
        }
        else {
            return -1;
        }
    }

    public int pangkat(int x, int y){
        int count = 1;
        for(int i=0; i<y; i++){
            count*=x;
        }
        return count;
    }

}
