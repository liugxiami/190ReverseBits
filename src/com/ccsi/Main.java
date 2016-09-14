package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int n=43261596;
        System.out.println(reverseBits(n));
    }
    //Reverse bits of a given 32 bits unsigned integer.
    public static int reverseBits(int n){
        int result=0;
        for (int i = 0; i < 32; i++) {
            int temp=(n&1);                      //最右边一位对1取与
            int reverseTemp=temp<<(31-i);         //将temp左移31-i位
            result|=reverseTemp;                  //将reverseTemp保存到result中去
            n>>>=1;                               //n向右移一位，共移31次
        }
        return result;
    }
}
