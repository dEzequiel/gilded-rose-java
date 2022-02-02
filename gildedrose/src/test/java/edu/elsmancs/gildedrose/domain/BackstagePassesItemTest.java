package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class BackstagePassesItemTest {
    
    @Test
    public void createBackstagePasses() {
        BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        assertEquals(20, item.getQuality());
        assertEquals(10, item.getSellIn());
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
    }

    @Test
    public void sellInEqualLessTenDaysAndGreaterFiveDays() {
        BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        item.updateQuality()
        assertEquals(22, item.getQuality());
        assertEquals(9, item.getSellIn());
    }
}