public class User {
	private final int id;
	private String name;
	private int balance;
	private TransactionsList transList;

	public User(String name, int balance) {
		this.id = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		this.balance = balance;
		if (this.balance < 0) {
			this.balance = 0;
			System.err.println("Balance should be positive");
		}
		this.transList = new TransactionsLinkedList();
	}
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public void setBalance(int balance) {
		if (balance < 0) {
			System.out.println("Balance should be positive");
		}
		else {
			this.balance = balance;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public TransactionsList getTransactionsList() {
		return this.transList;
	}
	public void printUser() {
		System.out.println("user id = " + this.id + ", user name = " + this.name + ", balance = " + this.balance);
	}
}