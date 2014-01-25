package com.mkyong.fact;

/**
 * Created with IntelliJ IDEA.
 * User: iris
 * Date: 26/10/13
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 */
public class Fact {

    public static int factorial(int num){
        if (num <=1){
            return 1;
        }
        return factorial(num-1) * num;
    }
}
