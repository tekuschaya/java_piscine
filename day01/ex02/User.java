public class User
{
	private final int id;
	private String name;
	private int balance;

	public User(String n, int b)
	{
		if (b < 0)
		{
			System.err.println("balance should be positive");
			//System.exit(-1); //оставить?
		}
		else
			this.balance = b;
		this.id = UserIdsGenerator.getInstance().generateId();
		this.name = n;
	}
	public int getBalance()
	{
		return this.balance;
	}
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
	public void printUser()
	{
		System.out.println("user id = " + this.id + ", user name = " + this.name + ", balance = " + this.balance);
	}

}