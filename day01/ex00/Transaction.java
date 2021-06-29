import java.util.UUID;

public class Transaction
{
	private UUID Identifier;
	private User Recepient;
	private User Sender;
	private String Transfer_category;
	private int Transfer_amount;

	public Transaction(UUID i, User user1, User user2, String category, int amount)
	{
		this.Identifier = i;
		this.Recepient = user1;
		this.Sender = user2;
		this.Transfer_category = category;
		this.Transfer_amount = amount;
	}

	

}