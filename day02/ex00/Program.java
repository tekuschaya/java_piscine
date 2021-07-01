import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class Program {

	public static void writeSignature(String signature) {
 		try (FileWriter writer = new FileWriter("result.txt", true)) {        
			/*BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(signature + "\n");
            bufferWriter.close();*/
            writer.write(signature);
            writer.append('\n');
			writer.flush();
			writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }

	public static void checkFile(String line, HashMap<String, String> signatures) {
		File f = new File(line);
		if (f.isFile() == false || f.canRead() == false) {
			System.err.println("Incorrect path to file, enter a new path:");
			return;
		}
		else {
			try {
				FileInputStream in = new FileInputStream(f);
				byte[] bytes = new byte[8];
				in.read(bytes);
				//System.out.println("bytes = " + bytes);
				in.close();
				StringBuilder sb = new StringBuilder(); //Расширяемая строка, которую можно изменять без ущерба для производительности
    			for (byte b : bytes) { //цикл forEach
        			sb.append(String.format("%02X", b));
					if (signatures.containsKey(sb.toString())) {
						//System.out.println("signatures = " + signatures.get(sb.toString()));
						writeSignature(signatures.get(sb.toString()));
						return;
					}
    			}
   				System.out.println(sb.toString());
			}
			catch (Exception e) {
				e.printStackTrace();
        	}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> signatures = new HashMap<>();
		try (FileWriter writer = new FileWriter("result.txt", false)) {  
			writer.close();      
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		try (BufferedReader br = new BufferedReader(new FileReader("signatures.txt"))) {
    		for (String sign; (sign = br.readLine()) != null; ) {
				/*System.out.println("sign = " + sign);
				System.out.println(sign.substring(0, sign.indexOf(',')));
				System.out.println(sign.substring(sign.indexOf(',') + 1).replaceAll("\\s+",""));*/
				signatures.put(sign.substring(sign.indexOf(',') + 1).replaceAll("\\s+",""), sign.substring(0, sign.indexOf(',')));
				//System.out.println("key = " + sign.substring(sign.indexOf(',') + 1).replaceAll("\\s+",""));
    		}
		}
		catch (Exception e) {
			e.printStackTrace();
        }
		String line = scan.next();
		while (line.equals("42") == false) {
			checkFile(line, signatures);
			line = scan.next();
		}
	}
}