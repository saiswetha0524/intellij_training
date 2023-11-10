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
