package edu.elsmancs.gildedrose.domain;

public class NormalItem extends StockItem {

    NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        //TODO Auto-generated constructor stub
    }

    private StockItem item;

    @Override
    public void updateQuality() {
        if(this.getSellIn() <= 0) {
            this.setQuality(0);
        } 
        else {
            this.reduceQuality(1);
        }
        this.setSellIn();

    }  

    public static void main( String[] args )
    {
        NormalItem x = new NormalItem("Elixir of the Mongoose", 5, 7);
        for (int i = 0; i < 10; i++) {
            x.updateQuality();
            System.out.print(x + "\n");
        }
        
    }
}
