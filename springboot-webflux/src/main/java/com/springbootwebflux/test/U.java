package com.springbootwebflux.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class U {

    public static void main(String[] args) {
        HashMap m;
        HashSet s;
    }

    public synchronized String getA(){
        return "a";
    }

    public static synchronized String getB(){
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "b";
    }

    public static synchronized String getB2(){
        return "b2";
    }


}
