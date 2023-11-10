package trainings;

import java.util.HashMap;

public class nov6th {
	public static void main(String[] args) {
		 String a = "saiswetha";
		    
	      HashMap<Character,Integer> map = new HashMap<>();	      


	      for(char s:a.toCharArray())    //enhanced for loop
	    	  
	   	      

	            map.put(s , map.getOrDefault(s, 0)+1);
	          
	         
	      
	      System.out.println(map);
	   }
} 

