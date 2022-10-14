package pkg1;

import java.util.Arrays;

public class gittpro {

	public static void main(String[] args) {
		
		//  1st method
	 int a[]= new int [4];
	   	 a[0]=10;
	     a[1]=20;
	     a[2]=30;
	     a[3]=40;
	     a[4]=50;
	 
	     //second method 
	     
	     int b[]= {100,200,300,400,500};
	     
	     // size of any array = last index+1
	     // last index = size-1
	     //To print an array
	     
	     System.out.println(Arrays.toString(a)); // printing complete array of a
	     System.out.println(Arrays.toString(b)); //printing complete array of b
	     System.out.println(a[2]);    			 // printing index 3 array of a
	     
	     //Size of an array
	     
	     System.out.println(a.length); 			 // size of array a
	     System.out.println(b.length);			 // size of array b
	     System.out.println(a.length + b.length);// addition of size of array a and b
	     
	     
	}



	}


