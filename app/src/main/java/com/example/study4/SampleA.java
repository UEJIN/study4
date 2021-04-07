package com.example.study4;

public class SampleA {

    int iDispNum;
    int A;
    int B;

    public SampleA(int iData){

        this.iDispNum = iData;
        this.A = iData + 5;
        this.B = iData + 1;

    }

    String MakeString(){

        String strRet = "";
        strRet = "Number:" + String.valueOf(this.iDispNum);


        return strRet;
    }
}
