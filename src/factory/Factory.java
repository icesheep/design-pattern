package factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		Human human = Factory.createHuman(BlackPerson.class);
		human.getColor();
	}
}
