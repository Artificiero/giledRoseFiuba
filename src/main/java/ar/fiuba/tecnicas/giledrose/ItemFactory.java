package main.java.ar.fiuba.tecnicas.giledrose;

public class ItemFactory {
	
    private final String AGED = "AGED";
    private final String DEXTERITY = "DEXTERITY";
    private final String SULFURAS = "SULFURAS";
    private final String BACKSTAGE = "BACKSTAGE";
    private final String CONJURED = "CONJURED";
    private final String ELIXIR = "ELIXIR" ;
    
	ItemFactory(){}
	
	ItemWrapper createItemWrapper(Item item){
		
		String name = item.getName().toUpperCase();
		
		if ( name.contains( AGED ) ){
			return new AgedBrie(item);						
		}
		
		if ( name.contains( DEXTERITY )){
			return new Dexterity(item);
		}

		if ( name.contains( SULFURAS )){
			return new Sulfuras(item);
		}
		
		if ( name.contains( CONJURED )){
			return new Conjured(item);
		}
		
		if ( name.contains( BACKSTAGE )){
			return new BackStage(item);
		}
		
		if ( name.contains ( ELIXIR)){
			return new Elixir(item);			
		}
		return null;
	}
	
	

}
