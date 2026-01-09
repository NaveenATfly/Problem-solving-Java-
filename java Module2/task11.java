abstract class AmazonV1
{
	public static void logIn()
	{
		System.out.Println("Login done...!!");
	}
	public static void shop()
	{
		System.out.Println("ADD to cart...");
	}
	public static void prime()
	{
		System.out.Println("Do Prime Subscription...");
	}
	abstract public void payBills();
	
	public static void logOut()
	{
		System.out.Println("Logout Successfull...");
	}
}

class AmazonV2 extends AmazonV1
{
	@Override
	public void payBills()
	{
		System.out.println("Start pay all the bills..");
	}
}

class task11
{
	public static void main (String[] args)
	{
		System.out.println("AmazonV1");
		System.out.println("------------");
		AmazonV1.logIn();
		AmazonV1.shop();
		AmazonV1.prime();
		AmazonV1.logOut();
		System.out.println("------------");
		System.out.println("AmazonV2");
		System.out.println("------------");
		AmazonV2.logIn();
		AmazonV2.shop();
		AmazonV2.prime();
		AmazonV2 Av2 = new AmazonV2();
		Av2.payBills();
		AmazonV2.logOut();
	}
}