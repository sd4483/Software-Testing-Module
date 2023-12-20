package BinarySearch;

public class BinarySearch {
	
	public static void main(String[] args) {
		System.out.println("This works!");
		//int[] xs = {1,2,3,5,6,7,8,9,10};
		//int[] xs1 = {12,13,16,17,19};
		int[] xs2 = {1,2,3,4,5,6,7,8,9,10};
		
		//System.out.println(binarysearch(7, xs));
		//System.out.println(binarysearch(11, xs1));
		System.out.println(binarysearch(6, xs2));
	}
	
	public static int binarysearch(int x, int[] xs) {
        int lower = 0;
        int upper = xs.length - 1;
        while(lower < upper) {
        //while(lower <= upper) {
        	System.out.println("Loop executed");
        	System.out.println("4");
            int m = lower/2 + upper/2;
        	System.out.println("5");
            System.out.println("6");
            if(x == xs[m])
            {
                System.out.println("7");
                return m;
            } 
            else if(x < xs[m]) 
            {
            	System.out.println("8 & 9");
            	upper = m;
            	//upper = m-1;
            } else {
                System.out.println("10 & 11");
                lower = m;
                //lower = m+1;
            }
        }
        return -1;
    }  
}
