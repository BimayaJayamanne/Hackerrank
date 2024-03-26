import java.io.*;
import java.util.*;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();

		if (s.isEmpty()) {
			System.out.println("0");

		} else {
			String[] tokens = s.split("[ !,?._'@]+");
			System.out.println(tokens.length);

			for (int i = 0; i < tokens.length; i++) {
				String token = tokens[i];
				System.out.println(token);
			}
		}
		scan.close();
	}
}

