package chap03;

class Vehicle
{
	String type="4w";
	int maxSpeed=120;
	Vehicle(String type,int maxSpeed)
	{
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
}
class Car extends Vehicle
{
	String trans;
	Car(String trans)
	{
	        //Line-1
		this.trans=trans;
	}
	Car(String type,int maxSpeed,String trans)
	{
		super(type,maxSpeed);
		this(trans);//Line-2
	}
}