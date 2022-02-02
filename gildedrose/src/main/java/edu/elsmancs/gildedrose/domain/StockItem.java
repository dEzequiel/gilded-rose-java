package edu.elsmancs.gildedrose.domain;

public class StockItem extends Item implements Updateable{

    StockItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        //TODO Auto-generated constructor stub
    }

    int getSellIn() {
        return this.sellIn;
    }
    int getQuality(){
        return this.quality;
    }

    void setSellIn() {
        this.sellIn = this.getSellIn() - 1;
    }

    void setQuality(int amount) {
        this.quality = amount;
    }

    void improveQuality(int amount) {
        this.quality += amount;
        this.qualityChecker();
    }
    void reduceQuality(int amount) {
        this.quality -= amount;
    }
    void qualityChecker(){
        if (this.getQuality() > 50) {
            this.setQuality(50);
        }
    }

    @Override
    public void updateQuality() {
        // TODO Auto-generated method stub
        
    }
    
}
