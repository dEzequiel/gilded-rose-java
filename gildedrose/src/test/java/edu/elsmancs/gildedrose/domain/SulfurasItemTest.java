package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class SulfurasItemTest {
    
    @Test
    public void createSulfuras() {
        SulfurasItem item = new SulfurasItem("Sulfuras", 5, 80);
        assertEquals(80, item.getQuality());
        assertEquals(5, item.getSellIn());
        assertEquals("Sulfuras", item.getName());
    }

    
}
