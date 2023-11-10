package trainings;

public class Socks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] color= {1,2,1,2,2,3,4,2,2};
		int pairs=0;
		int unpaired=0;
		for(int i=0;i<color.length;i++) {
			int count=0;
			for(int j=i;j<color.length;j++) {
				if(color[i]==color[j]) 
				count++;
			}
			if(count%2==0) {
				pairs++;
			}else {
				unpaired=color.length-(pairs*2);
			}
		}

			System.out.println("paired socks:   " +pairs);
		    System.out.println("unpaired socks: " +unpaired);

		}
	}



