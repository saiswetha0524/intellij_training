package trainings;

import java.util.Arrays;
import java.util.List;

public class Findingoccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "saiswetha";
		String completed = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			
			String string=String.valueOf(str.charAt(i));
			System.out.println(string);
			if(!completed.contains(string)) {
				completed=completed+string;
			}else {
				continue;
			}
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println("Total number of count of occurance of " + str.charAt(i) +
					 " is " + count);
			
	}

	}
}
