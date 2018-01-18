package abstractFactory;

public class HumanFactory extends AbstractFactory{

	@Override
	Human getHuman(String color) {
		if(color == null){
          return null;
	    }        
	    if(color.equalsIgnoreCase("BLACK")){
	       return new BlackPerson();
	    } else if(color.equalsIgnoreCase("WHITE")){
	       return new WhitePerson();
	    } else if(color.equalsIgnoreCase("YELLOW")){
	       return new YellowPerson();
	    }
	    return null;
	}

}
