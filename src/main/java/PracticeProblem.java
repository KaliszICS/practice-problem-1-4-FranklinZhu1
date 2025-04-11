import java.io.*;
import java.util.*;

public class PracticeProblem {

	public static String getName(int line, String file) {
		Scanner in = null;
		try {
			if (line < 1) return "";
			in = new Scanner(new BufferedReader(new FileReader(file)));
			for (int i = 0; i < line - 1; ++i) in.nextLine();
			return in.next() + " " + in.next();
		}
		catch (Exception e) {
			return "";
		}
		finally {
			if (in != null) in.close();
		}
	}

	public static int getAge(int line, String file) {
		Scanner in = null;
		try {
			if (line < 1) return -1;
			in = new Scanner(new BufferedReader(new FileReader(file)));
			for (int i = 0; i < line - 1; ++i) in.nextLine();
			in.next(); // skip the first name
			in.next(); // skip the last name
			return in.nextInt();
		}
		catch (Exception e) {
			return -1;
		}
		finally {
			if (in != null) in.close();
		}
	}

	public static int getNumber(int line, String file) {
		Scanner in = null;
		try {
			if (line < 1) return -1;
			in = new Scanner(new BufferedReader(new FileReader(file)));
			for (int i = 0; i < line - 1; ++i) in.nextLine();
			in.next(); // skip the first name
			in.next(); // skip the last name
			in.nextInt(); // skip the age
			return in.nextInt();
		}
		catch (Exception e) {
			return -1;
		}
		finally {
			if (in != null) in.close();
		}
	}

	public static void fileAppend(String output, String filename) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename, true));
			bw.write(output);
		}
		catch (IOException e) {
			return;
		}
		finally {
			try {
				if (bw != null) bw.close();
			}
			catch (IOException e) {
				return;
			}
		}
	}
}
