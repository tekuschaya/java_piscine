import java.util.Scanner;
import java.util.Vector;
import java.io.*;
import java.util.HashMap;
import java.util.TreeSet;
import java.lang.Math;

public class Program {

	public static void countSimilarity(Vector<Integer> v1, Vector<Integer> v2) {
		int numerator = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < v1.size(); i++) {
			numerator += v1.get(i) * v2.get(i);
			sum1 += v1.get(i) * v1.get(i);
			sum2 += v2.get(i) * v2.get(i);
		}
		System.out.println("num = " + numerator + " sum1 = " + sum1 + " sum2 = " + sum2);
		double sim = numerator / (Math.sqrt(sum1) * Math.sqrt(sum2));
		//System.out.println("Similarity = " + String.format("%.2f", sim));
		System.out.println("Similarity = " + (long)(sim * 1e2) / 1e2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String file1 = scan.next();
		String file2 = scan.next();
		scan.close();
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		TreeSet<String> dict = new TreeSet<String>();
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();

		try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {
    		for (String line; (line = br1.readLine()) != null; ) {
				//System.out.println("line1 = " + line);
				String[] words = line.split("\\s+");
        		for (String word : words) {
            		//System.out.println(word);
					dict.add(word);
					if (map1.containsKey(word)) {
						//map1.put(word, Integer.valueOf(map1.get(word).intValue() + 1));
						map1.put(word, map1.get(word) + 1);
					}
					else {
						map1.put(word, 1);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
        }
		try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
    		for (String line; (line = br2.readLine()) != null; ) {
				String[] words = line.split("\\s+");
        		for (String word : words) {
            		//System.out.println(word);
					dict.add(word);
					if (map2.containsKey(word)) {
						map2.put(word, map2.get(word) + 1);
						//map2.put(word, Integer.valueOf(map1.get(word).intValue() + 1));
					}
					else {
						map2.put(word, 1);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
        }
		System.out.println("set = " + dict);
		for (String word : dict) {
			if (map1.get(word) != null) {
				v1.add(map1.get(word));
			}
			else {
				//v1.add(new Integer(0));
				v1.add(0);
			}
			if (map2.get(word) != null) {
				v2.add(map2.get(word));
			}
			else {
				//v2.add(new Integer(0));
				v2.add(0);
			}
		}
		//Integer i = 0;
		//v1.add(i);
		System.out.println("v1 = " + v1 + "  v2 = " + v2);
		countSimilarity(v1, v2);
	}
}