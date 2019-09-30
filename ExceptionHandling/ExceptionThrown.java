//code for showing how jvm moves through call stack to  find the correct exception handler;

 class ExceptionThrown{
 	public static int divideByZero (int a,int b){
 		int i=a/b;
 		return i;
 	}
 	//in the above method object of arithmetic exception is generated. jvm now moves through call stack in reverse order to
 	//find appropriate exception handler


 	public static int computeDiv(int a ,int b){

 		int res=0;
 		try{
 		res=divideByZero(a,b);
 		
 	}
 	catch(NumberFormatException e){ //not a  appropriate code handler as the exception type being handled is numberformat exception
 		System.out.println(e.getMessage());
 	}
 	return res;
 }

 public static void main(String[] args) {
 	int a=2;
 	int b=0;
 	try{
 		computeDiv(a,b);

 	}
 	catch(ArithmeticException al){ // appropriate code handler here  of arithmetic type; 
		System.out.println("Error is: "+al.getMessage()); 			
 	}
 }

 	}

 