package edu.elsmancs.gildedrose.domain;

final class Item {
    
    // Attributes
    private final String name;
    private int sellIn = 0;
    private int quality = 0;

    // Construtor
    Item (String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    // Getters methods for override
    String getName() {
        return this.name;
    }

    int getSellIn() {
        return this.sellIn;
    }

    int getQuality() {
        return this.quality;
    }


}