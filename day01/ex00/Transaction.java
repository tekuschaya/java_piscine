import java.util.UUID;

enum category {Debit, Credit}

public class Transaction
{
	private UUID id;
	private User recepient;
	private User sender;
	private category transferCategory;
	private int amount;

	public Transaction(UUID i, User user1, User user2, category c, int a)
	{
		this.id = i;
		this.recepient = user1;
		this.sender = user2;
		this.transferCategory = c;
		this.amount = a;
	}

	public UUID getId()
	{
		return this.id;
	}
	public User getRecepient()
	{
		return this.recepient;
	}
	public User getSender()
	{
		return this.sender;
	}
	public category getTransferCategory()
	{
		return this.transferCategory;
	}
	public int getAmount()
	{
		return this.amount;
	}
	public void setId(UUID i)
	{
		this.id = i;
	}
	public void setRecepient(User u)
	{
		this.recepient = u;
	}
	public void setSender(User u)
	{
		this.sender = u;
	}
	public void setTransferCategory(category c)
	{
		this.transferCategory = c;
	}
	public void setAmount(int a)
	{
		this.amount = a;
	}


}