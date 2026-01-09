class A
{
	int a=10;
	public void print1()
	{
		System.out.println("Hi A");
	}
}

class B extends A
{
	char b= 'N';
	public void print2()
	{
		System.out.println("Hi B");
	}
}

class C extends A
{
	double c= 93.93;
	public void print3()
	{
		System.out.println("Hi C");
	}
}

class D extends A 
{
	boolean d=true;
	public void print4()
	{
		System.out.println("Hi D");
	}
}

class E extends C
{
	String e="Naveen";
	public void print5()
	{
		System.out.println("Hi E");
	}
}

class task4{
	public static void main(String[] args)
	{
		A a1= new A();
		System.out.println(a1.a);
		a1.print1();
		
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.print1();
		b1.print2();
		
		C c1=new C();
		System.out.println(c1.a);
		System.out.println(c1.c);
		c1.print1();
		c1.print3();
		
		D d1=new D();
		System.out.println(d1.a);
		System.out.println(d1.d);
		d1.print1();
		d1.print4();
		
		E e1=new E();
		System.out.println(e1.a);
		System.out.println(e1.c);
		System.out.println(e1.e);
		e1.print1();
		e1.print3();
		e1.print5();
	}
}		
		
		