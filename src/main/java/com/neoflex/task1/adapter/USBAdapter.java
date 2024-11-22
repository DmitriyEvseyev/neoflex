package com.neoflex.task1.adapter;

class USBAdapter implements USB {
    private final MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public String read() {
       return memoryCard.readData();
    }
}