//Abstract
//Type 1
/*
abstract class demo1
{
	abstract public void m1();
}

class demo2 extends demo1
{
	@Override
	public void m1()
	{
		System.out.println("HI Demo1");
	}
}

class task10
{
	public static void main(String[] args)
	{
		demo2  d2 = new demo2();
		d2.m1();
	}
}

*/

//Type 2
/*

abstract class demo1
{
	abstract public void m1();
	abstract public void m2();
	
}

abstract class demo2 extends demo1
{
	@Override
	public void m1()
	{
		System.out.println("HI Demo2");
	}
}

class demo3 extends demo2
{
	@Override
	public void m2()
	{
		System.out.println("HI Demo3");
	}
}


class task10
{
	public static void main(String[] args)
	{
		demo3  d3 = new demo3();
		d3.m1();
		d3.m2();
	}
}
*/


abstract class demo1
{
	abstract public void m1();
	
}

class demo2 extends demo1
{
	@Override
	public void m1()
	{
		System.out.println("HI Demo2");
	}
}

class demo3 extends demo1
{
	@Override
	public void m1()
	{
		System.out.println("HI Demo3");
	}
}


class task10
{
	public static void main(String[] args)
	{
		demo2  d2 = new demo2();
		d2.m1();
		demo3  d3 = new demo3();
		d3.m1();
		
	}
}