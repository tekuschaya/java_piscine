public class Program {

	public static void main(String[] args) {
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

		User nastya = new User("Nastya", 1100);
		User katya = new User("Katya", 2200);
		User petya = new User("Petya", 3300);
		User semen = new User("Semen", 4400);
		User artem = new User("Artem", 5500);
		User vika = new User("Vika", 6600);
		User lesha = new User("Lesha", 7700);
		User ivan = new User("Ivan", 8800);

		System.out.println("name = " + nastya.getName() + " id = " + nastya.getId());
		System.out.println("name = " + katya.getName() + " id = " + katya.getId());
		System.out.println("name = " + petya.getName() + " id = " + petya.getId());
		System.out.println("name = " + semen.getName() + " id = " + semen.getId());
		System.out.println("name = " + artem.getName() + " id = " + artem.getId());
		System.out.println("name = " + vika.getName() + " id = " + vika.getId());
		System.out.println("name = " + lesha.getName() + " id = " + lesha.getId());
		System.out.println("name = " + ivan.getName() + " id = " + ivan.getId());

		usersList.addUser(nastya);
		usersList.addUser(katya);
		usersList.addUser(petya);
		usersList.addUser(semen);
		usersList.addUser(artem);
		usersList.addUser(vika);
		usersList.addUser(lesha);
		usersList.addUser(ivan);

		System.out.println("number of users = " + usersList.getNumberOfUsers());

		try {
			usersList.getUserById(4).printUser();
			usersList.getUserById(8).printUser();
			usersList.getUserById(15).printUser();
		}
		catch (UserNotFoundException e) {
    		System.out.println("\u001B[31m" + e + "\u001B[37m");
		}
		try {
			usersList.getUserByIndex(2).printUser();
			usersList.getUserByIndex(9).printUser();
			usersList.getUserByIndex(19).printUser();
		}
		catch (UserNotFoundException e) {
			System.out.println("\u001B[31m" + e + "\u001B[37m");
		}
	}
}

