import java.util.Scanner;

public class Program
{
	private static boolean IsPrime(int n)
	{
		if (n == 2 || n == 3)
			return true;
		for (int i = 2; i * i <= n; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private static int SumNumber(int n)
	{
		int res = 0;
		while (n != 0)
		{
			res += n % 10;
			n /= 10;
		}
		return res;
	}

  	public static void main(String[] args)
  	{
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		while (number != 42)
		{
			if (IsPrime(SumNumber(number)))
				count++;
			number = scan.nextInt();
		}
		System.out.println("Count of coffee-request - " + count);
  	}
}