package Lab_01;

public class Task04 {
	
	public static int addNew(int x, int y) {
		
		int sum = y;
	    
		do {
	    	sum = sum - 1;
	        x = x + 1;
	    } while(x <= 0);
	        
	    do {
	        sum = sum + 1;
	        x = x - 1;
	    } while(x > 0);
	    
	    return sum;
	        
	}
	
	public static int addOld(int x, int y) {
		
		int sum = y;
		
		while (x != 0) 
		{	
			if (x < 0) {
				sum = sum - 1;
				x = x + 1;
			}
			
			else {
				sum = sum + 1;
				x = x - 1;
			}
		}
		return sum;
	}
}
