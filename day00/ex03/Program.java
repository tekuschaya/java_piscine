import java.util.Scanner;

public class Program
{
	private static void illegalArgument()
	{
		System.err.println("IllegalArgument");
		System.exit(-1);
	}

	private static long myPow(int week_number)
	{
		long res = 1;
		for (int i = 1; i < week_number; i++)
			res *= 10;
		return res;
	}

	private static void printStatistic(int week_number, long data)
	{
		int count = 0;
		for (int i = 1; i <= week_number; i++)
		{
			System.out.print("Week ");
			System.out.print(i);
			System.out.print(" ");
			count = (int)(data % 10);
			data /= 10;
			for (int j = 0; j < count; j++)
				System.out.print("=");
			System.out.println(">");
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String week = scan.next();
		int week_number = 1;
		int score = 1;
		int min_week = 0;
		int min_score = 9;
		long data = 0;
		while (week.equals("42") == false)
		{
			if (week.equals("Week") == false || scan.hasNextInt() == false)
				illegalArgument();
			week_number = scan.nextInt();
			if (week_number - min_week != 1 || week_number > 18)
				illegalArgument();
			min_week = week_number;
			for (int i = 0; i < 5; i++)
			{
				if (scan.hasNextInt() == false)
					illegalArgument();
				score = scan.nextInt();
				if (score < 1 || score > 9)
					illegalArgument();
				if (score < min_score)
					min_score = score;
			}
			data = data + min_score * myPow(week_number);
			min_score = 9;
			week = scan.next();
		}
		scan.close();
		printStatistic(week_number, data);
	}
}