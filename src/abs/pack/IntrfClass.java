package abs.pack;

public interface IntrfClass {
	
	//100% Abstract Class

    public abstract void printName();
	
	public void printName2();
	
	default void getDarkTheme() { // this is like non mandatory abstract method
		// no code
	}
	
	public static void printName3() { 
		System.out.println("Sefali");
	}
}
