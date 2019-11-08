package q083;

public class Test1 {
	int i, j ;
	
	public Test1 (int i, int j) {
		initialize (i, j);
	}
	private void initialize(int i2, int j2) {
		this.i = i*i;
		this.j = j*j;
	}

	public static void main(String[] args) {
		int i = 3;  int j = 5;
		Test1 t = new Test1( i, j);
		System.out.println(i + "..."+ j);							// opt 1   -->  Answer  3...5
		System.out.println(t.i + "..."+ t.j);						// opt 2   -->  Answer  9...25
	}
}

/*
 * 
 * A.		9...25
 * B.		0...0
 * C.		3...5
 * D.		Compilation Fails
 * 
 * Answer : C
 * 
*/
