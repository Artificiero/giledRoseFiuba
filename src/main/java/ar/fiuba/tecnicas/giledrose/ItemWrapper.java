package main.java.ar.fiuba.tecnicas.giledrose;

public abstract class ItemWrapper {
	Item item;
	
	public abstract void update();
	
	protected boolean isQualityPositive(){
		return ( this.item.getQuality() > 0 );
	}
	
	protected boolean isSellInPositive(){
		return ( this.item.getSellIn() > 0);
	}

}
