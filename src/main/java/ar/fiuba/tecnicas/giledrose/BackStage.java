package main.java.ar.fiuba.tecnicas.giledrose;

public class BackStage extends ItemWrapperVarQ {

	BackStage(Item item) {
		super(item);
	}
	
	//aca hay que usar un patron state
	@Override
	protected void updateQuality() {
		if ( this.isSellInPositive()){
			if ( this.item.getQuality() <= 10 ){
				if ( this.item.getQuality() > 5){
					this.addToQuality(2);
				} else {
					this.addToQuality(3);
				}
			} else {
				this.addToQuality(1);			
			}
			
		}else{
			this.item.setQuality(0);
		}
		
	}

}
