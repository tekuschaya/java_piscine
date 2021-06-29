import java.util.Scanner;

public class Program
{
	private static void isPrime(int n)
	{
		int count = 1;
		for (int i = 2; i * i <= n; i++)
		{
			if (n % i == 0)
			{
				System.out.println("false " + count);
				System.exit(0);
			}
			count++;
		}
		System.out.println("true " + count);
	}

  	public static void main(String[] args)
  	{
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt() == false)
		{
			System.out.println("IllegalArgument");
			scan.close();
			System.exit(-1);
		}
		int number = scan.nextInt();
		scan.close();
		if (number < 2)
		{
			System.err.println("IllegalArgument");
			System.exit(-1);
		}
		else if (number == 2)
			System.out.println("true 1");
		else
			isPrime(number);
  	}
}