
public class MyClass {

	int i;
	
	public void increment() {
		++i;
		
		this.log();
	}
	
	public void log() {
		System.out.println("Value of i is " + i);
	}
}
