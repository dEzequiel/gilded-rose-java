package edu.elsmancs.gildedrose.domain;

class Item {
    
    // Attributes
    public final String name;
    public int sellIn = 0;
    public int quality = 0;

    // Construtor
    Item (String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


}
