package com.yakov_fain.lections.unit11.lesson20;

public class ClassB extends Thread {
    Updatable parent = null;

    public ClassB(Updatable a) {
        parent = a;
    }

    @Override
    public void run() {
        parent.setData("Economy is recovering...");
        synchronized (parent) {
            parent.notify();
        }
    }
}
