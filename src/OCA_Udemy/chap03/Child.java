package chap03;

abstract class Parent
{
	protected void resolve()			//Line-1
	{
	}
	abstract void rotate();		//Line-2
}
class Child extends Parent
{
//	void resolve()					//Line-3  ----> protected or public
//	protected void resolve()		// option  1
	public void resolve()			// option  2
	
	
	{
	}
	protected void rotate()//Line-4
	{
	}
}