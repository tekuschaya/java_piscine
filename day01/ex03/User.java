public class User {
	private final int id;
	private String name;
	private int balance;
	private TransactionsList transList;

	public User(String n, int b) {
		if (b < 0) {
			this.balance = 0;
			System.err.println("balance should be positive");
		}
		else {
			this.balance = b;
		}
		this.id = UserIdsGenerator.getInstance().generateId();
		this.name = n;
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
	public void setBalance(int b) {
		this.balance = b;
	}
	public void setName(String n) {
		this.name = n;
	}
	public TransactionsList getTransactionsList() {
		return this.transList;
	}
	public void printUser() {
		System.out.println("user id = " + this.id + ", user name = " + this.name + ", balance = " + this.balance);
	}

}