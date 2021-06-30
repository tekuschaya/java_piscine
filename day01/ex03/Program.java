import java.util.UUID;

public class Program
{
    public static void main(String[] args)
	{
		User olga = new User("Olga", 10000000);
		User dima = new User("Dima", 400000);
		User kolya = new User("Kolya", 500);
		User nastya = new User("Nastya", 100);
		User lena = new User("Lena", 750);

		olga.printUser();
		dima.printUser();
		kolya.printUser();
		nastya.printUser();
		lena.printUser();

		Transaction first = new Transaction(UUID.randomUUID(), lena, olga, category.Debit, 1000);
		Transaction second = new Transaction(first.getId(), lena, olga, category.Credit, -1000);
		olga.printUser();
		lena.printUser();

		Transaction third = new Transaction(UUID.randomUUID(), kolya, nastya, category.Credit, -200);
		Transaction fourth = new Transaction(third.getId(), kolya, nastya, category.Debit, 200);
		kolya.printUser();
		nastya.printUser();

		Transaction fifth = new Transaction(UUID.randomUUID(), olga, kolya, category.Debit, 20000);
		Transaction sixth = new Transaction(fifth.getId(), olga, kolya, category.Credit, -20000);
		olga.printUser();
		kolya.printUser();

		Transaction seventh = new Transaction(UUID.randomUUID(), lena, dima, category.Debit, 13000);
		Transaction eighth = new Transaction(seventh.getId(), lena, dima, category.Credit, -13000);
		dima.printUser();
		lena.printUser();

		Transaction[] olga_array = olga.getTransactionsList().toArray();
		for (int i = 0; i < olga_array.length; i++)
			olga_array[i].printTransaction();

		Transaction[] kolya_array = kolya.getTransactionsList().toArray();
		for (int i = 0; i < kolya_array.length; i++)
			kolya_array[i].printTransaction();
		
		Transaction[] dima_array = dima.getTransactionsList().toArray();
		for (int i = 0; i < dima_array.length; i++)
			dima_array[i].printTransaction();

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