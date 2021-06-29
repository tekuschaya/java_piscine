import java.util.UUID;

public class User
{
	private UUID Identifier;
	private String Name;
	private int Balance;

	int getbalance()
	{
		return this.Balance;
	}

	String getName()
	{
		return this.Name;
	}

	UUID getIdentifier()
	{
		return this.Identifier;
	}

	void setBalance(int b)
	{
		this.Balance = b;
	}
	void setName(String n)
	{
		this.Name = n;
	}
	void setIdentifier(UUID i) //убрать?
	{
		this.Identifier = i;
	}

	

}
