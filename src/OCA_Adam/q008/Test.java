package OCA_Adam.q008;

import java.io.IOException;

class X {
	public void printFileContent() {			//throws IOException { 								// line 2
		/* code goes here */
		throw new IOException(); // line 4
	}
}

public class Test {
	public static void main(String[] args) {	//throws IOException { 					// line 8
		X xobj = new X();
		xobj.printFileContent();
	}
//line 11
}

/*
 * Which two modifications should you make so that the code compiles
 * successfully? A) Replace line 8 with public static void main(String[] args)
 * throws Exception { B) Replace line 10 with: try { xobj.printFileContent(); }
 * catch(Exception e){} catch(IOException e){}
 * 
 * 
 * 
 * 
 * 
 */