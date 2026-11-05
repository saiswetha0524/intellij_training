package trainings;

public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n=5;

		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<n;j++) {
				if(arr[i]+arr[j]==n) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}

		}
		System.out.println(n);

	}

}
