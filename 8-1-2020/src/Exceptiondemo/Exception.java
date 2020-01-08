package Exceptiondemo;

public class Exception {

	public static void main(String[] args) {
	     new Exception().doTheWork();
	    }
	    public void doTheWork() {
	        Object o = null;
	        
	        for (int i=0; i<5; i++) {
	            try {
	                o = makeObj(i);
	            } catch (IllegalArgumentException e) {
	            	e.printStackTrace();
	                System.err.println("IllegalArgumentException is caught: (" + e.getMessage() + ").");
	                return;    
	            }
	            System.out.println(0);  
	        }
	    }
		private Object makeObj(int i) {
			// TODO Auto-generated method stub
			return null;
		}
		public void PrintStackTrace() {
			// TODO Auto-generated method stub
			
		}
	    
	}

}
