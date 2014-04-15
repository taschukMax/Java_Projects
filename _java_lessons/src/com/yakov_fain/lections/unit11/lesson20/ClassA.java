package com.yakov_fain.lections.unit11.lesson20;

public class ClassA implements Updatable {
    String marketNews = null;

    /*public void setData(String marketNews) {
        this.marketNews = marketNews;
    }*/

    void someMethod9() {
        ClassB myB = new ClassB(this);
        myB.start();
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.someMethod9();
        System.out.println(a.marketNews);
    }

    @Override
    public void setData(String marketNews) {
        this.marketNews = marketNews;
    }
}
