package interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printing unique digits
		
		  List<Integer> list=Arrays.asList(3,4,5,5,66,66,77);
		  
		  
		  HashSet<Integer> hs=new HashSet<>();
		  
		  hs.addAll(list);
			
		  List<Integer> result=hs.stream().filter(n->!hs.add(n)).collect(Collectors.toList());
		  System.out.println(result); 
		  
		 // System.out.println(hs);
		  
			
		 
			// printing duplicates
			  int[] arr= {3,4,5,5,66,66,77};
			  
			  for(int i=0; i<arr.length;i++){
				  for(int j=0; j<i;j++) {
					  if(arr[i]==arr[j]){
			  System.out.println(arr[i]); 
			  	  } 
				  }
	 
	

	

}
	}

}
