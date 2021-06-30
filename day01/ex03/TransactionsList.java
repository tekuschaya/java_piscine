import java.util.UUID;

interface TransactionsList {

	void addTransaction(Transaction t);

	void removeTransactionById(UUID id) throws TransactionNotFoundException;

	Transaction[] toArray();

}