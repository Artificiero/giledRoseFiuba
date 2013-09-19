package main.java.ar.fiuba.tecnicas.giledrose;

public abstract class ItemWrapperVarQ extends ItemWrapper{
	final int SupLimitQ = 50;
	final int BotLimitQ = 0;
	
	protected abstract void updateQuality();
	
	ItemWrapperVarQ(Item item){
		super(item);
	}
	
	@Override
	public void update(){
		this.updateQuality();
		this.updateSellin();
	}
	
	//quantity puede ser positivo o negativo
	//la calidad nunca va a dar menor a 0 o mayor a 50
	protected void addToQuality(int quantity){
		int newQuality = this.item.getQuality() + quantity ;
		this.item.setQuality( this.verifyQualityLimits( newQuality ) );
	}
	
	protected void updateSellin() {
		this.item.setSellIn( this.item.getSellIn() - 1 );
	}
	
	private int verifyQualityLimits(int newQ){
		if ( newQ < BotLimitQ ){ newQ = BotLimitQ; }
		if ( newQ > SupLimitQ ){ newQ = SupLimitQ; }
		return newQ;
	}
}
