//Create a class Animal with a method eat().
//Create a child class Dog that has a method bark().
//Create an object of Dog and call both methods.
/*
class animal
{
	public void eat()
	{
		System.out.println("Dog eat meat..!");
	}
}

class dog extends animal
{
	public void bark()
	{
		System.out.println("woww..Wowww!!");
	}
}

class task7
{
	public static void main(String[] args)
	{
		dog d=new dog();
		d.eat();
		d.bark();
	}
}

*/

/*
Create a class Vehicle with a variable speed.
Create a subclass Bike and display the speed using a method in Bike.
*/
/*
class vehicle
{
	String speed= "299km/hr";
}

class bike extends vehicle
{
	String brand= "Yamaha";
	String model= "R15 V3";
}

class task7
{
	public static void main (String[] args)
	{
		bike b1=new bike();
		System.out.println(b1.brand);
		System.out.println(b1.model);
		System.out.println(b1.speed);
	}
}
*/

/*
Grandparent → method house()

Parent extends Grandparent → method car()

Child extends Parent → method bike()
Call all methods using Child object.

*/

class grandparent
{
	public void house ()
	{
		System.out.println("its grandparent House...!");
	}
}

class parent extends grandparent
{
	public void car()
	{
		System.out.println("its Parent Car...!");
	}
}

class child extends parent
{
	public void bike()
	{
		System.out.println("its My bike...!");
	}
}

class task7
{
	public static void main (String[] args)
	{
		child c1= new child();
		c1.house();
		c1.car();
		c1.bike();
	}
}
