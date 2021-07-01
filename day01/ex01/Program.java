public class Program {

	public static void main(String[] args) {
		User olga = new User("Olga", 1000);
		User dima = new User("Dima", 2000);
		User kolya = new User("Kolya", 3000);
		System.out.println("name = " + olga.getName() + " id = " + olga.getId());
		System.out.println("name = " + dima.getName() + " id = " + dima.getId());
		System.out.println("name = " + kolya.getName() + " id = " + kolya.getId());
	}
}