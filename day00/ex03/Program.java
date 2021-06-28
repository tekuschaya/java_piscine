import java.util.Scanner;

public class Program
{
	private static void IllegalArgument()
	{
		System.err.println("IllegalArgument");
		System.exit(-1);
	}

	private static long MyPow(int week_number)
	{
		long res = 1;
		for (int i = 1; i < week_number; i++)
			res *= 10;
		return res;
	}

	private static void PrintStatistic(int week_number, long data)
	{
		//String res = " ";
		int count = 0;
		// System.out.print("Week ");
		// System.out.print(i);
		// System.out.print(" ");
		for (int i = 1; i <= week_number; i++)
		{
			System.out.print("Week ");
			System.out.print(i);
			System.out.print(" ");
			count = (int)(data % 10);
			data /= 10;
			for (int j = 0; j < count; j++)
				System.out.print("=");
				//res += "=";
			System.out.println(">");
			//System.out.println("Week " + i + res + ">");
			//res = " ";
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
				IllegalArgument();
			week_number = scan.nextInt();
			if (week_number - min_week != 1 || week_number > 18)
				IllegalArgument();
			min_week = week_number;
			for (int i = 0; i < 5; i++)
			{
				if (scan.hasNextInt() == false)
					IllegalArgument();
				score = scan.nextInt();
				if (score < 1 || score > 9)
					IllegalArgument();
				if (score < min_score)
					min_score = score;
			}
			data = data + min_score * MyPow(week_number);
			min_score = 9;
			week = scan.next();
		}
		PrintStatistic(week_number, data);
	}
}