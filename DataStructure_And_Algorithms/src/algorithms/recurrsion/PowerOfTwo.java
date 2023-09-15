package algorithms.recurrsion;

public class PowerOfTwo {
	
	 public static boolean isPowerOfTwo(int n) {
	        if(n == 0){
	            return false;
	        }
	        int rem = devideByTwo(n);
	        if(rem == 1){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    public static int devideByTwo(int n){
	    	System.out.println("start : "+n);
	        
	    	if(n == 1) {
	    		return 1;
	    	}else if(n % 2 == 0) {
	        	n = devideByTwo(n/2);
	        	System.out.println("End: "+n);
	 	        return n;
	        }else {
	        	return 0;
	        }
	        
	       
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println(isPowerOfTwo(n));

	}

}
