package q080;

class Caller {
	private void init() {
		System.out.println("Initialized");
	}

	private void start() {
		init();
		System.out.println("Started");
	}
}

public class TestCall {
	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
	}
}
/*
 * 
 * What is the result? 
 * A. An exception is thrown at runtime.
 * B. 	Initialized 
 * 		Started 	
 * 		Initialized 
 * C. Initialized 
 * 		Started 
 * D. Compilation fails. 
 * 
 * 	ANSWER: D
 * 
 */