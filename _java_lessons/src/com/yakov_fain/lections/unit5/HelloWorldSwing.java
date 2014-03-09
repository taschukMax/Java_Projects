package com.yakov_fain.lections.unit5;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 3/9/14
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldSwing extends JFrame {
    public HelloWorldSwing() {
        JPanel jPanel = new JPanel();
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorldSwing helloWorldSwing = new HelloWorldSwing();
    }
}
