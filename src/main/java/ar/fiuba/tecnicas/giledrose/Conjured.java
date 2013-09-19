package main.java.ar.fiuba.tecnicas.giledrose;

public class Conjured extends ItemWrapperVarQ{

	@Override
	protected void updateQuality() {
		if ( this.isSellInPositive() ){
			this.addToQuality(-2);						
		}
		else{
			this.addToQuality(-4);				
		}
	}
	
	Conjured(Item item){
		super(item);
	}

}
