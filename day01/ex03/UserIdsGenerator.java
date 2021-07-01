public class UserIdsGenerator {

	private int id = 1;
	private static UserIdsGenerator instance;

	private UserIdsGenerator() {}
	public static UserIdsGenerator getInstance() {
		if (instance == null) {
			instance = new UserIdsGenerator();
		}
		return instance;
	}
	public int generateId() {
		return this.id++;
	}
}