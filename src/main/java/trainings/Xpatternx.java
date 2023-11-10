package trainings;

public class Xpatternx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int x=n*2-1;
		for (int i = 1; i <= x; i++) {

			for (int j = 1; j <=x; j++) {
				if(j==i ||j==x-i+1) 
				System.out.print("X");
				System.out.print(" ");
			}

			System.out.println();

		}
		}
	}


		

	


