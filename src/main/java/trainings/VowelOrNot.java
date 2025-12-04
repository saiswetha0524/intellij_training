package trainings;



public class VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find if vowels are present in a string
		String[] vowels= {"a", "e", "i", "o", "u"};
		
		
		  String name="sai";
		  String[] namearray=name.split("");
		  
		  for(int i=0;i<namearray.length;i++) {
				for(int j=0;j<vowels.length;j++) {
					if(namearray[i].contains(vowels[j])) {

					System.out.println("vowels is present : " +namearray[i]);
				}
			}
		}
		
		  /*
			 * Scanner sc=new Scanner(System.in); String scanned=sc.nextLine(); String[]
			 * scannedarray=scanned.split("");
			 */
			 // System.out.println(Arrays.toString(scannedarray));
			  
		  
		/*
		 * for(int i=0;i<scannedarray.length;i++) { for(int j=0;j<vowels.length;j++) {
		 * if(scannedarray[i].contains(vowels[j])) {
		 * 
		 * System.out.println("vowels is present : " +scannedarray[i]); } } }
		 */
	}

}




import java.util.*;
import java.util.stream.Collectors;

public class FullVowelProgram {

    public static void main(String[] args) {

        String name = "Saiswetha";

        // Convert array → Set
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));

        // 1. Print vowels
        System.out.println("Vowels:");
        Arrays.stream(name.split(""))
              .filter(ch -> vowels.contains(ch.toLowerCase()))
              .forEach(System.out::println);

        // 2. Count total vowels
        long count =
                Arrays.stream(name.split(""))
                      .filter(ch -> vowels.contains(ch.toLowerCase()))
                      .count();
        System.out.println("Total vowels: " + count);

        // 3. Frequency map
        Map<String, Long> freq =
                Arrays.stream(name.split(""))
                      .map(String::toLowerCase)
                      .filter(vowels::contains)
                      .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Frequency: " + freq);

        // 4. List of vowels
        List<String> list =
                Arrays.stream(name.split(""))
                      .filter(ch -> vowels.contains(ch.toLowerCase()))
                      .toList();
        System.out.println("List: " + list);
    }
}

