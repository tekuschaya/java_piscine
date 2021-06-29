public class User
{
	private int id;
	private String name;
	private int balance;

	public User(int i, String n, int b)
	{
		this.id = i;
		this.name = n;
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

	public void setBalance(int b)
	{
		this.balance = b;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setId(int i)
	{
		this.id = i;
	}


}
