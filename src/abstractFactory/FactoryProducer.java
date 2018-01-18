package abstractFactory;

public class FactoryProducer {
	public static AbstractFactory createFactory(String choice){
		if(choice.equalsIgnoreCase("HUMAN")){
			return new HumanFactory();
		}
		return null;
	}
	public static void main(String[] args){
		AbstractFactory humanFactory = FactoryProducer.createFactory("human");
		humanFactory.getHuman("black").getColor();;
		humanFactory.getHuman("white").getColor();
		humanFactory.getHuman("yellow").getColor();
	}
}
