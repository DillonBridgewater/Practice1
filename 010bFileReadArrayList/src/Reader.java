import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,:;?\"[]'";
		String fileName = "/home/compsci/eclipse-workspace/textfiles/Kennedy_Cuba_Crisis.txt";
		String line;
		ArrayList aList = new ArrayList();
		KennedyCount newCounter = new KennedyCount();
		ArrayList<Integer> characterCounter = new ArrayList();
		try {
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			if (!input.ready()) {
				input.close();
				throw new IOException();
			}
			while ((line = input.readLine()) != null) {
				aList.add(line);
			}
			input.close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		// Test

		int sz = aList.size();
		for (int i = 0; i < alpha.length(); i++) {
			characterCounter.add(0);
		}

		for (int i = 0; i < sz; i++) {
			String letter = aList.get(i).toString();
			for (int f = 0; f < letter.length(); f++) {
				String character = String.valueOf(letter.charAt(f));
				for (int j = 0; j < alpha.length(); j++) {
					if (character.equalsIgnoreCase(String.valueOf(alpha.charAt(j)))) {
						int count = characterCounter.get(j) + 1;
						characterCounter.set(j, count);
					}
				}
			}
		}
		characterCounter = newCounter.bubbleSort(characterCounter);
		System.out.println("Results for bubbleSort");
		alpha = newCounter.getAlpha();
		for (int i = 0; i < characterCounter.size(); i++) {
			System.out.println(alpha.charAt(i) + "=" + characterCounter.get(i));
		}
		characterCounter = newCounter.insertionSort(characterCounter);
		System.out.println("Results for insertionSort ArrayList");
		alpha = newCounter.getAlpha();
		for (int i = 0; i < characterCounter.size(); i++) {
			System.out.println(alpha.charAt(i) + "=" + characterCounter.get(i));
		}
		Integer[] x = new Integer[characterCounter.size()];
		x = characterCounter.toArray(x);
		x = newCounter.insertionSort(x);
		System.out.println("Results for insertionSort Array");
		alpha = newCounter.getAlpha();
		for (int i = 0; i < x.length; i++) {
			System.out.println(alpha.charAt(i) + "=" + x[i]);
		}
		x = characterCounter.toArray(x);
		x = newCounter.mergeSort(x, 0, characterCounter.size() - 1);
		System.out.println("Results for mergeSort");
		alpha = newCounter.getAlpha();
		for (int i = 0; i < characterCounter.size(); i++) {
			System.out.println(alpha.charAt(i) + "=" + characterCounter.get(i));
		}

		characterCounter = newCounter.Quick(characterCounter);
		System.out.println("Results for QuickSort");
		alpha = newCounter.getAlpha();
		for (int i = 0; i < characterCounter.size(); i++) {
			System.out.println(alpha.charAt(i) + "=" + characterCounter.get(i));
		}
		characterCounter = newCounter.selection(characterCounter);
		System.out.println("Results for SelectionSort");
		alpha = newCounter.getAlpha();
		for (int i = 0; i < characterCounter.size(); i++) {
			System.out.println(alpha.charAt(i) + "=" + characterCounter.get(i));
		}

	}
}

// end of Reader
