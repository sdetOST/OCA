package seyyaraRajapova;

//Which two modification, made independently, enable the code to compile?
abstract class Planet {
	protected void resolve() {				// Line n1
	}
}

	abstract void rotate();					// Line n2

class Mars extends Planet { 				// Line n3
		protected	void resolve() {
		}

		protected void rotate() {				// Line n4
		}
}

