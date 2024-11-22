package com.neoflex.task1.adapter;

public class Computer {
    public void readFromUSB(USB usb) {
        String data = usb.read();
        System.out.println("USB: " + data);
    }
}
