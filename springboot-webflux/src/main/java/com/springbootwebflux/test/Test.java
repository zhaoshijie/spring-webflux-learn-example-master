package com.springbootwebflux.test;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        U u = new U();
        U u2 = new U();

        Thread tt = new Thread(new T(u,2));
        tt.start();

        Thread.sleep(3000);

        Thread tt2 = new Thread(new T(u2,1));
        tt2.start();

    }
}
