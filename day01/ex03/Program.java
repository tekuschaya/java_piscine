import java.util.UUID;

public class Program {
    public static void main(String[] args) {
		User olga = new User("Olga", 10000000);
		User dima = new User("Dima", 400000);
		User kolya = new User("Kolya", 5000);
		User nastya = new User("Nastya", 2500);
		User lena = new User("Lena", 750);

		olga.printUser();
		dima.printUser();
		kolya.printUser();
		nastya.printUser();
		lena.printUser();

		Transaction first = new Transaction(UUID.randomUUID(), lena, olga, category.Debit, 1000);
		Transaction second = new Transaction(first.getId(), lena, olga, category.Credit, -1000);
		first.transfer();
		second.transfer();
		olga.printUser();
		lena.printUser();

		Transaction third = new Transaction(UUID.randomUUID(), kolya, nastya, category.Debit, 100);
		Transaction fourth = new Transaction(third.getId(), kolya, nastya, category.Credit, -100);
		third.transfer();
		fourth.transfer();
		kolya.printUser();
		nastya.printUser();

		Transaction fifth = new Transaction(UUID.randomUUID(), olga, kolya, category.Debit, 2000);
		Transaction sixth = new Transaction(fifth.getId(), olga, kolya, category.Credit, -2000);
		fifth.transfer();
		sixth.transfer();
		olga.printUser();
		kolya.printUser();

		Transaction seventh = new Transaction(UUID.randomUUID(), lena, dima, category.Debit, 13000);
		Transaction eighth = new Transaction(seventh.getId(), lena, dima, category.Credit, -13000);
		seventh.transfer();
		eighth.transfer();
		dima.printUser();
		lena.printUser();

		System.out.println("Olga transaction array : ");
		Transaction[] olga_array = olga.getTransactionsList().toArray();
		for (int i = 0; i < olga_array.length; i++)
			olga_array[i].printTransaction();

		System.out.println("Kolya transaction array : ");
		Transaction[] kolya_array = kolya.getTransactionsList().toArray();
		for (int i = 0; i < kolya_array.length; i++)
			kolya_array[i].printTransaction();
		
		System.out.println("Dima transaction array : ");
		Transaction[] dima_array = dima.getTransactionsList().toArray();
		for (int i = 0; i < dima_array.length; i++)
			dima_array[i].printTransaction();

		System.out.println("Lena transaction array : ");
		Transaction[] lena_array = lena.getTransactionsList().toArray();
		for (int i = 0; i < lena_array.length; i++)
			lena_array[i].printTransaction();

		System.out.println("Nastya transaction array : ");
		Transaction[] nastya_array = nastya.getTransactionsList().toArray();
		for (int i = 0; i < nastya_array.length; i++)
			nastya_array[i].printTransaction();
		
		lena.getTransactionsList().removeTransactionById(first.getId());
		
		System.out.println("Lena transaction array : ");
		lena_array = lena.getTransactionsList().toArray();
		for (int i = 0; i < lena_array.length; i++)
			lena_array[i].printTransaction();
		try {
			olga.getTransactionsList().removeTransactionById(UUID.randomUUID());
		}
		catch (TransactionNotFoundException e) {
    		System.out.println("\u001B[31m" + e + "\u001B[37m");
		}	
	}
}