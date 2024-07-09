package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void brieIncreasesInValue() {
        Item[] items = new Item[]{new Item(GildedRose.AGED_BRIE, 6, 4)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void backStagePassIsWorthlessAfterSelling() {
        Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 0, 4)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}
//
