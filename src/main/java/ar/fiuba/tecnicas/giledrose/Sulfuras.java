package main.java.ar.fiuba.tecnicas.giledrose;

public class Sulfuras extends ItemWrapper{
	
	Sulfuras(Item item){
		super(item);
		this.item.setQuality(80);
		this.item.setSellIn(0);
	}

	@Override
	public void update() {}

}
