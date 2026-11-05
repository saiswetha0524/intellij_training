package trainings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="saiswetha";
		//System.out.println(s);
		String[] ar=s.split("");
		//System.out.println(Arrays.toString(ar));
		
		
		IntStream.range(0, ar.length/2).forEach(i->{
		
	
			String temp = ar[i];
			
	//		System.out.println("temp is " +temp);

			ar[i]=ar[ar.length-i-1];
		//	System.out.println("a[i] is: " +ar[i]);

			ar[ar.length-i-1]=temp;
		//	System.out.println("ar[ar.length-i-1] is: " +ar[ar.length-i-1]);

			//System.out.println(Arrays.toString(ar));
		}
		
			);
		System.out.println(Arrays.toString(ar));
		
		
	}

}
