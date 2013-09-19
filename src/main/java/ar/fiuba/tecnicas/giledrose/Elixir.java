package main.java.ar.fiuba.tecnicas.giledrose;

public class Elixir extends ItemWrapperVarQ{

	Elixir(Item item) {
		super(item);
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
