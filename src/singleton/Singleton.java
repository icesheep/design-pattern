package singleton;

public class Singleton {

	private Singleton(){};
	
	private static final Singleton singelton = new Singleton();
	
	public static Singleton getSingleton() {
		return singelton;
	}
}
