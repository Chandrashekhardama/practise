package fillststem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSortExample {

	public static void main(String[] args) {

		String filepath = "C:\\Users\\chand\\OneDrive\\Desktop\\data.txt";
		List<String> items = new ArrayList<>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(filepath));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				for (String part : parts) {
					String trimed = part.trim();
					if (!trimed.isEmpty()) {
						items.add(trimed);
					}
				}
			}
			// sorted
			Collections.sort(items);

			for (String string : items) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
