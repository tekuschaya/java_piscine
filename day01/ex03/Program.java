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

		Transaction first = new Transaction(lena, olga, category.Debit, 1000);
		//lena.getTransactionsList().addTransaction(first);
		//olga.getTransactionsList().addTransaction(first);
		olga.printUser();
		lena.printUser();

		Transaction second = new Transaction(kolya, nastya, category.Credit, -200);
		kolya.printUser();
		nastya.printUser();

		Transaction third = new Transaction(olga, kolya, category.Debit, 20000);
		olga.printUser();
		kolya.printUser();

		Transaction fourth = new Transaction(lena, dima, category.Credit, -13000);
		dima.printUser();
		lena.printUser();


		//olga.getTransactionsList().printTransaction();

		Transaction[] olga_array = olga.getTransactionsList().toArray();
		//for (int i = 0; i < olga_array.length; i++)
		//	olga_array[i].printTransaction();
	}

}