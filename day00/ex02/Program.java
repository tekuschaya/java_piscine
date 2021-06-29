import java.util.Scanner;

public class Program
{
	private static boolean isPrime(int n)
	{
		if (n == 2)
			return true;
		for (int i = 2; i * i <= n; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private static int sumNumber(int n)
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
			if (isPrime(sumNumber(number)))
				count++;
			number = scan.nextInt();
		}
		scan.close();
		System.out.println("Count of coffee-request - " + count);
  	}
}