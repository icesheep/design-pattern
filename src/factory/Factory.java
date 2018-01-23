package factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class Factory {
	
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}
	public static void main(String[] args) throws ParseException {
		List<BlackPerson> list = new ArrayList<BlackPerson>();
		BlackPerson human = Factory.createHuman(BlackPerson.class);
		human.setPort("PAPI");
		human.setNum(1);
		list.add(human);
		BlackPerson human2 = Factory.createHuman(BlackPerson.class);
		human2.setPort("PACK");
		human2.setNum(2);
		list.add(human2);
		BlackPerson human3 = Factory.createHuman(BlackPerson.class);
		human3.setPort("PPI");
		human3.setNum(3);
		list.add(human3);
		for(BlackPerson item : list){
			int aomenTotal = 0 ;
			switch (item.getPort()) {
	        case "PAPI":
	          aomenTotal += item.getNum();
	          break;
	          case "PACK":
            aomenTotal += item.getNum();
	          case "PPI":
              aomenTotal += item.getNum();
	        default:
	          break;
	      }
			System.out.println(aomenTotal);
		}
		
	}
}
