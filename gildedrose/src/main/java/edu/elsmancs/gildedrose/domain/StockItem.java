package edu.elsmancs.gildedrose.domain;

public class StockItem implements Updateable {

    private final Item item;

    public StockItem(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return item.toString();
    }

    @Override
    public void updateQuality() {
        // TODO Auto-generated method stub
    }
    
}
