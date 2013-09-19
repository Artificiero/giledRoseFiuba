package main.java.ar.fiuba.tecnicas.giledrose;

public class AgedBrie extends ItemWrapper{

	//incrementa +1 su calidad mientras envejece
	//pero una vez que SellIn es 0, decrementa de a 2
	@Override
	protected void updateQuality() {
		if ( this.isSellInPositive() ){
			this.addToQuality(1);						
		}
		else{
			this.addToQuality(-2);				
		}
	}

}
