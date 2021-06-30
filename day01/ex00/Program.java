public class Program
{
    public static void main(String[] args)
	{
		User olga = new User(1, "Olga", 10000000);
		User dima = new User(2, "Dima", 400000);
		User kolya = new User(3, "Kolya", 500);
		User nastya = new User(4, "Nastya", 100);
		User lena = new User(5, "Lena", 750);

		olga.printUser();
		dima.printUser();
		kolya.printUser();
		nastya.printUser();
		lena.printUser();

		Transaction first = new Transaction(lena, olga, category.Debit, 1000);
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

}