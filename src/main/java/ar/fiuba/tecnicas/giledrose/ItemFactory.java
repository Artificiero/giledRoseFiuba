package main.java.ar.fiuba.tecnicas.giledrose;

public class ItemFactory {
	
	ItemFactory(){}
	
	ItemWrapper createItemWrapper(Item item){
		
		String name = item.getName().toUpperCase();
		if ( name.contains( ItemType.AGED.toString() ) ){
			return new AgedBrie(item);						
		}
		
		if ( name.contains(ItemType.DEXTERITY.toString() ) ){
			return new Dexterity(item);
		}

		if ( name.contains(ItemType.SULFURAS.toString() ) ){
			return new Sulfuras(item);
		}
		
	}
	
	

}
