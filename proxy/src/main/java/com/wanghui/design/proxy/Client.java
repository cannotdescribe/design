package com.wanghui.design.proxy;

public class Client {
    public static void main(String[] args) {
        Moveable a = new Tank();
        a.move();
    }
}
