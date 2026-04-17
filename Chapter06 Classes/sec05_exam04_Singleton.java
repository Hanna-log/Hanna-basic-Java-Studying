package sec05.exam04;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton geSingleton() {
		return singleton;
	}
	

}
