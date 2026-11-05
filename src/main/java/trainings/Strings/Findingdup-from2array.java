package trainings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Findingdupsarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = Arrays.asList("AB", "BC", "DE");
		List<String> l2 = Arrays.asList("AB", "GT", "DE");
		  //with stream 
		System.out.println("using streams");
		List<String> duplicates=l1.stream().filter(str->l2.contains(str)).collect(Collectors.
		  toList()); System.out.println(duplicates);
		 

		// using for loop
		System.out.println("using for loop");
		String[] a = { "AB", "BC", "DE" };
		String[] b = { "AB", "GT", "DE" };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}}}
		
		//using arraylist for loop
		System.out.println("using arraylist with for loop");

		List<String> list1=Arrays.asList("AB", "BC", "DE");
		List<String> list2 = Arrays.asList("AB", "GT", "DE");
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.containsAll(list2)) {
					System.out.println(list1);
				}}}
		
		// using method
		System.out.println("using arraylist method");
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("AB", "BC", "DE"));
		ArrayList<String> li = new ArrayList<String>(Arrays.asList("AB", "GT", "DE"));
		l.retainAll(li);
		System.out.println(l);

		/*
		 * String[] l1= {"AB", "BC", "DE"}; String[]l2= {"AB", "GT", "DE"}; boolean
		 * result=Arrays.stream(l1).filter(str->
		 * Arrays.stream(l2).anyMatch((str2->str2==str)) ) != null;
		 * System.out.println(result);
		 */

		/*
		 * //for number List<Integer> l3=Arrays.asList(1,2,4,5); List<Integer>
		 * l4=Arrays.asList(1,2,3,5); List<Integer>
		 * duplicates1=l3.stream().filter(num->l4.contains(num)).collect(Collectors.
		 * toList()); System.out.println(duplicates1);
		 */

	}

}
