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

    void setQuality(int amount) {
        this.quality = amount;
    }

    void improveQuality(int amount) {
        this.quality += amount;
    }

    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", sell_in" + getSellIn());
        itemDescription.append(", quality" + getQuality());
        return itemDescription.toString();
    }


}
