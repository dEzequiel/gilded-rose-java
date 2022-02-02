package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class NormalItemTest{

    @Test
    public void createNormalItem() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
        assertEquals(7, item.getQuality(), 7);
        assertEquals(5, item.getSellIn(), 5);
        assertEquals("Elixir of the Mongoose", item.getName(),"Elixir of the Mongoose");
    }

    @Test
    public void normalItemSellInZero() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 0, 7);
        item.updateQuality();
        assertEquals(0, item.getQuality(), 7);
    }

    @Test
    public void normalItemSellInNotZero() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 1, 7);
        item.updateQuality();
        assertEquals(6, item.getQuality(), 7);
    }

    
}
