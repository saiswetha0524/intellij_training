package trainings;


public class Numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5};
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<i;j++) {
				  System.out.print(" ");
				  }
			
			  for(int k=0; k<num.length-i;k++) {
				  
				  System.out.print(num[i]++); 
				  }
			  System.out.println();
		}

	}
}


