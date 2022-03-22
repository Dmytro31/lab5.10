package com.company;

public class Main3 {
    public static void main(String[] args){
//        int n, f;
//        n =1;
//        f = 10;
//        for(int i = 1; i <= f; i++ ){
//            n = n * i;
//        }
//        System.out.println("10! =" +n);
        int c = 1;
        int a = 1;
        while (a <= 10){
            c = c * a;
            a = a + 1;
        }
        System.out.println("10! =" +c);
    }
}
