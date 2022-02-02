package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class AgedBrieItemTest{

    @Test
    public void createAgedBrie() {
        AgedBrieItem item = new AgedBrieItem("Aged Brie", 5, 7);
        assertEquals(7, item.getQuality());
        assertEquals(5, item.getSellIn());
        assertEquals("Aged Brie", item.getName());
    }


    
}