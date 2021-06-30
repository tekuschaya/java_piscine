public class User
{
	private final int id;
	private String name;
	private int balance;
	TransactionsList transList = new TransactionsLinkedList();

	public User(String n, int b)
	{
		if (b < 0)
			System.err.println("balance should be positive"); //установить 0?
		else
			this.balance = b;
		this.id = UserIdsGenerator.getInstance().generateId();
		this.name = n;
		//this.transList = null;
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
	public TransactionsList getTransactionsList()
	{
		//System.out.println.
		return this.transList;
	}
	public void printUser()
	{
		System.out.println("user id = " + this.id + ", user name = " + this.name + ", balance = " + this.balance);
	}

}