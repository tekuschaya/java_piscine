import java.util.Scanner;

public class Program
{
	private static void IsPrime(int n)
	{
		int count = 1;
		//int d = 2;
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
			System.out.println("Error. It's not a number!");
			System.exit(0);
		}
		int number = scan.nextInt();
		if (number < 2)
		{
			System.err.println("IllegalArgument");
			System.exit(-1);
		}
		else if (number == 2 || number == 3)
		{
			System.out.println("true 1");
			System.exit(0);
		}
		IsPrime(number);
  }
}