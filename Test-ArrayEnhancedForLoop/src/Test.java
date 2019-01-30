
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int bucky[] = {3,4,5,6,7};
		int total = 0;
		
		for (int x: bucky) {
			total += x;
		}
		System.out.println(total);
		List<String> listofStrings = new ArrayList<String>();
		listofStrings.add("AAA");
		listofStrings.add("BBB");
		listofStrings.add("CCC");
		listofStrings.add("DDD");
		listofStrings.add("EEE");
		listofStrings.add("FFF");
		listofStrings.add("GGG");
		listofStrings.add("HHH");
		
		System.out.println("\nList items: ");
		for(String s: listofStrings) {
			System.out.println(s);
		}
		System.out.println("\n" + listofStrings.remove(0));
		
		System.out.println("\nList items: ");
		for(int i =0; i < listofStrings.size(); i++) {
			System.out.println(listofStrings.get(i));
		}
		int a=5, b=6, c=7, d=8;
		int x[] = {5,6,7,8};
		int y[] = {6,7,8,9};
		int z[] = {9,8,7,6};
		
		int p[][] = {
				{5,6,7,8},
				{6,7,8,9},
				{9,8,7,6},
		};
		for(int i[] : p) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.print("\\dog\\cat");
	}

}

		/**
		 * for(int i =0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(p[i][j] + " ");
			}
			System.out.println("+");
		}
	}

}
*/
