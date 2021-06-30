public class Program
{
	public static void main(String[] args)
	{
		User olga = new User("Olga", 100);
		User dima = new User("Dima", 200);
		User kolya = new User("Kolya", 300);
		User lena = new User("Lena", 400);
		User sasha = new User("Sasha", 500);

		System.out.println("name = " + olga.getName() + " id = " + olga.getId());
		System.out.println("name = " + dima.getName() + " id = " + dima.getId());
		System.out.println("name = " + kolya.getName() + " id = " + kolya.getId());
		System.out.println("name = " + lena.getName() + " id = " + lena.getId());
		System.out.println("name = " + sasha.getName() + " id = " + sasha.getId());

		UsersArrayList usersList = new UsersArrayList();

		usersList.addUser(olga);
		usersList.addUser(dima);
		usersList.addUser(kolya);
		usersList.addUser(lena);
		usersList.addUser(olga);
		usersList.addUser(dima);
		System.out.println("number of users = " + usersList.getNumberOfUsers());
		try {
			usersList.getUserById(4).printUser();
			usersList.getUserById(8).printUser();

		}
		catch (UserNotFoundException e) {
    		System.out.println("\u001B[31m" + e + "\u001B[37m");
		}
		try {
			usersList.getUserByIndex(2).printUser();
			usersList.getUserByIndex(12).printUser();
		}
		catch (UserNotFoundException e) {
			System.out.println("\u001B[31m" + e + "\u001B[37m");
		}
	}



}

