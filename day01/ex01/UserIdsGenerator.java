public class UserIdsGenerator
{
	private int id = 1;
	private static UserIdsGenerator generator = new UserIdsGenerator();

	private UserIdsGenerator() {}

	public static UserIdsGenerator getInstance()
	{
		return generator;
	}

	public int generateId()
	{
		return this.id++;
	}

}