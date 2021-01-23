package org.shancm.mallthirdpart;

import java.util.ArrayList;

/**
 * @author Shancm
 * @date 2020/7/29
 */
public class Temp {

    public static void main(String[] args) {
        Temp temp = new Temp();
//        temp.toPow(8, 10);

//        temp.toDown(2600);


    }

    public void toPow(double a, double b){
        for (int i = 0; i < 8; i++) {
            String s = Math.pow(2,i)*a+" to "+Math.pow(2,i)*b;
            System.out.println(s.replace(".0", ""));
        }
    }

    public void toDown(double c){
        for (int i = 0; i < 8; i++) {
            String s = c/Math.pow(2,i)+"";
            System.out.println(s.replace(".0", ""));
        }
    }

}
