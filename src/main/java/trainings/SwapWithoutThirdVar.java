package trainings;

import java.util.Arrays;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swapping string without third variable
		String a="one";
		String b="two";

		a = a.concat(" " + b); //one two
		b = a.split(" ")[0];   //one
		a = a.split(" ")[1];   //two
		System.out.println(a+" "+b);
		
		//swapping string without third variable
		
		String x= "one";
		String y= "two";
		int len=x.length();
		x=x+y; //saiswetha
		y=x.substring(0,len);
		/*
		 * y= y.substring(0, y.length() - y.length()); x=x.substring(y.length());
		 */
		x=x.substring(len);
		System.out.println(x+" "+y);
		
		//swapping int without third variable
		int a1=10;
		int b1=20;
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println(a1+" "+b1);
		
		String s="sai";
		System.out.println(s);
		String[] ar=s.split("");
		System.out.println(Arrays.toString(ar));
		
	
				


	}

}
