import java.util.UUID;

enum category {Debit, Credit}

public class Transaction {
	private UUID id;
	private User recepient;
	private User sender;
	private category transferCategory;
	private int amount;

	public Transaction(User user1, User user2, category c, int a) {
		this.id = UUID.randomUUID();
		this.sender = user1;
		this.recepient = user2;
		this.transferCategory = c;
		this.amount = a;
	}
	public void transfer() {
		if ((this.transferCategory == category.Debit && this.amount < 0) ||
		(this.transferCategory == category.Credit && this.amount >= 0)) {
			System.err.println("Transaction error: type and amount do not match");
		}
		else if (transferCategory == category.Debit && this.recepient.getBalance() - this.amount < 0) {
			System.err.println("Transaction error: recepient has not enough money");
		}
		else if (this.transferCategory == category.Credit && this.sender.getBalance() + this.amount < 0) {
			System.err.println("Transaction error: sender has not enough money");
		}
		else {
			if (this.transferCategory == category.Debit) {
				this.sender.setBalance(this.sender.getBalance() + this.amount);
				this.recepient.setBalance(this.recepient.getBalance() - this.amount);
			}
			else if (this.transferCategory == category.Credit) {
				this.sender.setBalance(this.sender.getBalance() + this.amount);
				this.recepient.setBalance(this.recepient.getBalance() - this.amount);
			}
			System.out.println("Status of transaction: success");
		}
	}
	public UUID getId() {
		return this.id;
	}
	public User getRecepient() {
		return this.recepient;
	}
	public User getSender() {
		return this.sender;
	}
	public category getTransferCategory() {
		return this.transferCategory;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setRecepient(User u) {
		this.recepient = u;
	}
	public void setSender(User u) {
		this.sender = u;
	}
	public void setTransferCategory(category c) {
		this.transferCategory = c;
	}
	public void setAmount(int a) {
		this.amount = a;
	}
}