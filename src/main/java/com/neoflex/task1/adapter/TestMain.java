package com.neoflex.task1.adapter;

public class TestMain {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard("This is the data from the memory card.");

        USBAdapter usbAdapter = new USBAdapter(memoryCard);

        Computer computer = new Computer();
        computer.readFromUSB(usbAdapter);
    }
}