package com.company;

public class Main4 {
    public static void main(String[] args){
        int same = 0;
        int a = 0;
        int s = 0;
        int d = 0;
        int x = 0;
        while (a <= 2){
            a++;
            while (s < 9){
                s++;
                while (d < 6){
                    d++;
                        while (x <= 9){
                            x++;
                             if(a == 2 && s > 3 ){
                                continue;
                             }
                             if((a == d && s == x)||(a == x && s ==d)){
                            same++;
                        }
                    }
                }
            }
        }
        System.out.println(same);
    }
}
