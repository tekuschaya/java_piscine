//public class TransactionNotFoundException extends Exception {}

public class TransactionNotFoundException extends RuntimeException {
    public TransactionNotFoundException() { super("Transaction not found"); }
    public TransactionNotFoundException(String message) {
        super(message);
    }
}