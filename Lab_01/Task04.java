package Lab_01;

public class Task04 {
	public static void main(String[] args) {
	       //addOld(-10,10);
	       addNew(-10,10);
	       addNew(0,-10);
	       addNew(252,-253);
	    }
	    
		/*
		public static void addOld(int x, int y) {
	        int sum = y;
	        while (x != 0){
	            if (x < 0) {
	                sum = sum - 1;
	                x = x + 1;
	            }
	            else {
	                sum = sum + 1;
	                x = x - 1;
	            }
	        }
	        System.out.println(sum);
	    }
		*/
	    
	    public static void addNew(int x, int y) {
	        int sum = y;
	        
	        do {
	        	sum = sum - 1;
	        	x = x + 1;
	        }while(x <= 0);
	        
	        do {
	        	sum = sum + 1;
	        	x = x - 1;
	        }while(x > 0);
	        
	        System.out.println(sum);
	    }
}
