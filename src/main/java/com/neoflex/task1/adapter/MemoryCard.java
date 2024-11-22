package com.neoflex.task1.adapter;

class MemoryCard {
    private final String data;

    public MemoryCard(String data) {
        this.data = data;
    }

    public String readData() {
        return data;
    }
}