package main.java.ar.fiuba.tecnicas.giledrose;

public class Dexterity extends ItemWrapperVarQ{
	
	public Dexterity( Item it ){
		this.item = it;				
	}

	@Override
	protected void updateQuality() {
		if ( this.isSellInPositive() ){
			this.addToQuality(-1);						
		}
		else{
			this.addToQuality(-2);				
		}
	}

}
