package singleton;

public class Singleton {

	private Singleton(){};
	
	private volatile static Singleton singelton;
	
	public static Singleton getSingleton() {
		return singelton;
	}
	public static Singleton doubleCheckGetSingleton() {
		if(singelton == null) {
			synchronized (Singleton.class) {
				if(singelton == null) {
					singelton = new Singleton();
				}
			}
		}
		return singelton;
	}
}
