
public class Bubble {

	public static void main(String[] args) {
	int[] list1 = new int[] {5,8,1,6,9,2};
	for (int i = 0; i < (list1.length); i++) {
		System.out.print(list1[i]);
	}
	int[] list2 = bubbleSort(list1);
	System.out.println("");
	for (int i = 0; i < list2.length; i++) {
		System.out.print(list2[i]);
	}
}
	static int[] bubbleSort (int[] list) {
		int i, j, temp = 0;
		for (i=0; i < list.length - 1; i++) {
			for (j=0; j < list.length-1-i; j++) {
				if (list[j] < list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
				
			}
		}
		return list;
	}
	}
