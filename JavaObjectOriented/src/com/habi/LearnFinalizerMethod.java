package com.habi;
class FinalizerMethod{
	public FinalizerMethod() {
		System.out.println("Inside Constructior");
	}
	/* finalize is similar to destructor in C++
	 * Do not use finalize method because there is no guarantee of freeing resource 
	 * 
	 */
	@Override
	protected void finalize() throws Throwable {
		 try{
	            System.out.println("Finalize of Sub Class");
	            //release resources, perform cleanup ;
	        }catch(Throwable t){
	            throw t;
	        }finally{
	            System.out.println("Calling finalize of Super Class");
	            super.finalize();
	        }

	}
}

public class LearnFinalizerMethod {

	
	public static void main(String[] args) throws Throwable {
		FinalizerMethod fm =new FinalizerMethod();
		fm.finalize();
	}

}
