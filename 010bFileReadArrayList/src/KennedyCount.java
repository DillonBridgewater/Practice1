import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class KennedyCount {
	public static String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,:;?\"[]'";

	public ArrayList<Integer> bubbleSort(ArrayList<Integer> List) {
		int i, j, temp = 0;
		for (i = 0; i < List.size() - 1; i++) {
			for (j = 0; j < List.size() - 1 - i; j++) {
				if (List.get(j) < List.get(j + 1)) {
					temp = List.get(j);
					List.set(j, List.get(j + 1));
					List.set(j + 1, temp);
					char[] alphaChars = alpha.toCharArray();
					temp = alphaChars[j];
					alphaChars[j] = alphaChars[j + 1];
					alphaChars[j + 1] = (char) temp;
					alpha = String.valueOf(alphaChars);
				}

			}
		}
		return List;
	}

	public ArrayList<Integer> insertionSort(ArrayList<Integer> List) {
		int i, j, key, temp;
		for (i = 1; i < List.size(); i++) {
			key = List.get(i);
			j = i - 1;
			while (j >= 0 && key > List.get(j)) {
				temp = List.get(j);
				List.set(j, List.get(j + 1));
				List.set(j + 1, temp);
				char[] alphaChars = alpha.toCharArray();
				temp = alphaChars[j];
				alphaChars[j] = alphaChars[j + 1];
				alphaChars[j + 1] = (char) temp;
				alpha = String.valueOf(alphaChars);
				j--;
			}
		}
		return List;

	}

	public Integer[] insertionSort(Integer[] List) {
		int i, j, key, temp;
		for (i = 1; i < List.length; i++) {
			key = List[i];
			j = i - 1;
			while (j >= 0 && key > List[j]) {
				temp = List[j];
				List[j] = List[j + 1];
				List[j + 1] = temp;
				char[] alphaChars = alpha.toCharArray();
				temp = alphaChars[j];
				alphaChars[j] = alphaChars[j + 1];
				alphaChars[j + 1] = (char) temp;
				alpha = String.valueOf(alphaChars);
				j--;

			}

		}
		return List;
	}
	// example of merge sort in Java
	// merge function take two intervals
	// one from start to mid
	// second from mid+1, to end
	// and merge them in sorted order

	public void merge(Integer Arr[], int start, int mid, int end) {

		// create a temp array
		int temp[] = new int[end - start + 1];

		// crawlers for both intervals and for temp
		int i = start, j = mid + 1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in
		// temp
		while (i <= mid && j <= end) {
			if (Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k += 1;
				i += 1;
			} else {
				temp[k] = Arr[j];
				k += 1;
				j += 1;
			}
		}

		// add elements left in the first interval
		while (i <= mid) {
			temp[k] = Arr[i];
			k += 1;
			i += 1;
		}

		// add elements left in the second interval
		while (j <= end) {
			temp[k] = Arr[j];
			k += 1;
			j += 1;
		}

		// copy temp to original interval
		for (i = start; i <= end; i += 1) {
			Arr[i] = temp[i - start];
		}
	}

	// Arr is an array of integer type
	// start and end are the starting and ending index of current interval of Arr

	Integer[] mergeSort(Integer[] x, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(x, start, mid);
			mergeSort(x, mid + 1, end);
			merge(x, start, mid, end);
		}
		return x;
	}

	public String getAlpha() {
		return alpha;
	}
	public ArrayList<Integer> Quick(ArrayList<Integer> List) {
		Quick(List, 0, List.size()-1);
		return List;
	}
	private void Quick(ArrayList<Integer> List, int low, int high) {
		if (low <high+1) {
			int p = partition(List, low, high);
			Quick(List, low, p-1);
			Quick(List, p+1, high);
		}
	}
	private void swap(ArrayList<Integer> List, int index1, int index2) {
		int temp = List.get(index1);
		List.set(index1,List.get(index2));
		List.set(index2, temp);
		char[] alphaChars = alpha.toCharArray();
		temp = alphaChars[index1];
		alphaChars[index1] = alphaChars[index2];
		alphaChars[index2] = (char) temp;
		alpha = String.valueOf(alphaChars);
	}
	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high-low) + 1) + low;
	}
	private int partition(ArrayList<Integer> List, int low, int high) {
		swap(List, low, getPivot(low,high));
		int border = low+1;
		for (int i = border; i <=high; i++ ) {
			if(List.get(i) < List.get(low)) {
				swap(List,i,border++);
			}
		}
		swap(List,low,border - 1);
		return border-1;
	}
	public ArrayList<Integer> selection(ArrayList<Integer> List) {
		int i,j,minValue,minIndex,temp = 0;
		for (i = 0; i < List.size(); i++) {
			minValue = List.get(i);
			minIndex = i;
			for (j=i; j > List.size()-1; j++); {
				if (List.get(j) < minValue) {
					minValue = List.get(j);
					minIndex = j;
				}
			}
			if (minValue > List.get(i)) {
				temp = List.get(i);
				List.set(i, List.get(minIndex));
				List.set(minIndex, temp);
				char[] alphaChars = alpha.toCharArray();
				temp = alphaChars[j];
				alphaChars[j] = alphaChars[j + 1];
				alphaChars[j + 1] = (char) temp;
				alpha = String.valueOf(alphaChars);
				j--;
			}
		}
		return List;
	}
	}


