public class UsersArrayList implements UserList//implements userlist?
{
	User[] users = new User[10];
	//private int size = 0;

	//конструктор?
	//переменная size

	public void addUser(User user)
	{
		for (int i = 0; i < users.length; i++)
		{
			if (users[i] != null && users[i].getId() == user.getId())
			{
				System.out.println("User " + users[i].getName() + " already exist");
				break;
			}
			if (users[i] == null)
			{
				users[i] = user;
				break;
			}
			if (i == users.length - 1)
			{
				User[] new_users = new User[users.length * 2];
				for (int j = 0; j < users.length; j++)
					new_users[j] = users[j];
				new_users[users.length] = user;
				users = new_users;
			}
		}
	}

	public User getUserById(int id) throws UserNotFoundException
	{
		System.out.println("length = " + users.length);
		for (int i = 0; i < users.length; i++)
		{
			if (users[i] != null && users[i].getId() == id)
				return users[i];
		}
		throw new UserNotFoundException();
	}

	public User getUserByIndex(int index) throws UserNotFoundException
	{
		if (index >= 0 && index < users.length && users[index] != null)
			return users[index];
		throw new UserNotFoundException();
	}

	public int getNumberOfUsers() 
	{
		int i = 0;		
		while (i < users.length && users[i] != null)
			i++;
		return i;
	}


}
