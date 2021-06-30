public class User
{
	private final int id;
	private String name;
	private int balance;

	public User(String n, int b)
	{
		this.id = UserIdsGenerator.getInstance().generateId();
		this.name = n;
		if (b < 0) // balance = 0?
			System.err.println("balance should be positive");
		else
			this.balance = b;
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

}