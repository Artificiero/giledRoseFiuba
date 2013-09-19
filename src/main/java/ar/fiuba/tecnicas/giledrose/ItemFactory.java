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
		System.out.println(name);
		if ( name.contains( AGED ) ){
			System.out.println("AGED");
			return new AgedBrie(item);						
		}
		
		if ( name.contains( DEXTERITY )){
			System.out.println("dex");
			return new Dexterity(item);
		}

		if ( name.contains( SULFURAS )){
			System.out.println("SULF");
			return new Sulfuras(item);
		}
		
		if ( name.contains( CONJURED )){
			System.out.println("CONJ");
			return new Conjured(item);
		}
		
		if ( name.contains( BACKSTAGE )){
			System.out.println("BACKS");
			return new BackStage(item);
		}
		
		if ( name.contains ( ELIXIR)){
			System.out.println("ELIX");
			return new Elixir(item);			
		}
		System.out.println("FAAAAAAAAAIL");
		return null;
	}
	
	

}
