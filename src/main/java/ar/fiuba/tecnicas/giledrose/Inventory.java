package main.java.ar.fiuba.tecnicas.giledrose;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<ItemWrapper> items;
    
    private void fillInventory(Item[] items){
    	this.items = new ArrayList<ItemWrapper>();
    	ItemFactory itemFact = new ItemFactory();
    	for (Item item : items){
    		this.items.add(itemFact.createItemWrapper(item));
    	}	
    }

    public Inventory(Item[] items) {
    	this.fillInventory(items);
    }

    public Inventory() {
        Item[] itemsN = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };
        this.fillInventory(itemsN);
    }

    public void updateQuality() {
        for ( ItemWrapper item : this.items) 
        {
        	item.update();       
        }
    }
}
