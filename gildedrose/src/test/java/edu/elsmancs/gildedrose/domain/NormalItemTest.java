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

    
}
