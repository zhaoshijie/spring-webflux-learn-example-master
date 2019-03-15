package com.springbootwebflux.test;

public class T implements Runnable{

    private U u;

    private int type;

    public T(U u ,int type){
        this.u = u;
        this.type = type;
    }

    public T(T t) {
    }


    @Override
    public void run() {
        if(type==1){
            U.getB2();
            System.out.println("bbbb2222");
        }else{
            U.getB();
            System.out.println("bbbbb");
        }
    }
}
