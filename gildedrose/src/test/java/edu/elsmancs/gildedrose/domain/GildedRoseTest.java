package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class GildedRoseTest {

    private GildedRose shop = null;
    private NormalItem normal = null;
    private AgedBrieItem brie = null;

    @Before
    public void setupInventario() {
       shop = new GildedRose();
       normal = new NormalItem("+5 Dexterity Vest", 10, 20);
       brie = new AgedBrieItem("Aged Brie", 2, 0);
    }

    @Test
    public void toStringTest() {
        shop.addItem(brie);
        brie = new AgedBrieItem("Aged Brie", 10, 10);
        shop.addItem(brie);
        System.out.println("toString() GildedRose test:");
        System.out.println(shop.toString());
    }

    @Test
    public void itemAddedToInventory() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size());
        List<NormalItem> items = List.of(normal, brie);
        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(shop.toString());

    }

    @Test
    public void updateQuality() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        System.out.println("Dia 0:" + '\n' + shop.toString());
        shop.updateQuality();
        
        NormalItem item = (NormalItem) shop.inventory().get(0);
        assertEquals(19, item.getQuality(), 0);
        assertEquals(2, ((NormalItem) (shop.inventory().get(1))).getQuality(), 0);
        System.out.println("Dia 1:" + '\n' + shop.toString());
    }
}
    

