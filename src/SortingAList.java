import java.util.ArrayList;
import java.util.Collections;

public class SortingAList {

	public static void main(String[] args) {
		
		//This was for showing the declaration of a String
		//String name = "Greco";
		
		
//		String name1 = "Jules";
//		String name2 = "Greco";
//		
//		//This organizes by the first letter of the String: 
//		//J is 8 letters before R
//		//Does it return negative, positive , or zero
//		System.out.println("V1.0 = " + name2.compareTo(name1));
//		
//		
//		//Goes to the first different letter
//		String name3 = "Smitty";
//		String name4 = "Smith";
//		
//		System.out.println("V1.2 = " + name3.compareTo(name4));
		
		
		ArrayList<String> names =  new ArrayList();
		
		names.add("Tom");
		names.add("Adam");
		names.add("John");
		
		//one line to put in alphabetical order
		Collections.sort(names);
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
		

	}

}
