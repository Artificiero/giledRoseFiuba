package main.java.ar.fiuba.tecnicas.giledrose;

public abstract class ItemWrapper {
	protected Item item;
	
	protected abstract void updateQuality();

	public void update(){
		this.updateQuality();
		this.updateSellin();
	}
	
	//quantity puede ser positivo o negativo
	//la calidad nunca va a dar menor a 0
	protected void addToQuality(int quantity){
		int newQuality = this.item.getQuality() + quantity ;
		if ( newQuality < 0){newQuality = 0;}
		this.item.setQuality( newQuality );
	}
	
	protected boolean isQualityPositive(){
		return ( this.item.getQuality() > 0 );
	}
	
	protected boolean isSellInPositive(){
		return ( this.item.getSellIn() > 0);
	}
	
	protected void updateSellin() {
		this.item.setSellIn( this.item.getSellIn() - 1 );
	}
}
