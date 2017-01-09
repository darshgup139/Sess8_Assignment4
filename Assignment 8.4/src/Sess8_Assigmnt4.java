import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sess8_Assigmnt4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		FileReader fr = new FileReader("E:\\Eclipse\\Eclipse Projects\\Assignment 8.4\\src\\File.txt");
		BufferedReader br = new BufferedReader(fr);
		String text;
		while ((text = br.readLine()) != null) {
			for (int i = 0; i < text.length(); i++) {
				char ch = text.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					count++;
				}
			}
		}

		System.out.println("No. of vowels = " + count);
	}
}

/*
******************************************************************************
Output:
No. of vowels = 13
******************************************************************************
*/

