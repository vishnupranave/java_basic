
public class MyFirstJavaProgram {
	/* This is a comment
	 * This program will print 'Hello World' and 'I am learning Java' as output.
	 */

	public static void main(String []args) {
	//We can use either String []args or String args[] in void main()
		
		System.out.println("Hello World!");
		System.out.println("I am learning Java!");
		// If i run the program without any argument, i will get an exception
		// So i added an if statement to check the length of arguments  
		if(args.length >0)
		{	//args[0] will print only the first argument.. 
			//System.out.println(args[0]);
			//To print all the argument
			for(String s :args)
				System.out.println(s);
		}
		
	}
}
