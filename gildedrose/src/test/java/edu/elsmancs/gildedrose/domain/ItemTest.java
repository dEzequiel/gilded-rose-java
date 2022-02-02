package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest extends StockItem{

    ItemTest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        //TODO Auto-generated constructor stub
    }

    @Test
    public void createItem() {

        StockItem item = new StockItem("+5 Dexterity Vest", 10, 20);
        assertEquals("+5 Dexterity Vest", item.name);
        assertEquals(10, item.getSellIn(), 0);
        assertEquals(20, item.getQuality(), 0);
        System.out.println(item);    
    }

}
