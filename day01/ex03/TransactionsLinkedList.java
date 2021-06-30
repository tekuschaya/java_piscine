import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {

	private Transaction head = null;
	private Transaction tail = null;
	private int length = 0;

	public void addTransaction(Transaction t) {
		if (this.head == null)
		{
			this.head = t;
			this.tail = t;
		}
		else
		{
			t.prev = this.tail;
			this.tail.next = t;
			this.tail = t;
		}
		this.length++;
	}

	public void removeTransactionById(UUID id) throws TransactionNotFoundException {
		Transaction pointer = this.head;
		if (pointer != null && pointer.getId() == id)
		{
			this.head = pointer.next;
			this.head.prev = null;
			pointer = null;
			this.length--;
		}
		else
		{
			while (pointer != null)
			{
				if (pointer.getId() == id)
				{
					pointer.prev.next = pointer.next;
					pointer.next.prev = pointer.prev;
					pointer = null;
					this.length--;
					return ;
				}
				pointer = pointer.next;
			}
			throw new TransactionNotFoundException();


			/*Transaction tmp = this.head.next;
			while (tmp != null)
			{
				if (tmp.getId() == id)
				{
					pointer.next = tmp.next;
					tmp = null;
					this.length--;
					return ;
				}
				pointer = tmp;
				tmp = tmp.next;
			}
			throw new TransactionNotFoundException(); */

		}
	}

	public Transaction[] toArray() {
		System.out.println("length = " + this.length);
		Transaction[] trans = new Transaction[this.length];
		Transaction pointer = this.head;
		int i = 0;
		while (i < this.length)
		{
			trans[i] = pointer;
			pointer = pointer.next;
		}
		return trans;
	}

}