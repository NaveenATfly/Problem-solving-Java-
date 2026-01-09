class instagaramV1
{
	public void logiin()
	{
		System.out.println("Login done...");
	}
	public void reels ()
	{
		System.out.println("30 sec reels uploded...");
	}
	public void sharePost ()
	{
		System.out.println("share poste via instagaram...");
	}
	public void message ()
	{
		System.out.println("message send/ recived");
	}
	public void like()
	{
		System.out.println("like done...");
	}
	public void logout()
	{
		System.out.println("logout done...")
	}
}

class instagaramV2
{
	@Override
	public void reels ()
	{
		System.out.println("90 sec reels uploded...");
	}
	@Override
	public void sharePost ()
	{
		System.out.println("share poste via instagaram/whatsapp/gmail/twitter...");
	}
}

class mainclass
{
	public static void main(String[] args)
	{
		instagaramV1 inv1=new instagaramV1();
		inv1.logiin();
		inv1.reels();
		inv1.sharePost();
		inv1.message();
		inv1.like();
		inv1.logout();
		instagaramV2 inv2=new instagaramV2();
		inv2.logiin();
		inv2.reels();
		inv2.sharePost();
		inv2.message();
		inv2.like();
		inv2.logout();
	}
}